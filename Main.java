package bank;
class Main {
    public static void main(String[] args) {
    Account acct1 = new Account ();
    Account acct2 = new Account ("Anita Gomez",69713,40.00);
    Account acct3 = new Account ("Sanchit Reddy",93757,200.00);


    System.out.println(acct1);
    System.out.println(acct2);
    System.out.println(acct3);
    
    System.out.println("----------");
    acct1.deposit (84.75);
    System.out.println(acct1.getBalance());
    acct2.withdraw(30.00);
    System.out.println(acct2.getBalance()); acct2.withdraw (30.00);
    System.out.println(acct2.getBalance());
    acct3.applyInterest();
    System.out.println(acct3.getBalance());
    acct1.checkNumber();
    acct2.checkNumber();
    }
}