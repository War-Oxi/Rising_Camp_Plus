public class Main {
	public static void main(String[] args) {
		GamingConsole marioGame = new MarioGame();
		marioGame.up();
		marioGame.down();
		marioGame.left();
		marioGame.right();

		GamingConsole chessGame = new ChessGame();
		chessGame.up();
		chessGame.down();
		chessGame.left();
		chessGame.right();
	}
}