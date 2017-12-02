
public class Chainmail extends Armor
{
   final int BASE_DEFENSE = 9;
   final int BASE_SPEED = 1;
   
   public Chainmail(int strength)
   {
      super(strength);
      itemNum = 6;
      switch(strength)
      {
         case 1:
            name = "Rusted Chainmail";
            description = "Used chainmail most likely found under a bridge.";
            break;
         case 3:
            name = "Shiny Chainmail";
            description = "Silver chainmail with a light shine to it.";
            break;
         case 6:
            name = "Royal Chainmail";
            description = "This is the armor that only the King's Royal Guards"
                    + " can obtain.";
            break;
      }
      
      defense = BASE_DEFENSE + ((strength*3)/2);
      speed = BASE_SPEED + (strength);
   }
   
}
