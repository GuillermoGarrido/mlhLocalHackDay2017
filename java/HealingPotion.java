
package hackathon;

public class HealingPotion extends Consumable
{
   
   public HealingPotion()
   {
      super();
      name = "Healing Potion";
      description = "A potion that lightly heals you.";
      health = 10;
      type = "Healing";
      cost = 15;
      itemNum = 9;
   }

}
