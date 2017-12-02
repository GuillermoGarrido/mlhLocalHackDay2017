


public class StoneCrusher extends Move
{
   public StoneCrusher(int userLevel)
   {
      description = "The golem slams his arm down at you.";
      attack = 14 + userLevel;
      health = 0;
      magic = 0;
      accuracy = 90;
      type = "Offensive";
      name = "Stone Crusher";
      multiUse = true;
   }
   
}
