package com.example.mitchellkane.assignment2;

import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;


/**
 * Created by mitchellkane on 2018-02-05.
 */
public class ValidatorTest {
    Validator v = new Validator();

    @Before


    @Test // test for password being "password"
    public void matchesPassword() throws Exception {
        assertEquals(false, v.isPassword("password"));
        assertEquals(false, v.isPassword("Password"));
        assertEquals(true, v.isPassword("Password1"));
    }

    @Test // test for the length of password
    public void checkLength() throws Exception {
        assertEquals(false, v.greater7("frog"));
        assertEquals(true, v.greater7("pineapple"));
    }





}