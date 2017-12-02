
package hackathon;

public class Dagger extends Weapon
{
   final int BASE_ATTACK = 8;
   final int BASE_MAGIC = 0;
   
   public Dagger(int strength)
   {      
      super(strength);
      itemNum = 3;
      switch(strength)
      {
         case 1:
            name = "Weak Dagger";
            break;
         case 3:
            name = "Thief's Dagger";
            break;
         case 6:
            name = "Assasin's Dagger";
            break;
      }
      description = "A small, sharp knife made of what seems to be harder than"
              + " diamonds.";
      magic = BASE_MAGIC;
      attack = BASE_ATTACK;
   }
   
}
