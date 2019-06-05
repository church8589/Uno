
public class Player{
	Hand hand;
	
	public int playerNumber;
	private int score;
	public int scored;
	
	public Player(){
		this.hand = new Hand();
	}
	
	//checking to see if player has a playbale card in thier hand
	public boolean hasPlayableCard(Card card){
		boolean playableCard = hand.hasMatchingCard(card);
		return playableCard;
	}

	//Once established that they do have a playable card
	//this plays it
	public Card playCard(Card card){
		hand.getMatchingCard(card);
		return card;
	}
	
	//places a card into players hand
	public void drawCard(Card card){
		hand.addCard(card);
	}
	
	//counts the number of cards in a players hand
	public int countCardsInHand(Hand hand){
		int cards = hand.countCards();
		return cards;
	}

	//adds up the score of the cards in the players hand
	public int countScoreCards(){
		int cardValue = 0;
		for(int i = 0; i < this.hand.countCards(); i++) {
			cardValue = (this.hand.showCard(i).getValue());
			score = score + cardValue;
			if (this.hand.showCard(i).isAction()) {
				score = score + 10;
			}
			
		}
		return score;
	}
	
	//resets the score variable in the player class
	public void resetScore() {
		score = 0;
	}
}