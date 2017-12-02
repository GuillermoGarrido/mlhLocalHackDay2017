

public class Consumable extends Item
{
   int health;
      
   public Consumable()
   {
      consumable = true;
      equipable = false;
   }
   
   public int getHealth()
   {
      return health;
   }
}
