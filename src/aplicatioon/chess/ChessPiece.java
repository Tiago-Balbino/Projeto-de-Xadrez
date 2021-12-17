package aplicatioon.chess;

import aplicatioon.boardgame.Board;
import aplicatioon.boardgame.Piece;

public class ChessPiece extends Piece { // Classe de peças do xadrez
    private TipoDeReino tipoDeReino;

    public ChessPiece(Board board, TipoDeReino tipoDeReino){
        super(board);
        this.tipoDeReino = tipoDeReino;
    }

    public TipoDeReino getColor() {
        return tipoDeReino;
    }
}

