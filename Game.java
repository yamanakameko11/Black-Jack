
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Game
{
    int playerHand;
    int dealerHand;
    int dealercard1;
    int round;
    int win;
    int lose;
    public void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO BLACK JACK");
        PlayerHand();
        System.out.println("Do you want to hit? ENTER 'yes' or 'no'.");
        String hit = scanner.next();
        if () {
        }
        //WHILE LOOP
    }

    public void PlayerHand() {
        Card card1 = new Card();
        Card card2 = new Card();
        playerHand = card1.getCard() + card2.getCard();
        System.out.println("Player Hand: " + playerHand);
    }

    public void DealerHand() {
        Card card1 = new Card();
        Card card2 = new Card();
        dealerHand = card1.getCard() + card2.getCard();
        while (dealerHand <= 16) {
            Card hitCard = new Card();
            dealerHand += hitCard.getCard();
        }
    }

    public void HitCard() {
        if (playerHand <= 16) {
            Card hitCard = new Card();
            playerHand += hitCard.getCard();
            System.out.println("Current Player Hand: " + playerHand);
        } else {
            System.out.println("Player cannot hit.");
        }
    }

    public void CurrentPlayerHand() {
        System.out.println("Your current total is: " + playerHand);
    }

    public void End() {
        System.out.println("Dealer Total: " + dealerHand);
        System.out.println("Player Total: " + playerHand);
        if (playerHand > dealerHand) {
            System.out.println("Player Wins!");
            round++;
            win++;
        } else if( dealerHand > playerHand) {
            System.out.println("Dealer Wins!");
            round++;
            lose++;
        } else {
            System.out.println("It's a draw!");
        }
    }
}
