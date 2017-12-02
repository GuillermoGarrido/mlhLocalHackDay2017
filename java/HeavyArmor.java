

public class HeavyArmor extends Armor{
    final int BASE_DEFENSE = 12;
    final int BASE_SPEED = 0;
    
    public HeavyArmor(int strength){
         super(strength);
         itemNum = 8;
            switch (strength) 
            {
            case 1:
                name = "Rusty armor";
                description ="A beginner's set of armor";
                break;

            case 3:
                name = "Steel Plate Armor";
                description ="Armor crafted from steel ingots. ";
                break;
                
            case 6:
                name = "Dragon Armor";
                description ="An armor set fit to fight the strongest monsters";
                break;
            }

        defense = BASE_DEFENSE+(strength*2);
        speed = BASE_SPEED - strength;
        
    }
            
    
}

