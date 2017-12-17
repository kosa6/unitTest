package domain;

import java.util.Random;

public class player {
	private int points[] = {0,1,10,30,50};
	private final int pointsToWin = 301;
	private int pointsOfPlayer;
	private String name;
	
	player(String name){
		this.name = name;
		this.pointsOfPlayer = this.pointsToWin;
	}
	public boolean substrackPoints(int pointsToSubstrackt) {
		if(pointsOfPlayer - pointsToSubstrackt < 0 ) {
			return false;
		}
		else {
			pointsOfPlayer -= pointsToSubstrackt;
			return true;
		}
	}
	public boolean throwDart() {
		Random generator = new Random();
		int pointsOfThrow = points[generator.nextInt(points.length)];
		if(substrackPoints(pointsOfThrow)==false) {
			return false;
		}
		return true;
	}
	public void playerTurn() {
		for(int i=0; i<3; i++) {
			if(this.throwDart() == false) {
				break;
			}
		}
	}
	public String getName() {
		return name;
	}
	public int getPointsOfPlayer() {
		return this.pointsOfPlayer;
	}
}
