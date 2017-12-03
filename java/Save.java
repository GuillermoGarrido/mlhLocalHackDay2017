
package hackathon;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Save 
{
   
   public static void saveGame(User player)
   {
      PrintWriter saveFile = null;
      try
      {
         saveFile = new PrintWriter("loadfile.txt");
         saveFile.println(player.getName());
         saveFile.println(player.getUserClass());
         saveFile.println(player.getMaxHealth());
         saveFile.println(player.getCurrentHealth());
         saveFile.println(player.getAttack());
         saveFile.println(player.getDefense());
         saveFile.println(player.getSpeed());
         saveFile.println(player.getMagic());
         saveFile.println(player.getLevel());
         saveFile.println(player.getStrength());
         saveFile.println(player.getTotalxp());
         saveFile.println(player.getStartingLocation());
         saveFile.println(player.getUserWeapon().getItemNum());
         saveFile.println(player.getUserArmor().getItemNum());
         
      }
      catch (FileNotFoundException e)
      {
         
      }
      finally
      {
         if (saveFile != null)
         {
            saveFile.close();
         }
      }
      
   }
}
