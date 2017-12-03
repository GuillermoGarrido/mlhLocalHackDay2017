
package hackathon;

public class Sword extends Weapon
{
   final int BASE_ATTACK = 10;
   final int BASE_MAGIC = 0;
   
   public Sword(int strength)
   {
      super(strength);
      itemNum = 2;
      switch(strength)
      {
         case 1:
            name = "Weak Sword";
            break;
         case 3:
            name = "Adventurer's Sword";
            break;
         case 6:
            name = "Knight's Sword";
            break;
      }
      description = "A long, double edged sword with an embezled golden handle.";
      attack = BASE_ATTACK + (strength*3);
      magic = BASE_MAGIC;
   }
}
