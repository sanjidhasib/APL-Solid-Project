package ISP;


// class representing a task

public class Task implements Editable,Completable {

    @Override
    public void edit() {
        System.out.println("Editing task...");
    }

    @Override
    public void complete() {
        System.out.println("Completing task...");
    }
    
}
