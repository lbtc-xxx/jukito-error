package app;

import com.google.inject.PrivateModule;

public class ThirdPartyPrivateModule extends PrivateModule {

    @Override
    protected void configure() {
        install(new ThirdPartyModule());
        bind(ThirdPartyService.class).annotatedWith(MyAnnotation.class).toProvider(binder().getProvider(ThirdPartyService.class));
        expose(ThirdPartyService.class).annotatedWith(MyAnnotation.class);
        bind(MyClient.class);
        expose(MyClient.class);
    }
}
