
import java.util.*;

public class game {

    public static ArrayList<Integer> cardNums = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16));
    public static ArrayList<ArrayList<card>> allHands = new ArrayList<ArrayList<card>>();
    public static ArrayList<ArrayList<album>> albumNums = new ArrayList<ArrayList<album>>();
    public static ArrayList<card> discardPile = new ArrayList<>();
    public static ArrayList<Integer> discardedCards = new ArrayList<>();
    public static ArrayList<Integer> gainedCards = new ArrayList<>();
    public static ArrayList<Integer> turnsDivorced = new ArrayList<>();
    public static ArrayList<Integer> turnsNotUsingCards = new ArrayList<>();
    public static ArrayList<Integer> turnsNotDrawingCards = new ArrayList<>();
    public static ArrayList<Integer> turnsNotEffected = new ArrayList<>();
    public static ArrayList<Boolean> waitProtection = new ArrayList<>();
    public static ArrayList<Integer> turnsBilly = new ArrayList<>();
    public static ArrayList<Integer> cardsBilly = new ArrayList<>();
    public static ArrayList<Double> empathy = new ArrayList<>();

    public static int random(int num1, int num2) { //Generates a random number between two values
        int num3 = (num2 - num1) + 1;
        int ran_num = (int) (Math.random() * num3) + num1;
        return ran_num;
    }

    public static void albumSetUp(int playerNum) {
        for (int i = 0; i < playerNum; i++) {
            albumNums.add(new ArrayList<>());
            for (int j = 1; j <= 8; j++) {
                albumNums.get(i).add(new album(j));
            }
        }
    }

    public static int intInput(String msg) { //Gets Integer User Input
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print(msg);
            int ret = scanner.nextInt();
            return ret;
        } catch (Exception e) {
            return 2;
        }
    }

    public static char charInput(String msg) { //Gets Character User Input
        Scanner scanner = new Scanner(System.in);

        System.out.print(msg);
        char ret = scanner.nextLine().charAt(0);
        //scanner.close();
        return ret;

    }

    public static void startCards(int playerNums) {
        for (int i = 0; i < playerNums; i++) {
            allHands.add(new ArrayList<card>());
        }

        for (int i = 0; i < allHands.size(); i++) {
            allHands.get(i).clear();
            for (int j = 0; j < 7; j++) {
                int randomNum = random(0, cardNums.size() - 1);
                allHands.get(i).add(new card(cardNums.get(randomNum)));
                cardNums.remove(randomNum);
                discardedCards.add(0);
                gainedCards.add(0);
                turnsDivorced.add(0);
                turnsNotUsingCards.add(0);
                turnsNotDrawingCards.add(0);
                turnsNotEffected.add(0);
                waitProtection.add(false);
                turnsBilly.add(0);
                cardsBilly.add(0);
                empathy.add(22.0);
            }
        }
    }

    public static void displayCards(int curPlayer) {
        for (int i = 0; i < allHands.get(curPlayer - 1).size(); i++) {
            System.out.println(i + 1 + ": " + allHands.get(curPlayer - 1).get(i));
        }
    }

    public static void displayAlbums(int curPlayer) {
        for (int i = 0; i < albumNums.get(curPlayer - 1).size(); i++) {
            System.out.println(i + 1 + ": " + albumNums.get(curPlayer - 1).get(i));
        }
    }

    public static card useCards(int curPlayer, String msg) {
        System.out.println("Your hand: ");
        displayCards(curPlayer);
        System.out.println();
        int usedCard = intInput(msg);
        int index = curPlayer - 1;
        if (usedCard > allHands.get(index).size() || usedCard <= 0){
            return new card(75);
        }
        return allHands.get(index).get(usedCard-1);
    }

    public static void viewRules() {
        System.out.println("First player to get empathy to zero wins. Your empathy represents the total amount of cards you can have in your hand. Each player starts with 8 cards and 21 empathy. You lose empathy by releasing an album, each album has different conditions to be released. Once you release all your albums you run out of empathy.");
    }

    public static void drawCards(int numOfCards, int playerNum) {
        for (int i = 0; i < numOfCards; i++) {
            int randomNum = random(0, cardNums.size() - 1);
            card addedCard = new card(cardNums.get(randomNum));
            allHands.get(playerNum).add(addedCard);
            cardNums.remove(randomNum);
            gainedCards.set(playerNum, gainedCards.get(playerNum) + 1);
            System.out.println("Drew " + addedCard);
        }
        System.out.println("Drew " + numOfCards + " cards");
    }

    public static void discardCards(int numOfCards, int playerNum) {
        if (waitProtection.get(playerNum)) {
            System.out.println("player " + (playerNum + 1) + " protected themselves");
        } else {
            for (int i = 0; i < numOfCards; i++) {
                System.out.println("Switch to player "+(playerNum+1));
                card depositChoice = useCards((playerNum + 1), "Which card will you deposit: ");
                allHands.get(playerNum).remove(depositChoice);
                discardPile.add(depositChoice);
                discardedCards.set(playerNum, discardedCards.get(playerNum) + 1);
                System.out.println("Deposited " + depositChoice);
            }
            turnsNotEffected.set(playerNum, 0);
            System.out.println("player " + (playerNum + 1) + " discarded " + numOfCards + " cards");
        }
    }

    public static void stealCard(int numOfCards, int targetPlayer, int gettingPlayer) {
        if (waitProtection.get(targetPlayer)) {
            System.out.println("player " + (targetPlayer + 1) + " protected themselves");
        } else {
            for (int i = 0; i < numOfCards; i++) {
                int randomNum = random(0, allHands.get(targetPlayer).size() - 1);
                card removedCard = allHands.get(targetPlayer).remove(randomNum);
                allHands.get(gettingPlayer).add(removedCard);
                discardedCards.set(targetPlayer, discardedCards.get(targetPlayer) + 1);
                gainedCards.set(gettingPlayer, gainedCards.get(gettingPlayer) + 1);
                System.out.println("Stole "+removedCard);

            }
            turnsNotEffected.set(targetPlayer, 0);
            System.out.println("Stole " + numOfCards + " cards");
        }
    }

    public static void increaseCounts(int playerNum) {
        turnsNotEffected.set(playerNum, turnsNotEffected.get(playerNum) + 1);
        waitProtection.set(playerNum, false);
        if (turnsDivorced.get(playerNum) != 0) {
            turnsDivorced.set(playerNum, turnsDivorced.get(playerNum) + 1);
        }

        if (turnsDivorced.get(playerNum) != 0) {
            turnsDivorced.set(playerNum, turnsDivorced.get(playerNum) + 1);
        }

        if (turnsBilly.get(playerNum) != 0) {
            turnsBilly.set(playerNum, turnsBilly.get(playerNum) + 1);
        }
    }

    public static boolean makeCards(card cardType, int playerNum) {
        int cardNum = cardType.getCardType();

        if (cardNum == 1) {
            turnsNotUsingCards.set(playerNum, 0);
            System.out.println("Drew 2 Cards");
            drawCards(2, playerNum);
            if (turnsDivorced.get(playerNum) == 0) {
                turnsDivorced.set(playerNum, 1);
            }
            System.out.println("You sent a fax to your wife");
            turnsDivorced.set(playerNum, 1);

        } else if (cardNum == 2) {
            turnsNotUsingCards.set(playerNum, 0);
            displayAlbums(playerNum+1);
            int albumRelease = intInput("Which album to release (number): ");
            if (albumRelease < albumNums.get(playerNum).size()){
                albumNums.get(playerNum).remove(albumRelease);
                empathy.set(playerNum, empathy.get(playerNum) / 1.3);
            }

        } else if (cardNum == 3) {
            turnsNotUsingCards.set(playerNum, 0);
            for (int i = 0; i < allHands.size(); i++) {
                discardedCards.set(i, discardedCards.get(i) + allHands.get(i).size());
            }

            startCards(0);
            for (int i = 0; i < allHands.size(); i++) {
                discardedCards.set(i, gainedCards.get(i) + allHands.get(i).size());
            }


        } else if (cardNum == 4) {
            turnsNotUsingCards.set(playerNum, 0);
            for (int i = 0; i < allHands.size(); i++) {
                if (i != playerNum) {
                    discardCards(1, i);
                }
            }

        } else if (cardNum == 5) {
            turnsNotUsingCards.set(playerNum, 0);
            if (allHands.get(playerNum).size() <= 3) {
                drawCards(6, playerNum);
            } else {
                System.out.println("Failed");
            }
        } else if (cardNum == 6) {
            turnsNotUsingCards.set(playerNum, 0);
            int depositPlayer = intInput("Which player to deposit: ");

            if (depositPlayer > allHands.size()) {
                depositPlayer = 1;
            }

            depositPlayer = depositPlayer - 1;
            discardCards(3, depositPlayer);

        } else if (cardNum == 7) {
            turnsNotUsingCards.set(playerNum, 0);
            //Implement using a shield list where each player represents an element in the list
            waitProtection.set(playerNum, true);
            System.out.println("Shielded");
        } else if (cardNum == 8) {
            turnsNotUsingCards.set(playerNum, 0);
            drawCards(3, playerNum);
        } else if (cardNum == 9) {
            turnsNotUsingCards.set(playerNum, 0);
            //Implement using amount of cards list similar to Against All Odds
            System.out.println("Number has been recorded");
            turnsBilly.set(playerNum, 1);
            cardsBilly.set(playerNum, allHands.get(playerNum).size());
        } else if (cardNum == 10) {
            turnsNotUsingCards.set(playerNum, 0);
            int depositPlayer = intInput("Which player to steal: ");
            if (depositPlayer > allHands.size()) {
                depositPlayer = 1;
            }
            depositPlayer = depositPlayer - 1;
            stealCard(2, depositPlayer, playerNum);

        } else if (cardNum == 11) {
            turnsNotUsingCards.set(playerNum, 0);
            int depositPlayer = intInput("Which player to look: ");
            if (depositPlayer > allHands.size()) {
                depositPlayer = 1;
            }
            depositPlayer = depositPlayer - 1;
            displayCards(depositPlayer+1);
        } else if (cardNum == 12) {
            turnsNotUsingCards.set(playerNum, 0);
            int depositPlayer1;
            int depositPlayer2;
            if (allHands.size() >= 3) {
                depositPlayer1 = intInput("Which player to steal: ");
                if (depositPlayer1 > allHands.size()) {
                    depositPlayer1 = 1;
                }
                depositPlayer1 = depositPlayer1 - 1;
                depositPlayer2 = intInput("Which player to steal: ");
                if (depositPlayer2 > allHands.size()) {
                    depositPlayer2 = 1;
                }
                depositPlayer2 = depositPlayer2 - 1;
                turnsNotEffected.set(depositPlayer1, 0);
                turnsNotEffected.set(depositPlayer2, 0);
            } else if (allHands.size() == 2) {
                int depositPlayer = intInput("Which player to steal: ");
                if (depositPlayer > allHands.size()) {
                    depositPlayer = 1;
                }
                depositPlayer = depositPlayer - 1;
                stealCard(2, depositPlayer, playerNum);

            }
        } else if (cardNum == 13) {
            turnsNotUsingCards.set(playerNum, 0);
            System.out.println("Two more turns");
            //Implement using a return statement literally just used for this card
            return true;
        } else if (cardNum == 14) {
            turnsNotUsingCards.set(playerNum, 0);
            discardCards(2, playerNum);
            drawCards(2, playerNum);
            turnsDivorced.set(playerNum, 1);
        } else if (cardNum == 15) {
            turnsNotUsingCards.set(playerNum, 0);
            int depositPlayer = intInput("Which player to deposit: ");
            if (depositPlayer > allHands.size()) {
                depositPlayer = 1;
            }
            depositPlayer = depositPlayer - 1;
            discardCards(3, depositPlayer);

        } else if (cardNum == 16) {
            turnsNotUsingCards.set(playerNum, 0);
            for (int i = 0; i < turnsDivorced.size(); i++) {
                turnsDivorced.set(i, 0);
            }
            System.out.println("All players failed their attempted divorces");
        } else {
            turnsNotUsingCards.set(playerNum, turnsNotUsingCards.get(playerNum) + 1);
        }
        return false;
    }

    public static void checkAlbumRelease(int playerNum) {
        System.out.println(albumNums.size());
        if (gainedCards.get(playerNum) >= 5) {
            for (int i = 0; i < albumNums.get(playerNum).size(); i++) {
                if (albumNums.get(playerNum).get(i).getAlbumType() == 8) {
                    System.out.println("Released Going Back");
                    albumNums.get(playerNum).remove(i);
                    empathy.set(playerNum, empathy.get(playerNum) / 1.3);
                    break;
                }
            }
        }

        if (discardedCards.get(playerNum) >= 5) {
            for (int i = 0; i < albumNums.get(playerNum).size(); i++) {
                if (albumNums.get(playerNum).get(i).getAlbumType() == 2) {
                    System.out.println("Released Hello, I Must be Going!");
                    albumNums.get(playerNum).remove(i);
                    empathy.set(playerNum, empathy.get(playerNum) / 1.3);
                    break;
                }
            }
        }

        if (allHands.get(playerNum).isEmpty()) {
            for (int i = 0; i < albumNums.get(playerNum).size(); i++) {
                if (albumNums.get(playerNum).get(i).getAlbumType() == 3) {
                    System.out.println("Released No Jacket Required");
                    albumNums.get(playerNum).remove(i);
                    empathy.set(playerNum, empathy.get(playerNum) / 1.3);
                    break;
                }
            }

            boolean canRelease = true;
            for (ArrayList<card> playerHand : allHands) {
                if (playerHand.size() > 4) {
                    canRelease = false;
                }
            }
            if (canRelease) {
                for (int i = 0; i < albumNums.get(playerNum).size(); i++) {
                    if (albumNums.get(playerNum).get(i).getAlbumType() == 5) {
                        System.out.println("Released Both Sides");
                        albumNums.get(playerNum).remove(i);
                        empathy.set(playerNum, empathy.get(playerNum) / 1.3);
                        break;
                    }
                }
            }
        }

        if (turnsNotEffected.get(playerNum) >= 3) {
            for (int i = 0; i < albumNums.get(playerNum).size(); i++) {
                if (albumNums.get(playerNum).get(i).getAlbumType() == 7) {
                    System.out.println("Released Testify");
                    albumNums.get(playerNum).remove(i);
                    empathy.set(playerNum, empathy.get(playerNum) / 1.3);
                    break;
                }
            }
        }

        if (turnsNotUsingCards.get(playerNum) >= 2) {
            for (int i = 0; i < albumNums.get(playerNum).size(); i++) {
                if (albumNums.get(playerNum).get(i).getAlbumType() == 4) {
                    System.out.println("Released …But Seriously");
                    albumNums.get(playerNum).remove(i);
                    empathy.set(playerNum, empathy.get(playerNum) / 1.3);
                    break;
                }
            }
        }

        if (turnsNotDrawingCards.get(playerNum) >= 6) {
            for (int i = 0; i < albumNums.get(playerNum).size(); i++) {
                if (albumNums.get(playerNum).get(i).getAlbumType() == 6) {
                    System.out.println("Released Dance into the light");
                    albumNums.get(playerNum).remove(i);
                    empathy.set(playerNum, empathy.get(playerNum) / 1.3);
                    break;
                }
            }
        }

        if (turnsDivorced.get(playerNum) >= 2) {
            for (int i = 0; i < albumNums.get(playerNum).size(); i++) {
                if (albumNums.get(playerNum).get(i).getAlbumType() == 1) {
                    System.out.println("Released Face Value");
                    albumNums.get(playerNum).remove(i);
                    empathy.set(playerNum, empathy.get(playerNum) / 1.3);
                    break;
                }
            }
        }
    }

    public static void checkEmpathy(int playerNum) {
        int empathyInt = empathy.get(playerNum).intValue();
        if (allHands.get(playerNum).size() > empathyInt) {
            System.out.println("Your total card amount is over your amount of empathy");
            discardCards(allHands.get(playerNum).size() - empathyInt, playerNum);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Phil Collins Card Game");
        boolean menu = true;
        while (menu) {
            int check = intInput("What do you want to do. \n 1. Start Game \n 2. View Rules \n: ");
            if (check == 1) {
                menu = false;
            } else if (check == 2) {
                viewRules();
            }
        }
        int playerNums = intInput("How many players? ");
        boolean gameDone = true;
        int winningPlayer = 0;
        albumSetUp(playerNums);
        startCards(playerNums);
        while (gameDone) {
            for (int i = 1; i <= allHands.size(); i++) {
                increaseCounts(i - 1);
                System.out.println("Player" + i + "'s turn");
                displayAlbums(i);
                checkEmpathy(i - 1);
                char yesNo = charInput("Do you want to draw a card (y/n): ");
                if (yesNo != 'n') {
                    drawCards(1, i - 1);
                    turnsNotDrawingCards.set(i - 1, 0);
                    checkEmpathy(i - 1);
                } else {
                    turnsNotDrawingCards.set(i - 1, turnsNotDrawingCards.get(i - 1) + 1);
                }
                card move = useCards(i, "Which card (number) (Press 0 for none): ");
                if (allHands.get(i - 1).contains(move)) {
                    boolean moreTurns = makeCards(move, i - 1);
                    discardPile.add(move);
                    allHands.get(i-1).remove(move);
                    checkEmpathy(i - 1);

                    if (moreTurns){
                        move = useCards(i, "Which card (number) (Press 0 for none): ");
                        if (allHands.get(i - 1).contains(move)) {
                            discardPile.add(move);
                            allHands.get(i-1).remove(move);
                            makeCards(move, i - 1);
                            checkEmpathy(i - 1);
                        }
                        move = useCards(i, "Which card (number) (Press 0 for none): ");
                        if (allHands.get(i - 1).contains(move)) {
                            discardPile.add(move);
                            allHands.get(i-1).remove(move);
                            makeCards(move, i - 1);
                            checkEmpathy(i - 1);
                        }
                    }

                    checkAlbumRelease(i - 1);
                    gainedCards.set(i - 1, 0);
                    discardedCards.set(i - 1, 0);
                } else {
                    turnsNotUsingCards.set(i - 1, turnsNotUsingCards.get(i - 1) + 1);
                }

                for (ArrayList<album> albumHand : albumNums) {
                    if (albumHand.isEmpty()) {
                        gameDone = false;
                        winningPlayer = i;
                    }
                }
            }

            for (card discardCard : discardPile) {
                cardNums.add(discardCard.getCardType());
            }

        }

        System.out.println("Player " + winningPlayer + " wins");
    }

}
