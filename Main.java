import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loopval = true;

        Library.clearConsole();
        System.out.println("WELCOME TO BANK. MAKE ACCOUNT");
        Library.sleep(1000);
        System.out.print("NAME: ");
        CheckingAccount acc1 = new CheckingAccount(scan.nextLine());
        System.out.print("SET A CODE FOR ACCOUNT: ");
        acc1.setKey(scan.nextInt());
        System.out.print("DEPOSIT AN INITIAL BALANCE: ");
        acc1.deposit(scan.nextInt());
        Library.sleep(200);
        
        while(loopval) {
            Library.sleep(400);
            Library.clearConsole();
            if (acc1.locked() == false) {
                System.out.println("WHAT DO YOU WANT TO DO? \n[1]LOCK [2]DEPOSIT [3]WITHDRAW [4]PRINT BALANCE [5]EXIT");
            }
            else {
                System.out.println("WHAT DO YOU WANT TO DO? \n[1]UNLOCK [2]DEPOSIT [3]WITHDRAW [4]PRINT BALANCE [5]EXIT");
            }

            switch(scan.nextInt()) {
                case 1:
                    if (acc1.locked() == false) {
                        acc1.lock();
                    }
                    else {
                        acc1.unlock();
                    }
                    break;
                case 2:
                    System.out.print("DEPOSIT: ");
                    acc1.deposit(scan.nextInt());
                    Library.sleep(200);
                    break;
                case 3:
                    System.out.print("WITHDRAW: ");
                    acc1.withdraw(scan.nextInt());
                    Library.sleep(200);
                    break;
                case 4:
                    acc1.printBalance();
                    Library.sleep(1000);
                    break;
                case 5:
                    System.out.println("EXITING...");
                    loopval = false;
                    break;
            }
        }

        scan.close();
    }
}