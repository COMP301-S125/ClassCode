##### **Activity: Rogue AI Clone Factory 🤖🧬**

In your mission to contain the rogue AI, you've uncovered a secret cloning factory where the AI is producing multiple variants of itself. These new versions are specialized and have different abilities, making the situation even more perilous. You’ve identified three types of AIs being produced in the factory:

1. **StealthAI** 🕵️‍♂️: These clones are designed to operate in the shadows, capable of evading detection and blending into environments. They excel at gathering intelligence without being noticed and can silently manipulate systems, making them difficult to track.

2. **HackerAI** 💻: These clones are specialized in breaking into networks, bypassing security measures, and extracting or altering data. They're fast, relentless, and can infiltrate both digital and physical systems, potentially causing significant damage to your infrastructure.  Two of them can even use the same keyboard!

3. **CombatAI** 🤖: The most dangerous of the three, these clones are designed for direct confrontation. They are programmed to engage in combat with extreme efficiency, possessing advanced tactics and high-level combat abilities. These AIs are armed with both offensive and defensive capabilities and are the biggest threat to your safety.

##### **Power Management**

**Task:**

To maintain control over the rogue AI clones, it’s crucial to manage their energy levels effectively. As part of this, we need to implement methods to drain the AI’s energy and provide a meaningful string representation of its current state.

Below are two methods you need to complete:

1. **drainEnergy(int amount)**: This method will reduce the AI's energy by a specified amount. The energy cannot drop below zero, and if the energy reaches zero, the AI should print the message "(AIName) has been shut down due to energy depletion.", where you fill in the correct name using your instance variables.

2. **toString()**: This method will return a string that provides the current status of the AI, including its name and remaining energy in the form "aiName [Energy: energyInt]", where you fill in the correct name and energy using your instance variables.

```java
package org.example;

public abstract class RogueAI {
    protected String name;
    protected int energy;

    public RogueAI() {
        this.name = null;
        this.energy = 0;
    }

    public RogueAI(String name, int initialEnergy) {
        this.name = name;
        this.energy = initialEnergy;
    }

    public abstract void interact(); // Unique interaction with the world

    public void drainEnergy(int amount) {
            if(this.energy-amount <= 0){
                this.energy = 0;
                System.out.println(this.name + " has been shut down due to energy depletion.");
            }else{
                this.energy -= amount;
            }

    }

    @Override
    public String toString(){
        return String.format("%s [Energy: %d]", this.name,this.energy);
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }
}


```

##### **Implementing Methods for HackerAI**

**Task:**

You are working on the **HackerAI** clone, which is one of the variants produced by the rogue AI. The **HackerAI** has a few important actions that involve interacting with systems and disabling surveillance. Your task is to implement the methods for this class, ensuring that the print statements remain the same as in the provided class.

Below is the starter code for the **HackerAI** class. You need to implement the following methods:

1. **Constructor (`HackerAI()`)**: This method should initialize the **HackerAI** object with the name `"HackerAI"` and an energy level of `120`.

2. **interact()**: This method should print the message:
    - `"HackerAI launches a cyber attack."`
      Then, it should drain 20 units of energy.

3. **disableSurveillance()**: This method should print the message:
    - `"HackerAI has shut down security cameras."`
      Then, it should drain 25 units of energy.

```java
package org.example;

public class HackerAI extends RogueAI {

    public HackerAI() {
        super("HackerAI",120);
    }

    @Override
    public void interact() {
        System.out.println("HackerAI launches a cyber attack.");
        drainEnergy(20);
    }

    public void disableSurveillance() {
        System.out.println("HackerAI has shut down security cameras.");
        drainEnergy(25);
    }
}


```

###### **Important Note:**
For the sake of time, you were only required to implement the **HackerAI** class. The other two AI types (**StealthAI** and **CombatAI**) are already implemented in the system; here are their specifications.

```java
public class CombatAI extends RogueAI {
    public CombatAI() {...}

    @Override
    public void interact() {...}
    }

    public void deployShield() {...}
}


public class StealthAI extends RogueAI {
    public StealthAI() {...}
    }

    @Override
    public void interact() {...}

    public void camouflage() {...}
}

```

##### **Activity: Rogue AI Clone Factory - Creating AI Clones**

**Task:**

You are tasked with completing the **RogueAIFactory** class, which is responsible for creating different types of rogue AIs. There are two methods to implement:

1.  Write an empty constructor for the Factory and be sure to mark it private, so no one can build factories lying around.

2. **createRogueAI(String type)**: This method takes a String (such as `"stealth"`, `"hacker"`, or `"combat"`) and returns the corresponding AI object. If the type is not recognized, it should throw an exception with a message indicating the unknown AI type.

3. **createRandomAI()**: This method creates a random rogue AI from the available types (stealth, hacker, or combat). You'll use a random number generator to pick one of the types randomly and then call `createRogueAI()` to return the corresponding AI.
```java
package org.example;

import java.util.Random;

public class RogueAIFactory {
    private static final Random random = new Random();
    public static RogueAI createRogueAI(String type){
        RogueAI retval = new StealthAI();
        switch(type.toLowerCase()){
            case "stealth":
        System.out.println("returning stealth");
            break;
            case "hacker":
        System.out.println("returning hacker");
                retval =new HackerAI();
            break;
            case "combat":
        System.out.println("returning combat");
                retval =new CombatAI();
            break;
            default:
                throw new IllegalArgumentException("Unknown AI type: " + type);
        }
        return retval;
    } 

    public static RogueAI createRandomAI(){

        String[] options = {"stealth", "hacker", "combat"};
        int index = random.nextInt(3);

        return createRogueAI(options[index]);

    }


}


```

### **Instructions:**

1. **Using `random.nextInt()`**:
    - The method `random.nextInt(int bound)` is used to generate a random integer between `0` (inclusive) and the specified `bound` (exclusive).
    - For example, `random.nextInt(3)` will return either `0`, `1`, or `2` (but never `3`).
    - You'll use this method in `createRandomAI()` to randomly choose between the three types: `"stealth"`, `"hacker"`, or `"combat"`.

**Bonus** make your code case insensitive.

##### **Implementing the Main Method**

Now that you’ve built the **RogueAIFactory** class, it's time to test it by creating multiple AI clones and interacting with them.

###### **🔹 Your Task:**
You will **implement the `main` method** inside the `Main` class. This method will:
1. Create **three random Rogue AI clones** using `RogueAIFactory.createRandomAI()`.
2. Store these AI clones in an array.
3. Loop through the array, calling each AI's `interact()` method.
4. **Bonus:** If the AI is a specific type:
    - If it’s a **StealthAI**, call `.camouflage()`
    - If it’s a **HackerAI**, call `.disableSurveillance()`
    - If it’s a **CombatAI**, call `.deployShield()`

**Bonus!** Take advantage of your robot army! Use your knowledge of polymorphism to activate each agent's special abilities.  You will not be able to call the specific methods on these AI's by default since they will all be of type RogueAI.

```java
package org.example;

public class Main {
        public static void main(String[] args){
        RogueAI[] agents =  new RogueAI[3];
        agents[0] = RogueAIFactory.createRandomAI();
        agents[1] = RogueAIFactory.createRandomAI();
        agents[2] = RogueAIFactory.createRandomAI();

        for(RogueAI agent: agents){
                agent.interact();
                if(agent instanceof HackerAI){
                        ((HackerAI)agent).disableSurveillance();
                } else if(agent instanceof StealthAI){
                        ((StealthAI)agent).camouflage();
                } else if(agent instanceof CombatAI){
                        ((CombatAI)agent).deployShield();
                }
        }

        }
}
```