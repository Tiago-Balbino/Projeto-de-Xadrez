package aplicatioon.chess.pieces.royal;

import aplicatioon.boardgame.Board;
import aplicatioon.chess.ChessPiece;
import aplicatioon.chess.TipoDeReino;

public class Torre extends ChessPiece {

    public  Torre(Board board, TipoDeReino tipoDeReino){
        super(board, tipoDeReino);
    }

    @Override
    public  String toString(){
        return "T";
    }



}
