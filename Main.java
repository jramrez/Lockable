import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("NAME: ");
        Account acc1 = new Account(scan.nextLine());
        acc1.setKey(1902);
        acc1.lock();
        System.out.println(acc1.locked());
        scan.close();
    }
}