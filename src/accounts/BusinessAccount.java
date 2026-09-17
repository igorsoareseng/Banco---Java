package accounts;

public final class BusinessAccount extends Account {

    public BusinessAccount(String name, Integer number, Float balance, Float limit) {

        super(name, number, balance, limit);
    }
    
    @Override 
    public void changeLimit(Float value) {

        setLimit(getLimit() + 3000);

    }
}
