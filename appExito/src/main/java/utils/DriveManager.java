package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static enums.Capabilities.*;

public class DriveManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(DriveManager.class);
    private static WebDriver driver = null;
    private static AppiumDriverLocalService server = null;

    public static WebDriver start() {
        server = new AppiumServiceBuilder().withIPAddress("127.0.0.1").usingAnyFreePort().build();
        server.start();
        server.clearOutPutStreams();
        UiAutomator2Options capabilities = new UiAutomator2Options();
        capabilities.setCapability(APP_PACKAGES.getKey(), APP_PACKAGES.getValue());
        capabilities.setCapability(APP_ACTIVITY.getKey(), APP_ACTIVITY.getValue());
        capabilities.setCapability(APP_GRANT_PERMISSIONS.getKey(), APP_GRANT_PERMISSIONS.getValue());
        capabilities.setCapability(APP_KEYBOARD.getKey(), APP_KEYBOARD.getValue());
        capabilities.setCapability(APP_PLATFORM_NAME.getKey(), APP_PLATFORM_NAME.getValue());
        capabilities.setCapability(APP_PLATFORM_VERSION.getKey(), APP_PLATFORM_VERSION.getValue());
        capabilities.setCapability(APP_AUTOMATION_NAME.getKey(), APP_AUTOMATION_NAME.getValue());
        capabilities.setCapability(APP_LANGUAGE.getKey(), APP_LANGUAGE.getValue());
        capabilities.setCapability(APP_LENGUAGE.getKey(), APP_LENGUAGE.getValue());
        capabilities.setCapability(APP_REST.getKey(), APP_REST.getValue());
        capabilities.setCapability(APP_DEVICE_NAME.getKey(), APP_DEVICE_NAME.getValue());
        capabilities.setCapability(APP_TIME_OUT.getKey(), APP_TIME_OUT.getValue());
        driver = new AndroidDriver(server.getUrl(), capabilities);
        return driver;
    }

    public static void stop() {
        if (driver != null) {
            LOGGER.info("driver cerrado");
            driver.quit();
        }
        if (server != null) {
            LOGGER.info("se cierra el servicio");
            server.stop();
        }
    }

    public static AndroidDriver getDriver() {
        return (AndroidDriver) driver;
    }
}
