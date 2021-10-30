### Wikipedia Mobile App testing using


![java](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Java.png?raw=true "Java")
![Selenoid](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Selenoid.png?raw=true "Selenoid")
![gradle](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Gradle.png?raw=true "Gradle")
![jUnit5](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/JUnit5.png?raw=true "JUnit5")

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