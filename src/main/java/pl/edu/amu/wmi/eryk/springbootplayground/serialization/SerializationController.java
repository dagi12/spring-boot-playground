package pl.edu.amu.wmi.eryk.springbootplayground.serialization;


import com.github.dozermapper.core.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

/**
 * Stworzone przez Eryk Mariankowski dnia 18.06.18.
 */
@RestController
@RequestMapping("/api")
public class SerializationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SerializationController.class);

    private final Mapper mapper;

    public SerializationController(Mapper mapper) {
        this.mapper = mapper;
    }

    @RequestMapping(value = "/empty", method = RequestMethod.GET)
    public ResponseEntity<EmptyObject> empty() {
        return ResponseEntity.ok(new EmptyObject());
    }

    @RequestMapping(value = "/empty", method = RequestMethod.POST)
    public void postEmpty(@RequestBody EmptyObject emptyObject) {
        LOGGER.info(emptyObject.toString());
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public GetObjectDTO get() {
        return mapper.map(new GetObject(), GetObjectDTO.class);
    }

    @RequestMapping(value = "/post-get", method = RequestMethod.POST)
    public void postGet(@RequestBody GetObjectDTO getObject) {
        GetObject getObject1 = mapper.map(getObject, GetObject.class);
        LOGGER.info(getObject1.toString());
    }

    @GetMapping(value = "/locale")
    public Locale asd() {
        return LocaleContextHolder.getLocale();
    }

}
