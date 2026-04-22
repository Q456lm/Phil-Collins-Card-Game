public class album {
    private int albumType;

    public album(int albumNum){
        albumType = albumNum;//Determines the type of album.
    }

    public int getalbumType(){
        return albumType;
    }

    public String toString(){
        if (albumType == 1){
            return "Face Value - Use a divorce triggering card and wait two turns.";
        }else if (albumType == 2){
            return "Hello, I Must be Going! - If your empathy >= 5 then deposit at least 5 cards in one turn, otherwise deposit all cards for your empathy in one turn i.e. 3 empathy = 3 cards deposited. Other people's turns count.";
        }else if (albumType == 3){
            return "No Jacket Required - Run Out Of Cards";
        }else if (albumType == 4){
            return "…But Seriously - Don’t use any cards for 2 turns";
        }else if (albumType == 5){
            return "Both Sides - If all the players have the same amount of cards you can make this album.";
        }else if (albumType == 6){
            return "Dance into the Light - Don’t Draw Cards for 5 turns";
        }else if (albumType == 7){
            return "Testify - Have no players affect you for two turns.";
        }else if (albumType == 8){
            return "Going Back - Gain 5 cards in one turn, even if you have to deposit the cards.";
        }else{
            return "Nothing - No Condition";
        }
    }
}
