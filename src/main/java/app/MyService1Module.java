package app;

import com.google.inject.AbstractModule;

public class MyService1Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyService.class).to(MyServiceImpl1.class);
    }
}
