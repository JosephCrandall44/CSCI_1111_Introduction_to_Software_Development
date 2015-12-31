public class CardTester2
{
        public static void main (String args[]) {
                // last index position in NAMES constant of Deck
                int lastNameIdx = Deck.getNAMES().length - 1;
                // last index position in SUITS constant of Deck
                int lastSuitIdx = Deck.getSUITS().length - 1;
 
                for (int i = 0; i < 20; i++) {
                        // generate next name - using NAMES from Deck class assures that
                        // name sent to Card constructor will be valid name String for Card
                        String name = ( Deck.getNAMES() )[ getRandom( lastNameIdx ) ];
                        // generate next suit  -  using SUITS from Deck class assures that
                        // suit sent to Card constructor will be valid suit String for Card
                        String suit = ( Deck.getSUITS() )[ getRandom( lastSuitIdx ) ];
                        // create new card
                        Card card = new Card( name, suit );
 
                        System.out.println( card.toString( ));
                }
        }
       
        public static int getRandom( int max ) {
                return getRandom( 0, max );
        }
        public static int getRandom(int min, int max ) {
                return min + (int)(Math.random() * ((max - min) + 1));
        }
}