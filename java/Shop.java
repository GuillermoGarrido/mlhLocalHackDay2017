package hackathon;

public class Shop extends Room
{
   
   ShopKeeper keeper;
   
   public Shop(String name, User player)
   {
      super(name, 1);
      keeper = new ShopKeeper(player.getLevel(), player.getUserClass(), player.getStrength());
   }
   
   public String getDescription()
   {
      String description = "At the end of a short room there is a man standing"
              + " behind a counter surrounded by metal bars to keep thieves from"
              + " entering behind him.";
      return description;
   }
   
   public ShopKeeper getShopKeeper()
   {
      return keeper;
   }
   
}
