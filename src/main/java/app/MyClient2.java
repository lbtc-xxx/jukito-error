package app;

import javax.inject.Inject;

public class MyClient2 {

    @Inject
    MyService myService;

    public String doSomething() {
        return myService.hello();
    }
}
