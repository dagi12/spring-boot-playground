package pl.edu.amu.wmi.eryk.springbootplayground.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import pl.edu.amu.wmi.eryk.springbootplayground.foo.FooService;
import pl.edu.amu.wmi.eryk.springbootplayground.foo.FooStub;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by erykmariankowski on 15.10.2018.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {
        FooService.class,
        FooStub.class
})
public class MockitoPlayground {

    @Autowired
    FooService fooService;

    @Test
    public void shouldFoo() {
        //Authentication authentication = Mockito.mock(Authentication.class);
        //SecurityContext securityContext = Mockito.mock(SecurityContext.class);
        //Mockito.when(securityContext.getAuthentication()).thenReturn(authentication);
        //Mockito.when(authentication.getPrincipal()).thenReturn(principal);
        //SecurityContextHolder.setContext(securityContext);
        initMocks(this);
        FooStub fooStub = mock(FooStub.class);
        when(fooStub.foo()).thenReturn("bar");
        assertEquals("bar", fooStub.foo());
    }

}