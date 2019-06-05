import java.io.*;

public class Uno{	
	public static void main(String[] args) throws IOException 
	{
		//create DrawPile, Deck and scoreBoard
		DrawPile deck = new DrawPile();
		DiscardPile discard = new DiscardPile();
		ScoreBoard scoreBoard = new ScoreBoard();
		
		//create all four players and add them to the scoreBoard
		Player playerOne = new Player();
		scoreBoard.addPlayer(playerOne);
		Player playerTwo = new Player ();
		scoreBoard.addPlayer(playerTwo);
		Player playerThree = new Player ();
		scoreBoard.addPlayer(playerThree);
		Player playerFour = new Player ();
		scoreBoard.addPlayer(playerFour);
		
		
		//shuffling newly created deck
		deck.shuffle();
		
		//placing top card of deck on the discard
		discard.discardCard(deck.drawCard());



		//Dealing seven cards to each of the four players
		for(int i =0; i < 7; i++) {
			playerOne.hand.addCard(deck.drawCard());
			playerTwo.hand.addCard(deck.drawCard());
			playerThree.hand.addCard(deck.drawCard());
			playerFour.hand.addCard(deck.drawCard());
		}
		
		
		//printing out each players hand
		System.out.println("PlayerOne hand");
		playerOne.hand.printHand();
		System.out.println("PlayerTwo hand");
		playerTwo.hand.printHand();
		System.out.println("PlayerThree hand");
		playerThree.hand.printHand();
		System.out.println("PlayerFour hand");
		playerFour.hand.printHand();
		
		
		
		
		
		
		
		
		//playerOne.hasPlayableCard(discard.peekTopCard());
		//if(playerOne.hasPlayableCard(discard.peekTopCard()))
		//	System.out.println("true");
		
		/*
		scoreBoard.addScore(playerOne, playerOne.countScoreCards());
		System.out.println(scoreBoard.showScore(playerOne));
		
		scoreBoard.addScore(playerTwo, playerTwo.countScoreCards());
		System.out.println(scoreBoard.showScore(playerTwo));

		scoreBoard.addScore(playerThree, playerThree.countScoreCards());
		System.out.println(scoreBoard.showScore(playerThree));
		
		scoreBoard.addScore(playerFour, playerFour.countScoreCards());
		System.out.println(scoreBoard.showScore(playerFour));
		
		*/
		//System.out.println(hand1.countCards());
		//deck.printOutDrawPile();



	}
}