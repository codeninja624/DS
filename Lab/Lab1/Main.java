package L1Q4;

public class Main {
    public static void main(String[] args) {
        Account1 account1=new Account1(1122,1000,"George");
        Account1.setAnnualInterestRate(1.5);
        account1.transactions.add(new Transaction('D',30,account1.deposit(30),"Deposit"));
        account1.transactions.add(new Transaction('D',40,account1.deposit(40),"Deposit"));
        account1.transactions.add(new Transaction('D',50,account1.deposit(50),"Deposit"));
        account1.transactions.add(new Transaction('W',5,account1.withdraw(5),"Withdraw"));
        account1.transactions.add(new Transaction('W',4,account1.withdraw(4),"Withdraw"));
        account1.transactions.add(new Transaction('W',2,account1.withdraw(2),"Withdraw"));
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s\n","Name","ID","Initial Balance","Type","Amount","Balance","Desciption");
        for(Transaction transaction: account1.transactions){
            if(transaction.getType()=='D'){
                System.out.printf("%20s%20s%20s%20s%20s%20s%20s\n",account1.getName(),account1.getId(),
                        transaction.getBalance()-transaction.getAmount(),transaction.getType(),transaction.getAmount(),transaction.getBalance(),
                        transaction.getDescription());
            }else if(transaction.getType()=='W'){
                System.out.printf("%20s%20s%20s%20s%20s%20s%20s\n",account1.getName(),account1.getId(),
                        transaction.getBalance()+transaction.getAmount(),transaction.getType(),transaction.getAmount(),transaction.getBalance(),
                        transaction.getDescription());
            }
        }


    }
}
