package aplicatioon.chess;

import aplicatioon.boardgame.Position;

public class ChessPosition {

    private char colunaPositionXadrez;
    private int linhaPositionXadrez;

    public ChessPosition(char colunaPositionXadrez, int linhaPositionXadrez){
        if (linhaPositionXadrez < 1 || linhaPositionXadrez > 8 && colunaPositionXadrez < 'a' || colunaPositionXadrez > 'h' ){
            throw new ChessException("erro a instanciar a posição. valores validos linha: 1 a 8, coluna: A a H");
        }

        this.colunaPositionXadrez = colunaPositionXadrez;
        this.linhaPositionXadrez = linhaPositionXadrez;
    }

    public char getColunaPositionXadrez() {
        return colunaPositionXadrez;
    }

    public int getLinhaPositionXadrez() {
        return linhaPositionXadrez;
    }

    protected Position toPosition(){
        return new Position(8 - linhaPositionXadrez, colunaPositionXadrez - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getColuna()), 8 - position.getLinha());
    }

    @Override
    public String toString(){
        return "" + colunaPositionXadrez + linhaPositionXadrez;
    }

}
