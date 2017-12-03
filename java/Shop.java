package hackathon;

public class Shop extends Room
{
   
   ShopKeeper keeper;
   
   public Shop(String name, User player, Room prev)
   {
      super(name, 1, prev);
      options = new String[] {"Talk To StoreKeeper", "Go Forward"};
      keeper = new ShopKeeper(player.getLevel(), player.getUserClass(), player.getStrength());
      description = "At the end of a short room there is a man standing"
              + " behind a counter surrounded by metal bars to keep thieves from"
              + " entering behind him."; 
   }
   
   public ShopKeeper getShopKeeper()
   {
      return keeper;
   }
   
}
