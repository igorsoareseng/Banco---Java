package accounts;

public final class IndividualAccount extends Account {
    
    public IndividualAccount(String name, Integer number, Float balance, Float limit) {

         super(name, number, balance, limit);
    }

    @Override 
    public void changeLimit(Float value) {

        setLimit(getLimit() + 1000);

    }
}
