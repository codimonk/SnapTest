package com.design.system.sample

import androidx.test.core.app.launchActivity
import com.karumi.shot.ActivityScenarioUtils.waitForActivity
import com.karumi.shot.ScreenshotTest
import org.junit.Test

class ButtonScreenshotTest : ScreenshotTest {

    @Test
    fun capture_button_screenshot() {
        val scenario = launchActivity<TestActivity>()
        compareScreenshot(scenario.waitForActivity())
    }
}
