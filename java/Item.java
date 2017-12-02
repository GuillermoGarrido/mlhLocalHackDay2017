
package hackathon;

public abstract class Item 
{
   String name;
   String description;
   String type;
   int cost;
   int itemNum;
   boolean consumable;
   boolean equipable;
   
   
   public String getName()
   {
      return name;
   }
   
   public String getDescription()
   {
      return description;
   }
   
   public boolean getConsumable()
   {
      return consumable;
   }
   
   public boolean getEquipable()
   {
      return equipable;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public int getCost()
   {
      return cost;
   }
   
   public String getType()
   {
      return type;
   }

   public int getItemNum() {
      return itemNum;
   }
   
   
}
