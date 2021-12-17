package aplicatioon.chess.pieces.royal;

import aplicatioon.boardgame.Board;
import aplicatioon.chess.ChessPiece;
import aplicatioon.chess.TipoDeReino;

public class Cavalo extends ChessPiece {

    public Cavalo(Board board, TipoDeReino tipoDeReino){
        super(board, tipoDeReino);
    }

    public String toString(){
        return "C";
    }
}
