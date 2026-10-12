import java.util.Scanner;
public class bankaccountmanagement1{
static String accountnumber;
static String customername;
static double balance;
static Scanner sc = new Scanner(System.in);
  static void entry(){
    System.out.println(" Welcome to SBI Bank(-_-)");
    System.out.println("Enter Accountnumber:");
    accountnumber = sc.nextLine();
    System.out.println("Enter customerName:");
    customername = sc.nextLine();
    System.out.println("Enter initial balance:");
    balance = sc.nextDouble();
  }
  static void deposit(){
    System.out.println("Enter the amount to deposit: ");
    double amount = sc.nextDouble();
    if(amount>0){
      balance = balance + amount;
      System.out.println("Amount deposited Successfully.");
    }
      else{
        System.out.println("Deposit amount greaterthan 0/-.");
      }
  }
  static void withdraw(){
    System.out.println("Enter the amount to withdraw:");
    double amount = sc.nextDouble();
    if(amount<=0){
      System.out.println(" Transaction failed! : withdrawl amount should be greaterthan 0/-.");
    }else if(amount<=balance){
      balance=balance-amount;
       System.out.println("Amount withdrawn successfully.");
    }else{
       System.out.println("Insufficient Balance! (^_^)");
    }
    
  }
  static void returnBalance(){
     System.out.println("current Account Balance:" +balance);
  }
  static void exit(){
     System.out.println("Thanks (^__^) for choosing SBI Bank , Visit again.");
  }
  public static void main(String  args[]){
    entry();
    int option;
    do{
       System.out.println("1. Deposit");
       System.out.println("2. Withdraw");
       System.out.println("3. Check Balance");
       System.out.println("4. Exit");
       System.out.println("choose the option from above:");
       option = sc.nextInt();
       switch(option){
        case 1:
        deposit();
        break;
        case 2:
        withdraw();
        break;
        case 3:
        returnBalance();
        break;
        case 4:
        exit();
        break;
        default:
        System.out.println("invalid option! Please try again.");
       }
      } while(option != 4);

    }

  }