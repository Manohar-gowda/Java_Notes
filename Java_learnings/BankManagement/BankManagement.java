package BankManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class BankManagement {
    static Scanner sc;
    static int lastaccid = 0;
    private static ArrayList<Account> accounts;
    public static void main(String[] args) {
         sc = new Scanner(System.in);
         accounts = new ArrayList<>();
        int i = 0;
        do {
            System.out.println("Welcome to State Bank of India");
            System.out.println("1. Create new account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            i = sc.nextInt();
            switch (i) {
                case 1: createNewAcc();
                 break;
                case 2: login();
                break;
            }
        }while ( i != 3);
    }
    private static void createNewAcc() {
        System.out.println("Enter your first name:");
        String firstName = sc.next();
        System.out.println("Enter your last name:");
        String lastName = sc.next();
        System.out.println("Enter balance:");
        double balance = sc.nextDouble();
        System.out.println("Enter passcode (digits only) :");
        int passcode = sc.nextInt();
        System.out.println("Confirm passcode:");
        int passcodec = sc.nextInt();
        if(passcodec != passcode) {
            System.out.println("passcode not matching!!!");
        }
        int id = 1000000 + lastaccid;
        lastaccid = lastaccid + 1;
        Account acc = new Account(firstName, lastName, id, balance, passcodec);
        System.out.println("Your account id: " + acc.getAccid());
        showMenu(acc);
    }

    private static void login() {
        System.out.println("Enter account id:");
        int id = sc.nextInt();
        System.out.println("Enter passcode:");
        int passcode = sc.nextInt();

        Account account = new Account();
        boolean exists = false;
        for (Account acc : accounts) {
            if (acc.getAccid() == id && acc.getPasscode() == passcode) {
                exists = true;
                account = acc;
            }
        }
        if (exists) {
            showMenu(account);
        }else {
            System.out.println("Account doesn't exists");
        }
    }

    private static void showMenu(Account acc) {
        System.out.println("Welcome " + acc.getFirstName() + " " + acc.getLastName());
    }
}
