import java.util.ArrayList;
import java.util.*;

public class DrawPile{
	
	private ArrayList<Card> drawPile;
	public Card topCard;

	public DrawPile(){
		this.drawPile = new ArrayList<>();
		this.createActionCards();
		this.createRegularCards();
	}
	//creates the action cards used in drawPile array
	private void createActionCards(){

		for (int n = 0; n < 4; n++){
  			Card card = new Card();
  			card.setReverseAction();
  			this.drawPile.add(card);
		}

		for (int n = 0; n < 4; n++){
  			Card card = new Card();
  			card.setWildAction();
  			this.drawPile.add(card);
		}

		for (int n = 0; n < 4; n++){
  			Card card = new Card();
  			card.setWildFourAction();
  			this.drawPile.add(card);
		}

		for (int n = 0; n < 4; n++){
  			Card card = new Card();
  			card.setSkipAction();
  			this.drawPile.add(card);
		}

		for (int n = 0; n < 4; n++){
  			Card card = new Card();
  			card.setDrawAction();
  			this.drawPile.add(card);
		}
	}

	//creates the regular cards used in drawPile array
	private void createRegularCards(){

		for (int n = 1; n < 11; n++){
  			Card card = new Card();
  			card.setColor("red");
  			card.setValue(n);
  			this.drawPile.add(card);
		}

		for (int n = 1; n < 11; n++){
  			Card card = new Card();
  			card.setColor("green");
  			card.setValue(n);
  			this.drawPile.add(card);
		}

		for (int n = 1; n < 11; n++){
  			Card card = new Card();
  			card.setColor("blue");
  			card.setValue(n);
  			this.drawPile.add(card);
		}

		for (int n = 1; n < 11; n++){
  			Card card = new Card();
  			card.setColor("yellow");
  			card.setValue(n);
  			this.drawPile.add(card);
		}

	}
	
	//adds card to the end of the drawPile array
	public void pushCard(Card card){
		this.drawPile.add(card);
	}
	
	//removes and returns the card at the end of drawPile array
	public Card drawCard(){
		int endOfArray = drawPile.size() - 1;
		topCard = this.drawPile.get(endOfArray);
		this.drawPile.remove(topCard);
		return topCard;
	}

	//shuffles all of the Cards in the drawPile
	public void shuffle(){
		Collections.shuffle(this.drawPile);
	}

	/* this is code used for troubleshooting
	public void printOutDrawPile(){
		int cardCount = 1;
        for(Card str: this.drawPile){
        	System.out.print(cardCount);
        	System.out.println(str);        	
        	cardCount = cardCount + 1;
        }

        //System.out.println(this.drawPile);
        

	}

*/
}