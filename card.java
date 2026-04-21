public class card{
    private int cardType;

    public card(int cardNum){
        cardType = cardNum;//Determines the type of card.
    }

    public int getCardType(){
        return cardType;
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
        }else if (cardType == 7){
            return "Against All Odds - Stop the effects against you for all other cards on this turn.";
        }else if (cardType == 8){
            return "Sussudio - Draw 3 cards of any type";
        }else if (cardType == 9){
            return "Don’t Lose My Number - However many cards are in your hand when you use this card if how many cards must be in your hand after 2 turns.";
        }else if (cardType == 10){
            return "I Wish It Would Rain Down - Pick a Player and Steal one of their album cards";
        }else if (cardType == 11){
            return "Do You Remember? - Look at another player's cards then next turn steal one of their song cards.";
        }else if (cardType == 12){
            return "Two Hearts - If Players > 2: Pick 2 Players and Steal 1 song Card from each of them. If only 2 players: Steal 2 cards from the other player";
        }else if (cardType == 13){
            return "You Can’t Hurry Love - You can use 2 cards this turn after this.";
        }else if (cardType == 14){
            return "That’s All - Deposit 2 song cards and draw 2 new song cards and start a divorce";
        }else if (cardType == 15){
            return "I Can’t Dance - Pick another player to deposit 3 song cards";
        }else if (cardType == 16){
            return "Invisible Touch - Stops Divorces";
        }
        else{
            return "Nothing - It Signify That There is a Logic Error in my code";
        }
    }
}