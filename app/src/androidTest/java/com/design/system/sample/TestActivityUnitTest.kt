package com.design.system.sample

import android.util.Log
import android.widget.Button
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso
import androidx.test.espresso.accessibility.AccessibilityChecks
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class TestActivityUnitTest {
    @get:Rule
    var activityScenarioRule: ActivityScenarioRule<TestActivity> =
        ActivityScenarioRule(TestActivity::class.java)

    init {
        AccessibilityChecks.enable()
    }

    @Test
    fun clickButton() {
        launchActivity<TestActivity>().onActivity {
            it.findViewById<Button>(R.id.buttonSmall).text
            Log.d("TEST", " " + it.findViewById<Button>(R.id.buttonSmall))
        }
        Espresso.onView(withId(R.id.buttonSmall)).perform(ViewActions.click())
    }
}
