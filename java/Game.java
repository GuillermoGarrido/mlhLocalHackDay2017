

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;

public class Game 
{
   private static User player;
   private final static String[] classes = new String[] {"Mage", "Paladin", "Rogue", "Tank"};
   
   public static void main(String[] args)
   {
      showMenu();
   }
   

   public static void showMenu() 
   {

     
      
      boolean cancelled;
      menu:
      do
      {
         cancelled = false;
         String[] options = new String[] {"New Game", "Load Game", "Exit"};
         int selection = JOptionPane.showOptionDialog(null, "Main Menu", "Hackathon RPG", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
         
         switch(selection)
         {
            case 0:
               boolean correct = true;
               do
               {
                  correct = true;
                  String name = (String)JOptionPane.showInputDialog(null, "Please Type Your Name", "Hackathon RPG", JOptionPane.PLAIN_MESSAGE);
                  if (name == null)
                  {
                     break menu;
                  }
                  else if(name.equals(""))
                  {
                     correct = false;
                  }
                  else
                  {
                     String userClass = (String)JOptionPane.showInputDialog(null, "Please select a class", "Hackathon RPG", JOptionPane.PLAIN_MESSAGE, null, classes, classes[0]);
                     if (userClass == null)
                     {
                        break menu;
                     }
                  }
               }
               while(!correct);
            case 2:
               try
               {
                  File loadGame = new File("loadfile.txt");
                  Scanner load = new Scanner(loadGame);
                  
                  String name = load.next();
                  String userClass = load.next();
                  int maxHealth = load.nextInt();
                  int currentHealth = load.nextInt();
                  int attack = load.nextInt();
                  int defense = load.nextInt();
                  int speed = load.nextInt();
                  int magic = load.nextInt();
                  int level = load.nextInt();
                  int strength = load.nextInt();
                  int totalxp = load.nextInt();
                  String startingLocation = load.next();
                  int userWeapon = load.nextInt();
                  int userArmor = load.nextInt();
                  
                  User player = new User(name, userClass, maxHealth, currentHealth,
                           attack, defense, speed, magic, level, strength, totalxp,
                           startingLocation, userWeapon, userArmor);
               }
               catch (FileNotFoundException e)
               {
                  JOptionPane.showMessageDialog(null, "Load File Was Corrupted");
                  break menu;
               }
               catch (InputMismatchException e)
               {
                  JOptionPane.showMessageDialog(null, "Load File Was Corrupted");
                  break menu;
               }
               
         }
      }
      while(cancelled);
            //player = new User(name, userClass);
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
