package L1Q3;

import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated=new Date();

    static{
        annualInterestRate=0;// if put static variable , only become one memory location use CLASSname.staic variable name
    }
    public Account() {
        this(0,0);//calling another constructor
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
//        annualInterestRate=0;
//        this.dateCreated=new Date();//mustwrite
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate()/100;
    }
    public void withdraw(double v1){
        if(v1>balance) throw new IllegalArgumentException("The amount is larger than the balance.");
        balance-=v1;
    }
    public void deposit(double v2){
        balance+=v2;
    }
    public String toString(){
        return "Balance: "+getBalance()+"\nMonthly Interest: "+getMonthlyInterest()+"\nDate when account was created: "+getDateCreated();
    }
}
