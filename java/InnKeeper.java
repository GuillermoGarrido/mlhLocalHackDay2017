
package hackathon;

public class InnKeeper 
{
   int innCost;
   
   public InnKeeper(int userLevel)
   {
      innCost = userLevel*5;
   }
   
   public String getIntro()
   {
      return "Welcome to the the Inn. The cost of one night's stay is " 
              + innCost + " gold pieces.";
   }
   
   //1 means he said yes (Stayed in Inn)
   //2 means said no (declined Inn).
   public String getOutro(int choice)
   {
      switch(choice)
      {
         case 1:
            return "Thank you for staying at the Inn!";
         case 2:
            return "Goodbye! Come again soon.";
      }
      
      return null;
   }
   
   public void stay(User player)
   {
      player.restoreHealth();
   }
}
