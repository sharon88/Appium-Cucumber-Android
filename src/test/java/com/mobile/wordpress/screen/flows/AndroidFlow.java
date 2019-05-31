package com.mobile.wordpress.screen.flows;


import com.mobile.wordpress.config.DeviceInterface;
import com.mobile.wordpress.config.Helpers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.Dimension;


import java.time.Duration;
import java.util.stream.IntStream;

public class AndroidFlow extends Helpers implements DeviceInterface {

    public AndroidFlow(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    public MobileElement scrollUp(MobileElement element) {
        verticalSwipe(element);
        return element;
    }

    private void verticalSwipe(MobileElement locator) {
        Dimension size = locator.getSize();
        IntStream.range(0, 3).forEach(value -> {
            int height = size.height / 2;
            new TouchAction(driver)
                    .press(ElementOption.element(locator, size.width / 2, height))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                    .moveTo(ElementOption.element(locator, size.width / 2, height / 2 - height))
                    .release().perform();


        });

    }

}
