package app;

import javax.inject.Inject;

public class MyClient {

    @Inject
    ThirdPartyService thirdPartyService;

    public String doSomething() {
        return thirdPartyService.hello();
    }
}
