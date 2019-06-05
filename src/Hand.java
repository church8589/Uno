import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> handCards;

    public Hand() {
        this.handCards = new ArrayList<>();
    }

    //add card to hand
    public void addCard(Card card) {
        this.handCards.add(card);
    }
    
    //remove card from hand
    public void removeCard(Card card) {
        this.handCards.remove(card);
    }

    //check to see if matching card is in hand
    public boolean hasMatchingCard(Card card) {
        for (int i = 0; i < this.handCards.size(); i++){
            if (this.handCards.get(i).isMatch(card))
                return true;
        }
        return false;
    }

    //grab the matching card and return it
    public Card getMatchingCard(Card card) {
        for (int i = 0; i < this.handCards.size(); i++){
            Card currentCard = this.handCards.get(i);
            if (currentCard.isMatch(card)) {
            	this.handCards.remove(currentCard);
                return currentCard;
            }
        }
        return null;
    }

    //count the size of the hand
    public int countCards() {
        return this.handCards.size();
    }

    //remove all cards from hand
    public void clearHand() {
        this.handCards.clear();
    }
    
    //show particular card in hand
    public Card showCard(int number) {
    	return this.handCards.get(number);
    }
    
    //show entire hand to console
    public void printHand() {
    	for(int i = 0; i < handCards.size(); i++) {
    		String currentCard = handCards.get(i).printCard();
    		System.out.printf("%-12s", currentCard);
    	}
    	System.out.println("");
    	System.out.println("");
    }
}