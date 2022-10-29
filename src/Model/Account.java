package Model;

import FInancialException.ModelException;

import java.util.List;
import java.util.Objects;

public class Account extends Common{
    private String title;
    private Currency currency;
    private double startAmount;
    private double amount;
    public Account(){}

    public Account(String title, Currency currency, double startAmount, double amount) throws ModelException {
        if ((title.length() ==0)) throw new ModelException(ModelException.TITLE_EMPTY);
        if ((currency == null)) throw new ModelException(ModelException.CURRENCY_EMPTY);
        this.title = title;
        this.currency = currency;
        this.startAmount = startAmount;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(double startAmount) {
        this.startAmount = startAmount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return getTitle().equals(account.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle());
    }

    @Override
    public String getValueForComboBox(){
        return  title;
    }

    public void setAmountTransactionAndTransfers(List<Transaction> transactions, List<Transfer> transfers){
        this.amount = startAmount;

        for (Transaction transaction : transactions){
            if(transaction.getAccount().equals(this)) {
                this.amount += transaction.getAmount();
            }
        }

        for (Transfer transfer : transfers){
            if(transfer.getFromAccount().equals(this)){
                this.amount -= transfer.getToAmount();
            }
            if(transfer.getToAccount().equals(this)){
                this.amount += transfer.getToAmount();
            }
        }
    }
}
