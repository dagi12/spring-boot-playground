package pl.edu.amu.wmi.eryk.springbootplayground.foo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by erykmariankowski on 15.10.2018.
 */
@Service
public class FooService {

    @Autowired
    FooStub fooStub;

    public String foo() {
        return fooStub.foo();
    }

}
