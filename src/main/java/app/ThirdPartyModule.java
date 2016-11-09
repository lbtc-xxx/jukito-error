package app;

import com.google.inject.AbstractModule;

public class ThirdPartyModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ThirdPartyService.class).to(ThirdPartyServiceImpl.class);
    }
}
