


public class ShopKeeper 
{
   int strength;
   int userLevel;
   String userClass;
   String type;
   
   public ShopKeeper(int userLevel, String userClass, int userStrength)
   {
      this.strength = userStrength;
      this.userLevel = userLevel;
   }  
   
   
   public String getIntro()
   {
      return "Hello. Welcome to my shop. Would you like to shop?";
   }
   
   public String getOutro()
   {
      return "Thank you come again.";
   }
   
   public Item[] getWares()
   {
      Item[] items = new Item[3];
      switch(userClass)
      {
         case "Mage":
            Staff staff = new Staff(strength);
            Cloak cloak = new Cloak(strength);
            items[0] = staff;
            items[1] = cloak;
            break;
         case "Paladin":
            Sword sword = new Sword(strength);
            Chainmail chain = new Chainmail(strength);
            items[0] = sword;
            items[1] = chain;
            break;
         case "Rogue":
            Dagger dagger = new Dagger(strength);
            LightArmor light = new LightArmor(strength);
            items[0] = dagger;
            items[1] = light;
            break;            
         case "Tank":
            Shield shield = new Shield(strength);
            HeavyArmor heavy = new HeavyArmor(strength);
            items[0] = shield;
            items[1] = heavy;
            break;
      }
      switch(strength)
      {
         case 1:
            HealingPotion heal = new HealingPotion();
            items[2] = heal;
            break;
         case 3:
            GreaterHealingPotion heal2 = new GreaterHealingPotion();
            items[2] = heal2;
            break;
         case 6:
            GreatRestore heal3 = new GreatRestore();
            items[2] = heal3;
            break;
      }
      return items;
   }

}
