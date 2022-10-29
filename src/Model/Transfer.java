package Model;

import FInancialException.ModelException;

import java.util.Date;

public class Transfer extends  Common{

    private Account fromAccount;
    private Account toAccount;
    private double fromAmount;
    private double toAmount;
    private Date date;

    public Transfer(){}

    public Transfer(Account fromAccount, Account toAccount, double fromAmount, double toAmount, Date date) throws ModelException {
        if ((fromAccount == null)) throw new ModelException(ModelException.ACCOUNT_EMPTY);
        if ((toAccount == null)) throw new ModelException(ModelException.ACCOUNT_EMPTY);
        if ((getFromAmount() <0 || toAmount <0 )) throw new ModelException(ModelException.AMOUNT_FORMAT);
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.fromAmount = fromAmount;
        this.toAmount = toAmount;
        this.date = date;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }

    public double getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(double fromAmount) {
        this.fromAmount = fromAmount;
    }

    public double getToAmount() {
        return toAmount;
    }

    public void setToAmount(double toAmount) {
        this.toAmount = toAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "fromAccount=" + fromAccount +
                ", toAccount=" + toAccount +
                ", fromAmount=" + fromAmount +
                ", toAmount=" + toAmount +
                ", date=" + date +
                '}';
    }
}
