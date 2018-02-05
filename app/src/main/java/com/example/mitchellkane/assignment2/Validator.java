package com.example.mitchellkane.assignment2;

/**
 * Created by mitchellkane on 2018-02-05.
 * Validates a submitted password
 */

public class Validator {

    // Constructor
    public Validator () {
    }

    /* function that checks whether a string is a
    sufficiently strong password according  to some set of rules,
    and returns the number of rules that the string passed.

    int validate (String password){
        int passed = 0;
        if (isPassword(password)) passed++;
        if (greater8(password)) passed++;
        return passed;
    } */

    // Checks that the password is not "password" (case-insensitive)
    boolean isPassword (String password) {
        return !password.toLowerCase().equals("password");
    }
    // Checks that the provided password is 8 or more characters
    boolean greater7 (String password) {
        return password.length()>7;
    }
}
