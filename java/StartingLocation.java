
package hackathon;

public class StartingLocation extends Room
{
   
   public StartingLocation()
   {
      super("Start", 1, null);
      options = new String[] {"Go Forward"};
      description = "You wake up in a dark room. The floor is stone and the walls"
              + " are made of uneven cavern walls. All you can see is way to go"
              + " infront of you.";
   }

}
