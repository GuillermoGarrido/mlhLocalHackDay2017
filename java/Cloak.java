

public class Cloak extends Armor
{
   final int BASE_DEFENSE = 2;
   final int BASE_SPEED = 1;
   
   public Cloak(int strength)
   {
      super(strength);
      itemNum = 5;
      switch(strength)
      {
         case 1:
            name = "Dark Cloak";
            description = "A cloack made from the silk of the black worms.";
            break;
         case 3:
            name = "Gray Shadow";
            description = "A lightly shaded cloak from the east.";
            break;
         case 6:
            name = "Wizard's Garnments";
            description = "They say the great Wizard of the Northern mountains "
                    + "used to wear this.";
            break;
      }
      
      defense = BASE_DEFENSE + (strength);
      speed = BASE_SPEED + (strength);
   }
   
}
