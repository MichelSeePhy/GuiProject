
/*
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import javax.crypto.AEADBadTagException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Testing {



    private CoffeeMachine cm;
    @BeforeEach
    public void beforeEach(){
        cm = new CoffeeMachine();
    }

    @Test
    public void testSugar(){

        cm.getSugarLevel();
        assertEquals(3,cm.getSugarLevel());
        cm.incrementSugar();
        assertEquals(4, cm.getSugarLevel());

    }
    @Test
    public void testNextType(){
        cm.nextType();
        assertEquals(DrinkType.LATTE, cm.getCurrentMode());
    }

    @Test
    public void testPutInCup(){
        Cup cup = new Cup();
        cm.putInCup(cup);
        assertEquals(cup, cup);
    }
    @Test
    public void testPutOutCup(){
        Cup cup = new Cup();
        cm.putInCup(cup);
        cm.putOutCup();
        assertFalse(cm.isCupInside());
    }
    @Test
    public void testIsCupInside(){
        Cup cup = new Cup();
        cm.putInCup(cup);
        assertTrue(cm.isCupInside());
    }
    @Test
    public void testCurrentMode(){
        assertEquals(DrinkType.AMERICANO, cm.getCurrentMode());
    }
    @Test
    public void testMakeCoffee() {
        Cup cup = new Cup();
        cm.putInCup(cup);

       // assertFalse(cup.isEmpty());
        for (DrinkType type: DrinkType.values()
             ) {
            cm.makeCoffee();
            assertEquals(type, cup.getContent());
          //  assertEquals(3,cup.getSugarLevel());
            cm.nextType();
        }
     }
     @Test
    public void testFillUp(){
        Cup cup = new Cup();
        for (DrinkType drink:DrinkType.values()
              ) {
             cup.fillUp(drink, 3);
             assertEquals (drink, cup.getContent());
         }
     }
     @Test
    public void testPourOut(){
         Cup cup = new Cup();
         assertTrue(cup.isEmpty());
     }
    @Test
    public void testIsEmpty(){
        Cup cup = new Cup();
        assertTrue(cup.isEmpty());
    }
    @Test
    public void testCupSugarLevel(){
        Cup cup = new Cup();
        assertEquals(0, cup.getSugarLevel());
    }
    @Test
    public void testGetContent(){
        Cup cup = new Cup();
        cm.putInCup(cup);
        for (DrinkType type: DrinkType.values()) {
            cm.makeCoffee();
            assertEquals(type, cup.getContent());
            cm.nextType();
        }

    }
    }


 */

