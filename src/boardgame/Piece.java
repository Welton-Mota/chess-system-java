package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; //por padr�o o Java ja atribui o valor nulo a posi��o, adicionei para fins didaticos.
	}


	protected Board getBoard() {
		return board;
	}

	

}
