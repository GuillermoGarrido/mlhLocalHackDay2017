package hackathon;

public class Inn extends Room
{
   InnKeeper keeper;
   
   public Inn(User player, Room prev)
   {
      super("Inn", 1, prev);
      keeper = new InnKeeper(player.getLevel());
      options = new String[] {"Talk To InnKeeper", "Go Forwartd"};
      description = "There is small desk in the front of the room where a man stands"
              + "behind it. There are two other rooms with signs above them that "
              + "say '1' and '2'.";
   }

   public InnKeeper getInnKeeper()
   {
      return keeper;
   }
}
