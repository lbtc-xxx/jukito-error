package app;

import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new ThirdPartyPrivateModule());
    }
}
