package hackathon;

public class Move 
{
   String name;
   String description; 
   String type;
   int attack;
   int magic;
   int health;
   int accuracy;
   boolean multiUse;
  

   public int getAttack() {
      return attack;
   }

   public String getDescription() {
      return description;
   }

   public int getMagic() {
      return magic;
   }

   public String getName() {
      return name;
   }

   public int getHealth() {
      return health;
   }

   public String getType() {
      return type;
   }

   public int getAccuracy() {
      return accuracy;
   }
   
   
}
