package ISP;

public class Main {

    public static void main(String[] args) {
        // Using a task
        Task task = new Task();
        task.edit(); // Can edit
        task.complete(); // Can complete
    }
    
}

/*
 * 
 * This example adheres to the Interface Segregation Principle by ensuring that
 * clients are not forced to implement or depend on interfaces they do not need.
 * Each interface represents a specific functionality, and classes implement
 * only the interfaces that are relevant to their functionality.
 */
