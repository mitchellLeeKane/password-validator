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
        assertEquals(false, v.greater7(""));
        assertEquals(false, v.greater7("a"));
        assertEquals(false, v.greater7("isSeven"));
        assertEquals(true, v.greater7("password"));
        assertEquals(true, v.greater7("itsEight"));
        assertEquals(true, v.greater7("pineapple"));
    }

}