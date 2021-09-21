# Wikipedia Android tests

### To run tests appium (default):

```
gradle clean test -Ddevice.name=appium
```

где appium это настройки для real или emulator

### To run tests on Selenoid:

```
gradle clean test -Ddevice.host=selenoid
```

### To run tests on BrowserStack:

```
gradle clean test -Ddevice.host=browser_stack
```