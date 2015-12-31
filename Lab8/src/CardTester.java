import java.util.Random;
 
public class CardTester
{
        public static void main (String args[]) {
                Random rand = new Random();
 
                // number of elements in NAMES constant of Deck
                int lastNameCnt = Deck.getNAMES().length;
                // number of elements in SUITS constant of Deck
                int lastSuitCnt = Deck.getSUITS().length;
 
                for (int i = 0; i < 20; i++) {
                        // generate next name - using NAMES from Deck class assures that
                        // name sent to Card constructor will be valid name String for Card
                        String name = ( Deck.getNAMES() )[ rand.nextInt( lastNameCnt ) ];
                        // generate next suit  -  using SUITS from Deck class assures that
                        // suit sent to Card constructor will be valid suit String for Card
                        String suit = ( Deck.getSUITS() )[ rand.nextInt( lastSuitCnt ) ];
                        // create new card
                        Card card = new Card( name, suit );
 
                        System.out.println( card.toString( ));
                }
        }
}