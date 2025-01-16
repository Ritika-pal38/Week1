import java.util.Random;

public class CardGame {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int randomIndex = i + random.nextInt(n - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (numPlayers * cardsPerPlayer > deck.length) {
            System.out.println("Error: Not enough cards in the deck for the number of players and cards per player.");
            return null;
        }

        String[][] playerHands = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerHands[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }

        return playerHands;
    }

    public static void printPlayerHands(String[][] playerHands) {
        for (int i = 0; i < playerHands.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < playerHands[i].length; j++) {
                System.out.println(playerHands[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numPlayers = 2; // Example: 2 players
        int cardsPerPlayer = 5; // Example: 5 cards per player

        String[] deck = initializeDeck();
        String[] shuffledDeck = shuffleDeck(deck);
        String[][] playerHands = distributeCards(shuffledDeck, numPlayers, cardsPerPlayer);

        if (playerHands != null) {
            printPlayerHands(playerHands);
        }
    }
}