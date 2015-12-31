import java.util.Hashtable;
 
public class Exercise_8
{
        private static final String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };
        private static final String[] NAMES = {
                "Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Jack", "Queen", "King"
        };
        private static final int[] POINTS = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10
        };
        private static final Hashtable<String, Integer> CARDS =
                new Hashtable<String, Integer>();
 
        // constructor - loads CARDS Hashtable
        public Exercise_8() {
                int lastI = NAMES.length;
                int lastJ = SUITS.length;
                for (int i = 0; i < lastI; i++) {
                        for (int j = 0; j < lastJ; j++) {
                                String key = NAMES[ i ] + " of " + SUITS[ j ];
                                Integer value = new Integer( POINTS[ i ]);
                                CARDS.put( key, value);
                        }
                }
        }
 
        public static String[] getNAMES() {
                return NAMES;
        }
 
        public static String[] getSUITS() {
                return SUITS;
        }
 
        public Hashtable<String, Integer> getCARDS() {
                return CARDS;
        }
}