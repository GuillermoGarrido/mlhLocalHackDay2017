
package hackathon;

public class Room 
{
   String name;
   int size;
   String[] options;
   Creature[] enemies;
   String description;
   Room next;
   Room prev;
   
   public Room(String name, int size, Room prev)
   {
      this.name = name;
      this.size = size;
      this.prev = prev;
   }
   
   public int getSize()
   {
      return size;
   }
   
   public String getName()
   {
      return name;
   }

   public String[] getOptions() 
   {
      return options;
   }

   public Room getNext() {
      return next;
   }

   public Room getPrev() {
      return prev;
   }

   public void setNext(Room next) 
   {
      this.next = next;
   }

   public void setPrev(Room prev) 
   {
      this.prev = prev;
   }

   public Creature[] getEnemies() 
   {
      return enemies;
   }

   public String getDescription() {
      return description;
   }
   
   
   
   
}
