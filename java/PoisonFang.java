
package hackathon;

public class PoisonFang extends Move
{
   public PoisonFang(int userLevel)
   {
      description = "The spider attacks with its large fangs.";
      attack = 12 + userLevel;
      health = 0;
      magic = 0;
      accuracy = 95;
      type = "Offensive";
      name = "Poison Fang";
      multiUse = true;
   }
}
