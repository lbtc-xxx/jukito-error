package app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlainTest {

    Injector injector;

    @Before
    public void setUp() throws Exception {
        injector = Guice.createInjector(new MyModule());
    }

    @Test
    public void getMyClientInstanceSucceeds() throws Exception {
        final MyClient sut = injector.getInstance(MyClient.class);

        final String actual = sut.doSomething();

        assertEquals("hello", actual);
    }

    @Test
    public void getThirdPartyServiceInstanceSucceeds() throws Exception {
        final ThirdPartyService sut = injector.getInstance(Key.get(ThirdPartyService.class, MyAnnotation.class));

        final String actual = sut.hello();

        assertEquals("hello", actual);
    }
}
