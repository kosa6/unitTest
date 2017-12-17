package domain;

public class Game {
	player player1;
	player player2;
	public player playerWhoPlay;
	public player playerWhoRest;
	Game(player player1, player player2){
		this.player1 = player1;
		this.player2 = player2;
		playerWhoPlay = this.player1;
		playerWhoRest = this.player2;
	}
	public void playGame() {
		while(player1.getPointsOfPlayer() != 0 && player2.getPointsOfPlayer() != 0) {
			changePlayer();
			playerWhoPlay.playerTurn();
		}
		System.out.println(playerWhoPlay.getName() + " won");
	}
	public void changePlayer() {
		player tempPlayer = playerWhoPlay;
		playerWhoPlay = playerWhoRest;
		playerWhoRest = tempPlayer;
	}
}
