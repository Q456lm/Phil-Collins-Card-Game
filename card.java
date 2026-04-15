public class card{
    private int cardType;

    public card(int cardNum){
        cardType = cardNum;//Determines the type of card.
    }

    public String toString(){
        if (cardType == 1){
            return "In The Air Tonight - Draw 2 song cards and start a divorce";
        }else if (cardType == 2){
            return "I Don’t Care Anymore - Release an album";
        }else if (cardType == 3){
            return "Take Me Home - All players deposit all cards and draw 5 new cards";
        }else if (cardType == 4){
            return "Another Day In Paradise - All Players except for you deposit one card.";
        }else if (cardType == 5){
            return "One More Night - If you have 2 cards or less (after using this card), draw 6 cards of any type.";
        }else if (cardType == 6){
            return "Easy Lover - Target One Player to Deposit Three Cards";
        }
    }
}