import java.util.*;
public class ScoreBoard {
	
	private ArrayList<Player> scoreBoard;
	private Player winner;
	private int playerScored;
	
	public ScoreBoard() {
		this.scoreBoard = new ArrayList<Player>();
	}
	//adds Player to the scoreBoard array
	public void addPlayer(Player player) {
			this.scoreBoard.add(player);
		
	}
	//checks to see if there is a winner
	public boolean hasWinner() {
		for(int i = 0; i < this.scoreBoard.size(); i++) {
			if(this.scoreBoard.get(i).scored > 500)
				return true;
		}
		return false;
	}
	//used after hasWinner() to return the winning Player
	public Player getWinner() {
		for(int i = 0; i < this.scoreBoard.size(); i++) {
			if(this.scoreBoard.get(i).scored > 500)
				winner = this.scoreBoard.get(i);
	}
		return winner;
	}
	//adding score to individual player in scoreBoard
	public void addScore(Player player, int score) {
		for(int i = 0; i < this.scoreBoard.size(); i++)
			if(player == this.scoreBoard.get(i)) {
				this.scoreBoard.get(i).scored += score; 
			}
	}
	//shows the score of a particular player
	public int showScore(Player player) {
		for(int i = 0; i < this.scoreBoard.size(); i++) {
			if(player == this.scoreBoard.get(i))
				playerScored = this.scoreBoard.get(i).scored;
		}
		return playerScored;
	}
	
}

