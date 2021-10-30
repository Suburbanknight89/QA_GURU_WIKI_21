### Run tests in Browserstack
```bash
gradle clean test -DDeviceHost=BROWSER_STACK
```
### Run tests in Selenoid
```bash
gradle clean test -DDeviceHost=SELENOID
```
### Run tests in Emulator (set device name in properties)
```bash
gradle clean test -DDeviceHost=APPIUM
```
### Run tests on real device (set device name in properties)
```bash
gradle clean test -DDeviceHost=REAL_DEVICE
```