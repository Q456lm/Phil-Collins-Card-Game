import java.util.*;

public class game{

    public static ArrayList<Integer> cardNums = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16));
    public static ArrayList<ArrayList<card>> allHands = new ArrayList<ArrayList<card>>();
    public static ArrayList<card> discardPile = new ArrayList<>();

    public static int random(int num1,int num2){ //Generates a random number between two values
        int num3=(num2-num1)+1;
        int ran_num = (int) (Math.random()*num3)+num1;
        return ran_num;
    }

    public static int intInput(String msg){ //Gets Integer User Input
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print(msg);
            int ret = scanner.nextInt();
            return ret;
        }catch(Exception e){
            return 2; 
        }
    }

    public static void startCards(int playerNums){
        for (int i = 0; i < playerNums; i++){
            allHands.add(new ArrayList<card>());
        }


        for (int i = 0; i < allHands.size(); i++){
            allHands.get(i).clear();
            for (int j = 0; j < 7; j++){
                int randomNum = random(0, cardNums.size()-1);
                allHands.get(i).add(new card(cardNums.get(randomNum)));
                cardNums.remove(randomNum);
            }
        }
    }

    public static void displayCards(int curPlayer){
        for (int i = 0; i < allHands.get(curPlayer-1).size(); i++){
            System.out.println(i+1 + ": "+ allHands.get(curPlayer-1).get(i));
        }
    }

    public static card useCards(int curPlayer, String msg){
        System.out.println("Your hand: ");
        displayCards(curPlayer);
        System.out.println();
        int usedCard = intInput(msg);
        return allHands.get(curPlayer-1).get(usedCard);
    }

    public static void viewRules(){
        System.out.println("First player to get empathy to zero wins. Your empathy represents the total amount of cards you can have in your hand. Each player starts with 8 cards and 21 empathy. You lose empathy by releasing an album, each album has different conditions to be released. Once you release all your albums you run out of empathy.");
    }

    public static void drawCards(int numOfCards, int playerNum){
        for (int i = 0; i < numOfCards; i++){
            int randomNum = random(0, cardNums.size()-1);
            allHands.get(playerNum).add(new card(cardNums.get(randomNum)));
            cardNums.remove(randomNum);
        }
    }

    public static void discardCards(int numOfCards, int playerNum){
        for (int i = 0; i < numOfCards; i++){
            card depositChoice = useCards(i,"Which card will you deposit: ");
            allHands.get(playerNum).remove(depositChoice);
            discardPile.add(depositChoice);
        }
    }

    public static void stealCard(int numOfCards, int targetPlayer, int gettingPlayer){
        for (int i = 0; i < numOfCards; i++){
            int randomNum = random(0, allHands.get(targetPlayer).size()-1);
            card removedCard = allHands.get(targetPlayer).remove(randomNum);
            allHands.get(gettingPlayer).add(removedCard);
        }
    }

    public static void makeCards(card cardType, int playerNum){
        int cardNum = cardType.getCardType();
        if (cardNum == 1){
            System.out.println("Drew 2 Cards");
            drawCards(2, playerNum);
        }else if (cardNum == 2){

        }else if (cardNum == 3){
            startCards(0);
        }else if (cardNum == 4){
            for (int i = 1; i <= allHands.size(); i++){
                if (i != playerNum){
                    discardCards(1,i);
                }
            }
        }else if (cardNum == 5){
            if (allHands.get(playerNum).size() <= 3){
                drawCards(6, playerNum);
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Welcome to Phil Collins Card Game");
        boolean menu = true;
        while (menu){
            int check = intInput("What do you want to do. \n 1. Start Game \n 2. View Rules \n: ");
            if (check == 1){
                menu = false;
            }else if (check == 2){
               viewRules();
            }
        }
        int playerNums = intInput("How many players? ");
        startCards(playerNums);
        for (int i = 1; i <= allHands.size(); i++){
            card move = useCards(i,"Which card: ");
        }
    }


}
