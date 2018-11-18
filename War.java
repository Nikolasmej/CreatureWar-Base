import java.util.ArrayList;
import java.util.Random;
/**
 * A basic creature war. Two armies figthing.
 * 
 * @author (Nicolas) 
 * @version (1)
 */
public class War extends Creature
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature> armyOne = new ArrayList <Creature>();
    private ArrayList<Creature> armyTwo = new ArrayList <Creature>();
    private Randomizer rand = new Randomizer();
    private int armySize;
    
    /**
     * Constructor for objects of class War
     * 
     */
     public War()
    {
        armySize=25;
        createArmy(armyOne);
        createArmy(armyTwo);
    }
    
    public War(int armySize )
    {
        this.armySize=armySize;
        createArmy(armyOne);
        createArmy(armyTwo);
    }
    
    /**
     * Deathmatch
     * 
     */
    public void Deathmatch(){
        while(armyOne.size()>0&&armyTwo.size()>0){
            fight(armyOne.get(0),armyTwo.get(0));
            if(!armyOne.get(0).isAlive()){
                armyOne.remove(0);
                System.out.println("ARMY ONE: MEN DOWN!");
            }
            if(!armyTwo.get(0).isAlive()){
                armyTwo.remove(0);                
                System.out.println("ARMY TWO: MEN DOWN!");
            }
        }
 
        if(armyOne.size()>armyTwo.size()){
            System.out.println("ARMY ONE IS THE WINNER");
        }
        else if(armyOne.size()<armyTwo.size()){
            
            System.out.println("ARMY TWO IS THE WINNER");
        }
        else{
            
            System.out.println("NOBODY WINS");
        }
   }
   
   /**
     * damage taken during fight.
     * 
     */
   private void fight(Creature warrior1, Creature warrior2){
       int warrior1Damage=warrior1.damage();
       int warrior2Damage=warrior2.damage();
       warrior1.takeDamage(warrior2Damage);
       warrior2.takeDamage(warrior1Damage);
    }
    
    /**
     * Set army
     * 
     */
    private void createArmy(ArrayList<Creature> army){
        int choice;
        for(int i=0;i<armySize;i++){
            choice=rand.nextInt(100);
            if(choice<30){
                army.add(new Human());
            }
            else if(choice<30){
                army.add(new Elf());
            }
            else if(choice<20){
                army.add(new Demon());
            }
            else if(choice<10){
                army.add(new CyberDemon());
            }
            else{
                army.add(new Balrog());
            }
        }
    }
}