


public class Shield extends Weapon
{
   final int BASE_ATTACK = 6;
   final int BASE_MAGIC = 0;
   
   public Shield(int strength)
   {
      super(strength);
      itemNum = 4;
      switch(strength)
      {
         case 1:
            name = "Weak Shield";
            break;
         case 3:
            name = "Guardian's Shield";
            break;
         case 6:
            name = "Berserker's Shield";
            break;
      }
      
      description = "A small yet durable shield that doesn't seem to cover much area.";
      
      attack = BASE_ATTACK;
      magic = BASE_MAGIC;
   }
}
