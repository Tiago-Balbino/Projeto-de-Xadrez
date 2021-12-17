package aplicatioon.chess.pieces.royal;

import aplicatioon.boardgame.Board;
import aplicatioon.chess.ChessPiece;
import aplicatioon.chess.TipoDeReino;

public class Dama extends ChessPiece {

    public Dama(Board board, TipoDeReino tipoDeReino){
        super(board, tipoDeReino);
    }

    public String toString (){
        return "D";
    }

}
