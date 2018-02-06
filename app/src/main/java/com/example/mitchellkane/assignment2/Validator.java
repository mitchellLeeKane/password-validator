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
    */
    int validate (String password){
        int passed = 0;
        if (isPassword(password)) passed++;
        if (greater7(password)) passed++;
        if (hasCap(password)) passed++;
        if (hasNum(password)) passed++;
        if (hasSpecial(password)) passed++;
        return passed;
    }

    // Checks that the password is not "password" (case-insensitive)
    boolean isPassword (String password) {
        return !password.toLowerCase().equals("password");
    }

    // Checks that the provided password is 8 or more characters
    boolean greater7 (String password) {
        return password.length()>7;
    }

    // Checks that the password has upper and lower case
    boolean hasCap (String password) {
        return !password.toLowerCase().equals(password)
            && !password.toUpperCase().equals(password);
    }

    // Checks that the password contains at least one number
    boolean hasNum (String password) {
        return password.matches(".*\\d+.*");
    }

    // Checks that the password has at least one special character
    boolean hasSpecial (String password) {
        return password.matches(".*[^A-Za-z0-9]+.*");
    }
}
