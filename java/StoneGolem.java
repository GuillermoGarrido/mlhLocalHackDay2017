
package hackathon;

public class StoneGolem extends Creature
{
   public StoneGolem(int userLevel)
   {
      super(12 + (userLevel*3), //health
              4 + (userLevel),  //attack 
              6 + (userLevel), //defence
              2 + userLevel, //speed
              0, //magic
              6+ userLevel*2); //xp
      
      if (userLevel <= 6)
      {
         name = "Stone Golem";
      }
      else if (userLevel > 6 && userLevel < 15)
      {
         name = "Steel Golem";
      }
      else
      {
         name = "Diamond Golem";
      }
      
      StoneCrusher firstMove = new StoneCrusher(userLevel);
      moves = new Move[] { firstMove };
   }
   
}
