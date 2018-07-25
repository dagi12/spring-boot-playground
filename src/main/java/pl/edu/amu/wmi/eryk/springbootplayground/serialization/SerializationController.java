package pl.edu.amu.wmi.eryk.springbootplayground.serialization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Stworzone przez Eryk Mariankowski dnia 18.06.18.
 */
@RestController
public class SerializationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SerializationController.class);

    @RequestMapping("/empty")
    public ResponseEntity<EmptyObject> empty() {
        return ResponseEntity.ok(new EmptyObject());
    }

    @RequestMapping(value = "/empty", method = RequestMethod.POST)
    public void postEmpty(@RequestBody EmptyObject emptyObject) {
        LOGGER.info(emptyObject.toString());
    }

    @RequestMapping("/get")
    public GetObject get() {
        return new GetObject();
    }

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public void postGet(@RequestBody GetObject getObject) {
        LOGGER.info(getObject.toString());
    }

    @RequestMapping("/set")
    public SetObject set() {
        return new SetObject();
    }

    @RequestMapping(value = "/set", method = RequestMethod.POST)
    public void postSet(@RequestBody SetObject setObject) {
        LOGGER.info(setObject.toString());
    }

}
