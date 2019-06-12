package com.mobile.wordpress.config;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class Locators {
    public static final By USERNAME_ID = MobileBy.id("nux_username");
    public static final By PASSWORD_ID = MobileBy.id("nux_password");
    public static final By SIGNIN_BUTTON = MobileBy.id("nux_sign_in_button");
    public static final By LOGGED_IN_TITLE_ID = MobileBy.id("tab_layout");
    public static final By SIGNOUT = MobileBy.id("me_login_logout_text_view");
    public static final By CONFIRM_LOGOUT_BUTTON = By.id("android:id/button1");
    public static final By CANCEL_LOGOUT_BUTTON = By.id("android:id/button2");
    public static final By ACCOUNT_SETTINGS_ID = By.id("me_settings_text_view");
    public static final By LOGOUT_CONFIRM_MESSAGE_ID = By.id("android:id/message");
    public static final By ACC_USERNAME_ID = By.id("me_username");
    public static final By NOTIFICATION_ID = By.id("android:id/title");
    public static final By CHECKBOX_ID = By.id("android:id/checkbox");
    public static final By TURN_OFF_CONFIRM = By.id("notificationsOff");
    public static final By POST_TITLE_ID = MobileBy.id("note_subject");
    public static final By POST_ID = MobileBy.id("note_text");
    public static final By TAB_ID = MobileBy.id("tab_icon");
}
