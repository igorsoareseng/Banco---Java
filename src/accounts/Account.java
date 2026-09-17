package accounts;

public abstract class Account {

    protected String name;
    protected Integer number;
    protected Float balance;
    protected Float limit;
    //protected register

    public Account(String name, Integer number, Float balance, Float limit) {

        this.name = name;
        this.number = number;
        this.balance = balance;
        this.limit = limit;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getNumber() {

        return this.number;
    }

    public void setNumber(Integer number) {

        this.number = number;
    }

    public Float getBalance() {

        return this.balance;
    }

    public void setBalance(Float balance) {

        this.balance = balance;
    }

    public Float getLimit() {

        return this.limit;
    }

    public void setLimit(Float limit) {

        this.limit = limit;
    }

    public abstract void changeLimit(Float value);
}