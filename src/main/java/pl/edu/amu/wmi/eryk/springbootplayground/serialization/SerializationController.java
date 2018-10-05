package pl.edu.amu.wmi.eryk.springbootplayground.serialization;

import com.github.dozermapper.core.Mapper;
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

    private final Mapper mapper;

    public SerializationController(Mapper mapper) {
        this.mapper = mapper;
    }

    @RequestMapping("/empty")
    public ResponseEntity<EmptyObject> empty() {
        return ResponseEntity.ok(new EmptyObject());
    }

    @RequestMapping(value = "/empty", method = RequestMethod.POST)
    public void postEmpty(@RequestBody EmptyObject emptyObject) {
        LOGGER.info(emptyObject.toString());
    }

    @RequestMapping("/get")
    public GetObjectDTO get() {
        return mapper.map(new GetObject(), GetObjectDTO.class);
    }

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public void postGet(@RequestBody GetObjectDTO getObject) {
        GetObject getObject1 = mapper.map(getObject, GetObject.class);
        LOGGER.info(getObject1.toString());
    }

}
