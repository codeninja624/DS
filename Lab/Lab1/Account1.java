package L1Q4;

import java.util.ArrayList;

public class Account1 extends Account{
    private String name;

    public Account1(int id, double balance, String name) {
        super(id, balance);
        this.name = name;
    }
    ArrayList<Transaction>transactions=new ArrayList<>();

    public String getName() {
        return name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

}
