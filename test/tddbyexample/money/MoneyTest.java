package tddbyexample.money;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest {
    
     @Test
     public void testMultiplication() {
         Dollar five= new Dollar(5);
         Dollar product= five.times(3);
         assertEquals(15, product.amount);        
     }
     @Test
     public void testMultiplicationByZero() {
         Dollar five= new Dollar(5);
         Dollar product= five.times(0);
         assertEquals(0, product.amount);        
     }
}
