
package hackathon;

public class Weapon extends Item
{
   int strength;
   int attack;
   int magic;
           
   public Weapon(int strength)
   {
      this.strength = strength;
      consumable = false;
      equipable = true;
      cost = 20*strength;
      type = "Weapon";
   }
   
      
   public int getAttack()
   {
      return attack;
   }
   
   public int getMagic()
   {
      return magic;
   }
}
