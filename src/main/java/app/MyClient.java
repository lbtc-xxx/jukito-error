package app;

import javax.inject.Inject;

public class MyClient {

    @Inject
    @MyAnnotation1
    MyService myService1;

    @Inject
    @MyAnnotation2
    MyService myService2;

    public String doSomething() {
        return myService1.hello() + myService2.hello();
    }
}
