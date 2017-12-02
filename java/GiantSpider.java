

public class GiantSpider extends Creature
{
   public GiantSpider(int userLevel)
   {
      super(10 + (userLevel*2), //health
              5 + (userLevel),  //attack 
              3 + (userLevel), //defence
              4 + userLevel + 2, //speed
              0, //magic
              5+ userLevel*2); //xp
      
      if (userLevel <= 6)
      {
         name = "Giant Spider";
      }
      else if (userLevel > 6 && userLevel < 15)
      {
         name = "Ginat Black Spidere";
      }
      else
      {
         name = "Giant Red Spider";
      }
      
      PoisonFang firstMove = new PoisonFang(userLevel);
      moves = new Move[] { firstMove };
   }
   
   
   
}
