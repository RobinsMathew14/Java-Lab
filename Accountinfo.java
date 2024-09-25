import java.util.Scanner;

class InvalidAmountException extends Exception {
    private String msg;

    InvalidAmountException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}

class InsufficientAmountException extends Exception {
    private String msg;

    InsufficientAmountException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}

class MyBank {
    public Long AccountNumber;
    private String AccountType;
    private String name;
    private long balance;

    Scanner sc = new Scanner(System.in);

    public void openAccount() {
        System.out.println("Enter Account number:");
        this.AccountNumber = sc.nextLong();
        System.out.println("Enter Account type:");
        this.AccountType = sc.next();
        System.out.println("Enter Name:");
        this.name = sc.next();
        System.out.println("Enter balance:");
        this.balance = sc.nextLong();
    }

    public void displayAccountDetails() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account No: " + AccountNumber);
        System.out.println("Account Type: " + AccountType);
        System.out.println("Balance: " + balance);
    }

    public boolean search(long AccountNumber) {
        return AccountNumber == this.AccountNumber;
    }

    public void deposit() throws InvalidAmountException {
        System.out.println("Enter the amount to be deposited:");
        int deposit = sc.nextInt();
        if (deposit <= 0) {
            throw new InvalidAmountException("Invalid amount, amount <= 0");
        } else {
            balance += deposit;
            System.out.println("Amount deposited successfully. New balance: " + balance);
        }
    }

    public void withdraw() throws InsufficientAmountException, InvalidAmountException {
        System.out.println("Enter the amount to be withdrawn:");
        int withdraw = sc.nextInt();
        if (withdraw <= 0) {
            throw new InvalidAmountException("Invalid amount, amount <= 0");
        } else if (withdraw > balance) {
            throw new InsufficientAmountException("Your balance is less than " + balance + "\nTransaction failed...!!");
        } else {
            balance -= withdraw;
            System.out.println("Balance after withdrawal: " + balance);
        }
    }
}

public class Accountinfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number of customers?");
        int n = sc.nextInt();

        MyBank[] ob = new MyBank[n];

        for (int i = 0; i < ob.length; i++) {
            ob[i] = new MyBank();
            ob[i].openAccount();
        }

        String ch = "y";
        do {
            System.out.println("BANKING SOFTWARE");
            System.out.println("1. Display all account details" );
            System.out.println(" 2. Search by Account number");
            System.out.println(" 3. Deposit the amount");
            System.out.println(" 4. Withdraw the amount");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    for (int i = 0; i < ob.length; i++) {
                        ob[i].displayAccountDetails();
                    }
                    break;

                case 2:
                    System.out.println("Enter account number you want to search:");
                    long AccountNumber = sc.nextLong();
                    boolean found = false;
                    int i;
                    for (i = 0; i < ob.length; i++) {
                        if (ob[i].search(AccountNumber)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        ob[i].displayAccountDetails();
                    } else {
                        System.out.println("Account not Found!!");
                    }
                    break;

                case 3:
                    System.out.println("Enter account number:");
                    AccountNumber = sc.nextLong();
                    found = false;
                    for (i = 0; i < ob.length; i++) {
                        if (ob[i].search(AccountNumber)) {
                            found = true;
                            break;
                        }
                    }
                    try {
                        if (found) {
                            ob[i].deposit();
                        } else {
                            System.out.println("Account not Found!!");
                        }
                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Enter account number:");
                    AccountNumber = sc.nextLong();
                    found = false;
                    for (i = 0; i < ob.length; i++) {
                        if (ob[i].search(AccountNumber)) {
                            found = true;
                            break;
                        }
                    }
                    try {
                        if (found) {
                            ob[i].withdraw();
                        } else {
                            System.out.println("Account not Found!!");
                        }
                    } catch (InvalidAmountException | InsufficientAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid option");
            }

            System.out.println("Do you want to continue? (y/n)");
            ch = sc.next();

        } while (ch.equalsIgnoreCase("y"));

        sc.close();
    }
}

