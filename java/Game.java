
package hackathon;
import java.io.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.*;

public class Game 
{
   private static User player;
   private final static String[] classes = new String[] {"Mage", "Paladin", "Rogue", "Tank"};
   
   public static void main(String[] args)
   {
      
      showMainMenu();
      startGame();
   }
   

   public static void showMainMenu() 
   {
      String name = null;
      String userClass = null;
      boolean cancelled;         
      String[] options = new String[] {"New Game", "Load Game", "Exit"};
      
      do
      {
         cancelled = false;
         int selection = JOptionPane.showOptionDialog(null, "Main Menu", "Hackathon RPG", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
         menu:
         switch(selection)
         {
            case 0:
               boolean correct = true;
               do
               {
                  correct = true;
                  name = (String)JOptionPane.showInputDialog(null, "Please Type Your Name", "Hackathon RPG", JOptionPane.PLAIN_MESSAGE);
                  if (name == null)
                  {
                     cancelled = true;
                     break menu;
                  }
                  else if(name.equals(""))
                  {
                     correct = false;
                  }
                  else
                  {
                     userClass = (String)JOptionPane.showInputDialog(null, "Please select a class", "Hackathon RPG", JOptionPane.PLAIN_MESSAGE, null, classes, classes[0]);
                     if (userClass == null)
                     {
                        cancelled = true;
                        break menu;
                     }
                  }
               }
               while(!correct);
               player = new User(name, userClass);
               break;
            case 1:
               Scanner load = null;
               try
               {
                  File loadGame = new File("loadfile.txt");
                  load = new Scanner(loadGame);
                  
                  name = load.next();
                  userClass = load.next();
                  int maxHealth = load.nextInt();
                  int currentHealth = load.nextInt();
                  int attack = load.nextInt();
                  int defense = load.nextInt();
                  int speed = load.nextInt();
                  int magic = load.nextInt();
                  int level = load.nextInt();
                  int strength = load.nextInt();
                  int totalxp = load.nextInt();
                  int startingLocation = load.nextInt();
                  int userWeapon = load.nextInt();
                  int userArmor = load.nextInt();
                  
                  User player = new User(name, userClass, maxHealth, currentHealth,
                           attack, defense, speed, magic, level, strength, totalxp,
                           startingLocation, userWeapon, userArmor);
               }
               catch (FileNotFoundException e)
               {
                  JOptionPane.showMessageDialog(null, "Load File Was Corrupted");
                  cancelled = true;
                  break menu;
               }
               catch (InputMismatchException e)
               {
                  JOptionPane.showMessageDialog(null, "Load File Was Corrupted");
                  cancelled = true;
                  break menu;
               }
               catch (NoSuchElementException e)
               {
                  JOptionPane.showMessageDialog(null, "Load File Was Corrupted");
                  cancelled = true;
                  break menu;
               }
               finally
               {
                  if (load != null)
                  {
                     load.close();
                  }
               }
               break;
            case 2:
               System.exit(0);
               
         }
      }
      while(cancelled);
      }
   
   
   
   
   public static void startGame()
   {
      int count = player.getStartingLocation();
      Room header = null;
      if (count == 0)
      {
         header = new StartingLocation();
      }
      else
      {
         header = new Cave(player, null);
      }
      
      while (count < 15)
      {
         RoomTraversal.menu(player, header);
         if (count % 6 == 0)
         {
            Room temp = new Inn(player, header);
            header.setNext(temp);
            header = header.getNext();
            count++;
         }
         else
         {
            Room temp = new Cave(player, header);
            header.setNext(temp);
            header = header.getNext();
            count++;
         }
      }

      
   }
   
   
   
   
   
}
   
   
   
   
   
   
   
   
   
   
   
   
//   //public static void showMenu()
//   {
//      String[] names = new String[] {"John", "Jason", "Fabio"};
//      JFrame frame = new JFrame("InputDialogue Example 1");
//      int name = JOptionPane.showOptionDialog(frame, "Waht's your name?", "Name Screen", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, names, names[0]);
//      System.out.println("The user's name is: " + name);
//      System.exit(0);
//   }

      //UIManager UI = new UIManager();
      //UI.put("OptionPane.background", Color.white);
     // UI.put("Panel.background", Color.white);