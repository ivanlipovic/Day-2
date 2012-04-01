package tddbyexample.money;

/**
 *
 * @author nvaidyan
 */
public class Dollar {
    int amount;
    
    Dollar(int amount){
        this.amount= amount;
    }
    
    Dollar times(int multiplier) {
        amount *= multiplier;
        return new Dollar(amount);
    }
    
}

