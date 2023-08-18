package bank;
import java.util.Scanner;
public class Account {

    private String name;
    private double balance;
    private int acct;
    private double deposit;
    private double withdraw;
    

    public Account() {
        // the "this" keyword references the attributes of any object of this class
        this.name = "Ted Murphy";
        this.balance = 102.56;
        this.acct = 73454;
        this.deposit = 84.75;
        this.withdraw = 30;
      }
      public Account(String name, int acct, double balance) {
       
        this.name = name;
        this.balance = balance;
        this.acct = acct;
        this.deposit = deposit;
        
    
      }


      
    
      // Accesor Method
      public String getName() {
        return this.name;
      }
    
      // Mutator Method
      public void setName(String name) {
        this.name = name;
      }
       // Accesor Method
       public int getAcct() {
          return this.acct;
        }
      
        public void setAcct(int acct) {
          this.acct = acct;
        }
        // Accesor Method
       public double getBalance() {
          return this.balance;
        }
      
        // Mutator Method
        public void setBalance(double balance) {
          this.balance = balance;
        }

        public void deposit(double deposit){
          this.balance = this.balance+84.75;
        }

        public void withdraw(double deposit){
          this.balance = this.balance-30.00;
          if (withdraw > this.balance){
            System.out.println("Withdraw exceeds current balance");}
            else 
              System.out.println(this.balance);
              
            
        }
        public void applyInterest(){
          this.balance *=1.02;

        }
        

        public String toString(){
          String output = "";
          output += this.name+" has " ;
          output += ""+this.balance+" in their account";
          return output;
    
  
        }
        public void checkNumber(){
          Scanner scan = new Scanner(System.in);
          System.out.println("Please enter your account number ");
          String input = scan.next();
          System.out.println(input);
          System.out.println(input.getClass());
          int number = Integer.parseInt(input);
          int secret_num = 42;
          if(number==secret_num)
            System.out.println("You entered the correct account number");
          else
            System.out.println("The account number you entered was inccorect please contact customer support.");
        
  
        }
      
        
        
        
 


}
