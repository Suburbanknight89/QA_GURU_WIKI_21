package helpers;

import java.net.MalformedURLException;
import java.net.URL;

import static config.ProjectData.appiumConfig;
import static config.ProjectData.realDeviceConfig;

public class Real_DeviceHelper {
    public static URL getReal_DeviceServerUrl() {
        try {
            return new URL(realDeviceConfig.getReal_DeviceServerUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}