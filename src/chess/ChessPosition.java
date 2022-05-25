package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
//formula geral linha:  a linha da matrix_row = 8 - chess_rows
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
//formula geral coluna: a coluna da matrix_ column = chess_column - 'a'
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row; //string vazio macete para concatenar automatico para forçar o compilador a entender.
	}

}
