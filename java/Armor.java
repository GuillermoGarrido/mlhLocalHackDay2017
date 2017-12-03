
package hackathon;

public class Armor extends Item
{
   int strength;
   int defense;
   int speed;
   
   public Armor(int strength)
   {
      this.strength = strength;
      consumable = false;
      equipable = true;
      cost = 25*strength;
      type = "Armor";
   }
   
   public int getDefense()
   {
      return defense;
   }
   
   public int getSpeed()
   {
      return speed;
   }
}
