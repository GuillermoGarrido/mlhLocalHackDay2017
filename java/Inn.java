

public class Inn extends Room
{
   InnKeeper keeper;
   
   public Inn(String name, int userLevel)
   {
      super(name, 1);
      keeper = new InnKeeper(userLevel);
   }
   
   public String getDescription()
   {
      String description = "There is small desk in the front of the room where a man stands"
              + "behind it. There are two other rooms with signs above them that "
              + "say '1' and '2'.";
      return description;
   }
   
   public InnKeeper getInnKeeper()
   {
      return keeper;
   }
}
