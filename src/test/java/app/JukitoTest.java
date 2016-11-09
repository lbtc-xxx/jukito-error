package app;

import org.jukito.JukitoRunner;
import org.jukito.UseModules;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

// This doesn't work
@RunWith(JukitoRunner.class)
@UseModules(MyModule.class)
public class JukitoTest {

    @Inject
    MyClient myClient;
    @Inject
    @MyAnnotation
    ThirdPartyService thirdPartyService;

    @Test
    public void injectionFails() throws Exception {
        final String actual = myClient.doSomething();

        assertEquals("hello", actual);
    }
}
