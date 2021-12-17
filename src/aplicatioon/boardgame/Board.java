package aplicatioon.boardgame;

public class Board { // classe do tabuleiro

    private int linhaTabuleiro; // linhas do tabuleiro
    private int colunaTabuleiro; // colunas do tabuleiro
    private Piece[][] piecesTabuleiro; // matrix da peças onde sera armezenados as peças que ficaram no tabuleiro.

    public Board(int linhaTabuleiro, int colunaTabuleiro){ // construtor
        if (linhaTabuleiro < 1 || colunaTabuleiro < 1 ){
            throw new BoardException("erro de criação de tabuleiro: e preciso ter pelo menos uma linha e uma coluna");
        }

        this.linhaTabuleiro = linhaTabuleiro;
        this.colunaTabuleiro = colunaTabuleiro;
        piecesTabuleiro = new Piece[linhaTabuleiro][colunaTabuleiro];
    }

    public int getLinhaTabuleiro() {
        return linhaTabuleiro;
    }

    public void setLinhaTabuleiro(int linhaTabuleiro) {
        this.linhaTabuleiro = linhaTabuleiro;
    }

    public int getColunaTabuleiro() {
        return colunaTabuleiro;
    }

    public void setColunaTabuleiro(int colunaTabuleiro) {
        this.colunaTabuleiro = colunaTabuleiro;
    }

    public Piece piece(int linhas, int colunas){ // metodo para definir as peças, em relação a cordenada dela.
        if (!positionExistis(linhas, colunas)){
            throw new BoardException("posição inexistente");
        }
        return piecesTabuleiro[linhas][colunas];
    }

    public Piece piece(Position position){ // metodo para definir a posição das peças.
        if (!positionExistis(position)){
            throw  new BoardException("posição inexistente");
        }
        return piecesTabuleiro[position.getLinha()][position.getColuna()];
    }

    public void placePiece(Piece piece, Position position){ // metodo para colocar as peças no tabuleiro.
        if(thereIsAPiece(position)){
            throw  new BoardException("ja existe uma peça nessa posição");
        }
        piecesTabuleiro[position.getLinha()][position.getColuna()] = piece;
        piece.position = position;
    }

    public Piece removePiece(Position position){
        if(!positionExistis(position)){
            throw new BoardException("posição não existe no tabuleiro");
        }
        if (piece(position) == null){
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        piecesTabuleiro[position.getLinha()][position.getColuna()] = null;
        return aux;
    }

    private boolean positionExistis(int linha, int coluna){
        return linha >= 0 && linha < linhaTabuleiro && coluna >= 0 && coluna < colunaTabuleiro;
    }
    public boolean positionExistis(Position position){
        return positionExistis(position.getLinha(), position.getColuna());
    }
    public boolean thereIsAPiece(Position position){
        return piece(position) != null;
    }


}
