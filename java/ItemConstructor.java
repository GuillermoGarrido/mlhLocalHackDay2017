
package hackathon;

public class ItemConstructor 
{
   public static Item generateItem(int number, int strength)
   {
      switch(number)
      {
         case 1:
            return new Staff(strength);
         case 2:
            return new Sword(strength);
         case 3:
            return new Dagger(strength);
         case 4:
            return new Shield(strength);
         case 5:
            return new Cloak(strength);
         case 6:
            return new Chainmail(strength);
         case 7:
            return new LightArmor(strength);
         case 8:
            return new HeavyArmor(strength);
         case 9:
            return new HealingPotion();
         case 10:
            return new GreaterHealingPotion();
         case 11:
            return new GreatRestore();
      }
      
      
      return null;
   }
}
