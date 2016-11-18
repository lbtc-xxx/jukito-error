package app;

import org.jukito.JukitoRunner;
import org.jukito.TestModule;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

// Workaround taken from https://github.com/ArcBees/Jukito/issues/70
// Thank you @mmadson !
@RunWith(JukitoRunner.class)
public class JukitoWorkaroundTest {

    @Inject
    MyClient myClient;
    @Inject
    @MyAnnotation
    ThirdPartyService thirdPartyService;

    @Test
    public void myClientWorks() throws Exception {
        final String actual = myClient.doSomething();

        assertEquals("hello", actual);
    }

    @Test
    public void thirdPartyServiceWorks() throws Exception {
        final String actual = thirdPartyService.hello();

        assertEquals("hello", actual);
    }

    public static class MyJukitoModule extends TestModule {

        @Override
        protected void configureTest() {
            install(new MyModule());
        }
    }
}
