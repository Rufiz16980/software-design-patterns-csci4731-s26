package az.edu.ada.modules.module02.lecture04;

public class DBconnection {
    private static volatile DBconnection instance;


    private DBconnection() {} // empty constructor so the second instance cannot be create

    public static DBconnection getInstance() {

        if(instance == null) {

            synchronized (DBconnection.class) {
                if(instance == null) { 
                    instance = new DBconnection();
                }


            }
        }
        
        return instance;
    }
    
}



// In the background, when the computer sees instance = new DBconnection();, 
// it breaks it into three steps:
// Allocate memory for the object.
// Point the instance variable to that memory address.
// Run the constructor to fill the object with data.
// The Crash Scenario: Modern CPUs often do Step 2 before Step 3 to save time.
// Thread A starts creating the object and points the variable to the memory (Step 2), but hasn't finished the constructor (Step 3) yet.
// Thread B arrives at the very first if(instance == null).
// It sees that instance is NOT null (because of Step 2).
// Thread B takes that "half-baked" object and tries to use it. Crash.
// Adding volatile forces the CPU to finish the constructor before it lets anyone else see the memory address.