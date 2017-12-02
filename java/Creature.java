
package hackathon;

public class Creature 
{
   String name;
   int maxHealth;
   int currentHealth;
   int attack;
   int defense;
   int speed;
   int magic;
   int xp;
   
   Move[] moves;
   
   public Creature(int maxHealth, int attack, int defense, int speed, int magic, 
           int xp)
   {
      this.maxHealth = maxHealth;
      this.attack = attack;
      this.defense = defense;
      this.speed = speed;
      this.magic = magic;
      this.xp = xp;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getMaxHealth()
   {
      return maxHealth;
   }
   
   public int getCurrentHealth()
   {
      return currentHealth;
   }
   
   public int getAttack()
   {
      return attack;
   }
   
   public int getDefense()
   {
      return defense;
   }
   
   public int getSpeed()
   {
      return speed;
   }
   
   public int getMagic()
   {
      return magic;
   }
   
   public int  getXP()
   {
      return xp;
   }

   public Move[] getMoves() {
      return moves;
   }
   
}
