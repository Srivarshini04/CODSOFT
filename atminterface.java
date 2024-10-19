import java.util.Scanner;
class Atm{
    double newbalance;
    private Account acc;
    public Atm(Account acc)
    {
        this.acc=acc;
    }
    
   public void deposit(double creditamt)
  {
   newbalance=acc.getbalance()+creditamt;
   acc.setbalance(newbalance);
   System.out.println("The amount is credited successfully...");
  }
  public void withdraw(double debitamt)
  {
   if(debitamt>=acc.getbalance())
    System.out.println("Cannot withdraw...Debit amount exceeded account balance...");
   else
   {
   newbalance=acc.getbalance()-debitamt;
   acc.setbalance(newbalance);
   System.out.println("The amount is debited successfully...");
   }
    }
  public void checkbalance()
  {
    System.out.println("The Balance amount="+acc.getbalance());
  }
}
class Account{
  private double balance;
  public Account(double initialbal)
  {
    this.balance=initialbal;
  }
  public void setbalance(double balance)
  {
   this.balance=balance;
  }
  public double getbalance()
  {
  return balance;
  }
}
public class atminterface{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 int ch;
 Account acc=new Account(500);
 Atm atm=new Atm(acc);
 System.out.print("Enter the balance present in the account=");
 double accbal=sc.nextDouble();
 acc.setbalance(accbal);
 do
 {
 System.out.print("Enter the choice 1.deposit,2.withdraw,3.checkbalance,4.exit=");
 ch=sc.nextInt();
 switch(ch)
 { 
  case 1->{
  	  System.out.print("Enter the amount you want to deposit=");
          double creditamt=sc.nextDouble();
          atm.deposit(creditamt);

          }
  case 2->{
 	  System.out.print("Enter the amount you want to withdraw=");
          double debitamt=sc.nextDouble();
          atm.withdraw(debitamt);
          }
  case 3->atm.checkbalance();
  }
  }while(ch!=4);
  System.out.println("Thank You for visiting...");
  sc.close();
 }
}
  
  
          
 
 
    
    
  
   
   
