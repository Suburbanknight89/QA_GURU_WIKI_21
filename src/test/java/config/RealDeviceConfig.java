package config;

        import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/real_device.properties"
})
public interface RealDeviceConfig extends Config {
    @Key("real_device.server.url")
    String getReal_DeviceServerUrl();

    @Key("platform.name")
    String platformName();

    @Key("device.name")
    String deviceName();

    @Key("version")
    String version();

    @Key("app.url")
    String appURL();
}