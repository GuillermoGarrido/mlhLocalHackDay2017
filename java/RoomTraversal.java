
package hackathon;
import java.util.Random;
import javax.swing.JOptionPane;

public class RoomTraversal 
{
   static Creature[] enemies;
   static Item[] treasere;
   
   public static void menu(User player, Room room)
   {
      boolean traverse = false;
      String[] options = room.getOptions();
      enemies = room.getEnemies();
      do
      {
          String selection = (String)JOptionPane.showInputDialog(null, room.getDescription(), room.getName(), JOptionPane.YES_NO_CANCEL_OPTION, null, options, null);
          
          switch(selection)
          {
             case "Go Forward":
                return;
          }
      }
      while(!traverse);
   }
   
   
}
