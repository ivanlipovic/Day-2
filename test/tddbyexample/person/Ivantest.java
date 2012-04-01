package tddbyexample.person;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nvaidyan
 */
public class Ivantest {

   @Test
   public void testHipsterHairstyle() {
        Person ivan = new Person(); 
        ivan.setHairstyle("hipster");
        assertEquals("hipster", ivan.hairstyle);
   }
   
   @Test
   public void testCrewcutHairstyle() {
       Person ivan = new Person();
       ivan.setHairstyle("crewcut");
       assertEquals("crewcut", ivan.hairstyle);
   }
   @Test
   public void testBrowneyecolor() {
       Person ivan = new Person();
       ivan.setEyeColor("Brown");
       assertEquals("Brown", ivan.eyeColor);
   }
   @Test
   public void testGreenEyeColor() {
       Person ivan = new Person();
       ivan.setEyeColor("Green");
       assertEquals("Green", ivan.eyeColor);
   } 
  
}
