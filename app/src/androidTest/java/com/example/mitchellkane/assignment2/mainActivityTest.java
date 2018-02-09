package com.example.mitchellkane.assignment2;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class mainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("com.example.mitchellkane.assignment2", appContext.getPackageName());
    }

    // This is the test I added
    @Test
    public void password_strength() throws Exception {
        mActivityRule.getActivity();

        onView(withId(R.id.editText)).perform(typeText("Password"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.button)).perform(click());
        onView(withText("Your password strength is: 2 out of 5."));

        onView(withId(R.id.editText)).perform(clearText());
        onView(withId(R.id.editText)).perform(typeText("asdfGH12#$"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.button)).perform(click());
        onView(withText("Your password strength is: 5 out of 5."));

    }


}
