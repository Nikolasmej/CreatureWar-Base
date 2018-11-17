/**
 * A demonic greature.
 * This creature has a 5% chance to do magical damage.
 * @author (Nicolas) 
 * @version (1)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DEMON_HP = 120;
    private static final int MIN_DEMON_HP = 50;
    private static final int MAX_DEMON_STR = 55;
    private static final int MIN_DEMON_STR = 25;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
          
    }
    
    public Demon(int str, int hp) {
           super(str, hp);
    }
    
    /**
     * 20 points or 5% damage and +50 new damage 
     * 
     */
     public int damage() {
           int newdamage;
           newdamage = super.damage();
           
           if (Randomizer.nextInt(20)==0) {
               System.out.println("!!DEMON!!");
               newdamage +=50;
            }
           
            return newdamage;
    }
    
    
}
