package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Capabilities {
    APP_PACKAGES("appium:appPackage", "com.exito.appcompania"),
    APP_ACTIVITY("appium:appActivity", "com.exito.appcompania.views.initialaccess.activities.SplashActivity"),
    APP_GRANT_PERMISSIONS("appium:autoGrantPermissions", true),
    APP_KEYBOARD("appium:resetKeyboard", true),
    APP_PLATFORM_NAME("platformName", "Android"),
    APP_PLATFORM_VERSION("appium:platformVersion", "11"),
    APP_AUTOMATION_NAME("appium:automationName", "UiAutomator2"),
    APP_LANGUAGE("appium:language", "es"),
    APP_LENGUAGE("appium:locale", "ES"),
    APP_REST("appium:noReset", false),
    APP_DEVICE_NAME("appium:deviceName", "99mbwomjfaaybyhu"),
    APP_TIME_OUT("appium:uiautomator2ServerInstallTimeout", "30000");
    private final String key;
    private final Object value;
}
