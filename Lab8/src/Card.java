/*
 * Card holds minimal data to define state of a single card
 * in a Deck and public accessors to its private fields.
 */
 
public class Card
{
        // instance variables
        private String name;
        private String suit;
 
        private Deck myDeck = new Deck();
       
        // default constructor
        public Card() {
                this( "Ace", "Spades" );
        }
        // constructor
        public Card(String n, String s) {
                name = n;
                suit = s;
        }
 
        // accessors
        public int getPointValue() {
                Integer point = (Integer) myDeck.getCARDS( ).get( name + " of " + suit );
                return (null == point) ? -999 : point.intValue();
        }
        public String getName() {
                return name;
        }
        public String getSuit() {
                return suit;
        }
 
        public String toString() {
                return name + " of " + suit + " - worth " +
                        getPointValue() + " points";
        }
}