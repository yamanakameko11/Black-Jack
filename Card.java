
/**
 * Makes object. Object returns random int 1-11, and can return private int for other class to reference.
 * 
 * @author Kameko Yamanaka
 * @version 9.29.17
 */
import java.lang.Math;
public class Card
{
    private int card;
    public Card () {
        card = (int)((Math.random() * 11) + 1);
    }
    
    public int getCard() {
        return card;
    }
}
