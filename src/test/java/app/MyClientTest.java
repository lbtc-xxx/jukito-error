package app;

import org.jukito.JukitoRunner;
import org.jukito.UseModules;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

@RunWith(JukitoRunner.class)
@UseModules(MyModule.class)
public class MyClientTest {

    @Inject
    MyClient sut;

    @Test
    public void injectionFails() throws Exception {
        final String actual = sut.doSomething();

        assertEquals("hello", actual);
    }
}
