package config;

import org.aeonbits.owner.ConfigFactory;

public class ProjectData {
    public static BrowserStackConfig browserStackConfig =
            ConfigFactory.create(BrowserStackConfig.class, System.getProperties());
    public static final AppiumConfig appiumConfig =
            ConfigFactory.create(AppiumConfig.class, System.getProperties());
    public static final SelenoidConfig selenoidConfig =
            ConfigFactory.create(SelenoidConfig.class, System.getProperties());
}