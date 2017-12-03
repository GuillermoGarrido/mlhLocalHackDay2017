package hackathon;

public class User 
{
   String name;
   String userClass;
   int maxHealth;
   int currentHealth;
   int attack;
   int defense;
   int speed;
   int magic;
   
   int strength;
   int level;
   int totalxp;
   
   int startingLocation;
   
   Weapon userWeapon;
   Armor userArmor;
   
   final int GENERIC_HEALTH = 15;
   final int GENERIC_ATTACK = 10;
   final int GENERIC_DEFENSE = 10;
   final int GENERIC_SPEED = 10;
   final int GENMERIC_MAGIC = 10;
   
   
   public User(String name, String userClass)
   {
      this.name = name;
      this.userClass = userClass;
      this.userArmor = null;
      this.userWeapon = null;
      this.totalxp = 0;
      this.level = 1;
      
      switch(userClass)
      {
         case "Mage":
            maxHealth = GENERIC_HEALTH;
            attack = GENERIC_ATTACK - (GENERIC_ATTACK/2);
            defense = GENERIC_DEFENSE - 3;
            speed = GENERIC_SPEED;
            magic = GENMERIC_MAGIC + (GENMERIC_MAGIC/2);
            break;
         case "Paladin":
            maxHealth = GENERIC_HEALTH + 3;
            attack = GENERIC_ATTACK + (GENERIC_ATTACK/2);
            defense = GENERIC_DEFENSE;
            speed = GENERIC_SPEED;
            magic = 0;
            break;
         case "Rogue":
            maxHealth = GENERIC_HEALTH;
            attack = GENERIC_ATTACK + 3;
            defense = GENERIC_DEFENSE - 3;
            speed = GENERIC_SPEED + (GENERIC_SPEED/2);
            magic = 0;
            break;
         case "Tank":
            maxHealth = GENERIC_HEALTH*2;
            attack = GENERIC_ATTACK + 2;
            defense = GENERIC_DEFENSE + 1;
            speed = GENERIC_SPEED - (GENERIC_SPEED/2);
            magic = 0;
            break;
      }
      
      currentHealth = maxHealth;
      startingLocation = 0;
      
   }
   
   public User(String name, String userClass, int maxHealth, int currentHealth,
            int attack, int defense, int speed, int magic, int level, int strength,
            int totalxp, int startingLocation, int num1, int num2)
   {
      this.name = name;
      this.userClass = userClass;
      this.maxHealth = maxHealth;
      this.currentHealth = currentHealth;
      this.attack = attack;
      this.defense = defense;
      this.speed = speed;
      this.magic = magic;
      this.totalxp = totalxp;
      this.strength = strength;
      this.level = level;
      this.userArmor = (Armor)ItemConstructor.generateItem(num2, strength);
      this.userWeapon = (Weapon)ItemConstructor.generateItem(num1, strength);
      this.startingLocation = startingLocation;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String getUserClass()
   {
      return userClass;
   }
   
   public int getMaxHealth()
   {
      return maxHealth;
   }
   
   public int getCurrentHealth()
   {
      return currentHealth;
   }
   
   public int getAttack()
   {
      return attack;
   }
   
   public int getDefense()
   {
      return defense;
   }
   
   public int getSpeed()
   {
      return speed;
   }
   
   public int getMagic()
   {
      return magic;
   }
   
   public int getLevel()
   {
      return level;
   }

   public int getStrength() {
      return strength;
   }

   public int getStartingLocation() {
      return startingLocation;
   }

   public int getTotalxp() {
      return totalxp;
   }
   
   
   public Weapon getUserWeapon()
   {
      return userWeapon;
   }
   
   public Armor getUserArmor()
   {
      return userArmor;
   }
   
   public void changeHealth(int change)
   {
      if(currentHealth == maxHealth)
      {
         return;
      }
      else if(maxHealth - currentHealth < change)
      {
         currentHealth = maxHealth;
      }
      else
      {
         currentHealth += change;
      }
   }
   
   public void restoreHealth()
   {
      currentHealth = maxHealth;
   }
   
   public void increaseStat(String statType, int change)
   {
      switch(statType)
      {
         case "maxHealth":
            maxHealth += change;
            break;
         case "attack":
            attack += change;
            break;
         case "defense":
            defense += change;
            break;
         case "speed":
            speed += change;
            break;
         case "magic":
            magic += change;
            break;
      }
   }
   
   public void equipWeapon(Weapon weapon)
   {
      userWeapon = weapon;
      increaseStat("attack", weapon.getAttack());
      increaseStat("magic", weapon.getMagic());
   }
   
   public void equipArmor(Armor armor)
   {
      userArmor = armor;
      increaseStat("defense", armor.getDefense());
      increaseStat("speed", armor.getSpeed());
   }
   
   public void unequipWeapon()
   {  
      increaseStat("attack", -userWeapon.getAttack());
      increaseStat("magic", -userWeapon.getMagic());
      userWeapon = null;
   }
   
   public void unequipArmor()
   {  
      increaseStat("defense", -userArmor.getDefense());
      increaseStat("speed", -userArmor.getSpeed());
      userArmor = null;
   }
   
   public void consume(Consumable item)
   {
     if (item.getType().equals("Healing"))
     {
        changeHealth(item.getHealth());
     }
     else if (item.getType().equals("FullHeal"))
     {
        restoreHealth();
     }
   }
   
   public void gainXP(int xp)
   {
      this.totalxp += xp;
      checkLevelUp();
   }
   
   public void checkLevelUp()
   {
      if (totalxp >= 50*level)
      {
         totalxp = totalxp - 50*level;
         level++;
         calcStrength();
         
      switch(userClass)
      {
         case "Mage":
            maxHealth += 5;
            attack += 1;
            defense += 2;
            speed += 2;
            magic += 6;
            break;
         case "Paladin":
            maxHealth += 7;
            attack += 8;
            defense += 4;
            speed += 2;
            magic += 0;
            break;
         case "Rogue":
            maxHealth += 6;
            attack += 4;
            defense += 1;
            speed += 5;
            magic += 0;
            break;
         case "Tank":
            maxHealth += 10;
            attack += 5;
            defense += 5;
            speed += 1;
            magic += 0;
            break;
      }
      }
   }
   
   public void calcStrength()
   {
      if (level <= 6)
      {
         strength = 1;
      }
      else if (level > 6 && level < 15)
      {
         strength = 3;
      }
      else
      {
         strength = 6;
      }
   }
   
}
