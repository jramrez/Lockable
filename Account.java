import java.util.Scanner;

public class Account implements Lockable {
     private int keyCode;
     private boolean isLocked;
     private int enterKeyCode;
     private String accountName;
     Scanner scan = new Scanner(System.in);
    
     public Account(String name) {
        accountName = name;
        isLocked = false;
        keyCode = 0;
     }

    public void setKey(int keyNum) {
        keyCode = keyNum;
        System.out.println("KEY SET");
    }

    public void lock() {
        System.out.print("CODE TO LOCK: ");
        enterKeyCode = scan.nextInt();
        if (enterKeyCode == keyCode) {
            isLocked = true;
        }
        else {
            System.out.println("INCORRECT CODE ENTERED");
        }
    }

    public void unlock() {
        System.out.print("CODE TO UNLOCK: ");
        enterKeyCode = scan.nextInt();
        if (enterKeyCode == keyCode) {
            isLocked = false;
        }
        else {
            System.out.println("INCORRECT CODE ENTERED");
        }
    }

    public boolean locked() {
        if (isLocked == true) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
