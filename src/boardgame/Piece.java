package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; //por padrão o Java ja atribui o valor nulo a posição, adicionei para fins didaticos.
	}


	protected Board getBoard() {
		return board;
	}

	

}
