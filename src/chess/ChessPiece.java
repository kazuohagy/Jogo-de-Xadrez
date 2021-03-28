package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	private Color color;
	public ChessPiece(Board board,Color colot) {
		super(board);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	public Color getColor() {
		return color;
	}
	

}
