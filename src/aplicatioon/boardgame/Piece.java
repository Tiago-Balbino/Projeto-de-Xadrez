package aplicatioon.boardgame;

public class Piece { //classe peça que não sera mostrada para o usuario, que serve como base para a posição no tabuleiro;
    protected Position position;
    private Board board; // declaração do tabuleiro;

    public Piece(Board board){
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
