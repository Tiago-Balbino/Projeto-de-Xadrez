package aplicatioon.chess;

import aplicatioon.boardgame.Board;
import aplicatioon.boardgame.BoardException;
import aplicatioon.boardgame.Piece;
import aplicatioon.boardgame.Position;
import aplicatioon.chess.pieces.paisExtrangeiro.*;
import aplicatioon.chess.pieces.royal.*;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        initialSetupWhite();
        initialSetupBlack();
    }

    public ChessPiece[][] getPieces(){ // metodo para definir a posição das pessas de xadrez no tabuleiro;
        ChessPiece[][] matriz = new ChessPiece[board.getLinhaTabuleiro()][board.getColunaTabuleiro()];
        for (int i = 0; i < board.getLinhaTabuleiro(); i++){
            for (int j = 0; j < board.getColunaTabuleiro(); j++ ){
                matriz[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return matriz;
    }

    public ChessPiece performChessMove(ChessPosition sourceposition, ChessPosition targetPosition){
        Position source = sourceposition.toPosition();
        Position target = targetPosition.toPosition();
        validateSourceposition(source);
        Piece capturedPiece = makeMove(source, target);
        return (ChessPiece) capturedPiece;
    }

    private Piece makeMove (Position source, Position target){
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(p, target);
        return capturedPiece;
    }

    private void validateSourceposition(Position position){
        if (!board.thereIsAPiece(position)){
            throw new BoardException("não existe peça nesta posição");
        }
    }

    private void placeNewPiece(char colunaPositionXadrez, int linhaPositionXadrez, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(colunaPositionXadrez, linhaPositionXadrez).toPosition());
    }

    private void initialSetupWhite(){
        placeNewPiece('a', 1, new Torre(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('h', 1, new Torre(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('b',1 , new Cavalo(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('g', 1, new Cavalo(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('c', 1, new Bispo(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('f', 1, new Bispo(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('e', 1, new Rei(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('d', 1, new Dama(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('a', 2, new Peao(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('b', 2, new Peao(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('c', 2, new Peao(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('d', 2, new Peao(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('e', 2, new Peao(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('f', 2, new Peao(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('g', 2, new Peao(board, TipoDeReino.FAMILIA_ROYAL));
        placeNewPiece('h', 2, new Peao(board, TipoDeReino.FAMILIA_ROYAL));
    }

    private void initialSetupBlack(){
        placeNewPiece('a', 8, new Monstro(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('h', 8, new Monstro(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('b',8 , new Assasino(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('g', 8, new Assasino(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('c', 8, new Inquisitor(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('f', 8, new Inquisitor(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('d', 8, new King(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('e', 8, new Queen(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('a', 7, new Servo(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('b', 7, new Servo(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('c', 7, new Servo(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('d', 7, new Servo(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('e', 7, new Servo(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('f', 7, new Servo(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('g', 7, new Servo(board, TipoDeReino.PAIS_ESTRANGEIRO));
        placeNewPiece('h', 7, new Servo(board, TipoDeReino.PAIS_ESTRANGEIRO));
    }

}

