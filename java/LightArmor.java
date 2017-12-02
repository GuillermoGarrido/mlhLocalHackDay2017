


public class LightArmor extends Armor
{
   
   final int BASE_DEFENSE = 5;
   final int BASE_SPEED = 4;
   
   public LightArmor(int strength)
   {
      super(strength);
      itemNum = 7;
      switch(strength)
      {
         case 1:
            name = "Thief's Robes";
            description = "Light, leather clothing that createss almost no sound.";
            break;
         case 3:
            name = "Hidden Robes";
            description = "Silky smooth clothing as dark as night.";
            break;
         case 6:
            name = "Diamond Silk";
            description = "Strange pieces of silk from the orientals."
                    + " can obtain.";
            break;
      }
      
      defense = BASE_DEFENSE + (strength + 1);
      speed = BASE_SPEED + (strength + 3);
      
      
   }
   
}
