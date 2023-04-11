package test;

import main.BalancedBrackets;
import org.junit.Test;
import org.junit.Assert;


import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void testFirstGivenString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void testClosingBracketFirst(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][LaunchCode]["));
    }
    @Test
    public void testOpeningBracketFirst(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[test[[]]]]"));
    }
    @Test
    public void singleOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void singleCloseBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void pairOfReversedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


}
