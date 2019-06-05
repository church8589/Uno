import java.util.ArrayList;

public class DiscardPile{
	
	private ArrayList<Card> discardPile;
	public Card topCard;

	public DiscardPile(){
		this.discardPile = new ArrayList<>();
	}
	//adds a card to the end of the discardPile array
	public void discardCard(Card card){
		this.discardPile.add(card);
	}
	//returns the card at the end of the array
	public Card peekTopCard(){
		int endOfArray = discardPile.size() - 1;
		topCard = this.discardPile.get(endOfArray);
		return topCard;
	}
}