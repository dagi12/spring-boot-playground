package pl.edu.amu.wmi.eryk.springbootplayground.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import pl.edu.amu.wmi.eryk.springbootplayground.foo.FooService;
import pl.edu.amu.wmi.eryk.springbootplayground.foo.FooStub;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by erykmariankowski on 15.10.2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebTestClientPlayground {

    @MockBean
    FooStub fooStub;

    @Autowired
    FooService fooService;

    @Test
    public void shouldFoo() {
        when(fooStub.foo()).thenReturn("bar");
        assertEquals("bar", fooService.foo());
    }

}
