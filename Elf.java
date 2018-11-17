/**
 * A magical greature.
 * This creature has a 10% chance to do magical damage.
 * @author (Nicolas) 
 * @version (1)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Human
     */
    public Elf()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
          
    }
    
    public Elf(int str, int hp) {
           super(str, hp);
    }
    
    /**
     * 10% damage and twice damage 
     */
     public int damage() {
           int newdamage;
           newdamage = super.damage();
           
           if (Randomizer.nextInt(10)==0) {
               System.out.println("!!PUFF!!");
               newdamage *=2;
            }
           
            return newdamage;
    }
    
    
}

