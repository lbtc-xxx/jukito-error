package app;

import com.google.inject.PrivateModule;

public class ThirdPartyPrivateModule extends PrivateModule {

    @Override
    protected void configure() {
        install(new ThirdPartyModule());
    }
}
