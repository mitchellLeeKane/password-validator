package com.example.mitchellkane.assignment2;

import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;


/**
 * Created by mitchellkane on 2018-02-05.
 * tests if a password matches a number of conditions
 */
public class ValidatorTest {
    Validator v = new Validator();

    @Before

    @Test // test for password not being "password"
    public void matchesPassword() throws Exception {
        assertEquals(true, v.isPassword(""));
        assertEquals(true, v.isPassword("a"));
        assertEquals(false, v.isPassword("password"));
        assertEquals(false, v.isPassword("PasSWord"));
        assertEquals(true, v.isPassword("Pass word"));
        assertEquals(true, v.isPassword("password1"));
    }

    @Test // test for the length of password
    public void checkLength() throws Exception {
        assertFalse(v.greater7(""));
        assertFalse(v.greater7("a"));
        assertFalse(v.greater7("isSeven"));
        assertTrue(v.greater7("password"));
        assertTrue(v.greater7("itsEight"));
        assertTrue(v.greater7("pineapple"));
    }

    @Test // test for upper and lower case
    public void checkCap() throws Exception {
        assertFalse(v.hasCap(""));
        assertFalse(v.hasCap("a"));
        assertFalse(v.hasCap("A"));
        assertTrue(v.hasCap("Password"));
        assertTrue(v.hasCap("PaSsWoRd"));
        assertFalse(v.hasCap("password"));
        assertFalse(v.hasCap("PASSWORD"));
    }

    @Test // test for contains a number
    public void checkNum() throws Exception {
        assertFalse(v.hasNum(""));
        assertFalse(v.hasNum("a"));
        assertFalse(v.hasNum("A"));
        assertTrue(v.hasNum("1"));
        assertTrue(v.hasNum("Password1"));
        assertFalse(v.hasNum("PASSWORD"));
    }

    @Test // test for contains a special character
    public void checkSpecial() throws Exception {
        assertFalse(v.hasSpecial(""));
        assertFalse(v.hasSpecial("a"));
        assertFalse(v.hasSpecial("A"));
        assertFalse(v.hasSpecial("1"));
        assertTrue(v.hasSpecial(";"));
        assertTrue(v.hasSpecial("Password!"));
        assertTrue(v.hasSpecial("1@"));
        assertTrue(v.hasSpecial("#####"));
        assertTrue(v.hasSpecial("$41t"));
    }

    /* test  of my validate function that returns
    number of tests passed */
    @Test
    public void numPassed() throws Exception {
        assertEquals(1, v.validate("password"));
        assertEquals(2, v.validate("Password"));
        assertEquals(5, v.validate("Password1!"));
        assertEquals(4, v.validate("!2Ac"));
        assertEquals(1, v.validate(""));
        assertEquals(1, v.validate("a"));
        assertEquals(3, v.validate("B4n4n4"));
        assertEquals(5, v.validate("!2aA-----"));
    }

}