
package hackathon;

public class Staff extends Weapon
{
   final int BASE_MAGIC = 10;
   final int BASE_ATTACK = 1;
   
   public Staff(int strength)
   {
      super(strength);
      itemNum = 1;
      switch(strength)
      {
         case 1:
            name = "Weak Staff";
            break;
         case 3:
            name = "Wonderer's Staff";
            break;
         case 6:
            name = "Master Staff";
            break;
      }
      
      description = "A long wooden cane with a white transparent orb on top.";
      
      magic = BASE_MAGIC + (strength* 3);
      attack = BASE_ATTACK + (strength);
   }
}
