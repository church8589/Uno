public class Card {
    private String color = "black";
    private int value = 0;
    private boolean isWildAction, isWildFourAction, isReverseAction, isDrawAction, isSkipAction;

    public Card() { }

    public Card(String color, int value) {
        this.color = color;
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }
    
    public boolean isMatch(Card card) {
        return (this.color.equals(card.color) || this.value == card.value);
    }

    public boolean isAction() {
        return (isWildAction || isWildFourAction || isReverseAction || isDrawAction || isSkipAction);
    }

    public boolean isReverse() {
        return isReverseAction;
    }

    public void setReverseAction() {
        isReverseAction = true;
    }

    public boolean isWild() {
        return isWildAction;
    }

    public void setWildAction() {
        isWildAction = true;
    }

    public boolean isWildFour() {
        return isWildFourAction;
    }

    public void setWildFourAction() {
        isWildFourAction = true;
    }

    public boolean isDraw() {
        return isDrawAction;
    }

    public void setDrawAction() {
        isDrawAction = true;
    }

    public boolean isSkip() {
        return isSkipAction;
    }

    public void setSkipAction() {
        isSkipAction = true;
    }
    
    public String printCard() {
    	int value1 = getValue();
    	String color1 = getColor();
    	String cardValue = "";
    	if(value1 < 1) {
    		if(isReverse()) {
    			cardValue = "Reverse";
    			return cardValue;
    		}
    		else if(isWild()) {
    			cardValue = "Wild";
    			return cardValue;
    		}
    		else if(isWildFour()) {
    			cardValue = "WildFour";
    			return cardValue;
    		}
    		else if(isDraw()) {
    			cardValue = "Draw";
    			return cardValue;
    		}
    		else if(isSkip()) {
    			cardValue = "Skip";
    			return cardValue;
    		}
    		
    		}
    	else {
			cardValue = color1.toUpperCase() + "-" +value1;
	    	
    	}
    	return cardValue;
    	
    	
    	
    }
}
