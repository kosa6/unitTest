package domain;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

public class GameTest {
	player player1;
	player player2;
	Game game;
	
	@Before
	public void initTest() {
		player1 = new player("Debil");
		player2 = new player("Zdzislaw");
		game = new Game(player1,player2);
	}
	
	@Test
	public void cheangePlayer() {
		game.changePlayer();
		assertEquals(game.playerWhoPlay , player2);
		assertEquals(game.playerWhoRest , player1);
		game.changePlayer();
		assertEquals(game.playerWhoPlay , player1);
		assertEquals(game.playerWhoRest , player2);
	}
	
	@Test
	public void testGame() {
		assertNotNull(game);
		game.playGame();
		assertEquals(game.playerWhoPlay.getPointsOfPlayer() , 0);
	}

}
