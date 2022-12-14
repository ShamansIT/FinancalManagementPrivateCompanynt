package Model;

import FInancialException.ModelException;

import java.util.Objects;

public class Currency extends Common{

    private String title;
    private String code;
    private double rate;
    private boolean isOn;
    public boolean isBase;

    public Currency(){}

    public Currency(String title, String code, double rate, boolean isOn, boolean isBase) throws ModelException {
        if ((title.length() ==0)) throw new ModelException(ModelException.TITLE_EMPTY);
        if ((code.length() ==0)) throw new ModelException(ModelException.CODE_EMPTY);
        if ((rate<=0)) throw new ModelException(ModelException.RATE_INCORRECT);
        this.title = title;
        this.code = code;
        this.rate = rate;
        this.isOn = isOn;
        this.isBase = isBase;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isBase() {
        return isBase;
    }

    public void setBase(boolean base) {
        isBase = base;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "title='" + title + '\'' +
                ", code='" + code + '\'' +
                ", rate=" + rate +
                ", isOn=" + isOn +
                ", isBase=" + isBase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Currency currency)) return false;
        return getCode().equals(currency.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    @Override
    public String getValueForComboBox(){
        return  title;
    }

    public double getRateByCurrency(Currency currency){
        return rate / currency.rate;
    }
}
