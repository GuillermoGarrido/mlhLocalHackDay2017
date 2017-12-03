
package hackathon;

public class Cave extends Room
{
   public Cave(User player, Room prev)
   {
      super("Cave", 2, prev);
      options = new String[] {"Go Forward", "Look Around", "Walk"};
      
      enemies = new Creature[] {new GiantSpider(player.getLevel())};
      
   }
   
   
}
