package com.mobile.wordpress.steps;

import com.appium.manager.ATDRunner;
import org.testng.annotations.Test;

public class RunnerCukes {

    @Test
    public void testCukesRunner() throws Exception {
        ATDRunner parallelThread = new ATDRunner();
        parallelThread.runner("");
    }
}
