package app;

import org.jukito.JukitoRunner;
import org.jukito.UseModules;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(JukitoRunner.class)
@UseModules(MyModule.class)
public class MyClient2Test {

    @Inject
    MyClient2 sut;

    @Test
    public void name() throws Exception {
        System.out.println(sut);
    }
}