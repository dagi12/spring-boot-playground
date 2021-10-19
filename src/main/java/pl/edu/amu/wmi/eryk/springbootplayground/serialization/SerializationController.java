package pl.edu.amu.wmi.eryk.springbootplayground.serialization;


import com.github.dozermapper.core.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.TimeZone;

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
    public TomcatInto asd() {
        TimeZone aDefault = TimeZone.getDefault();
        LOGGER.info(aDefault.toString());
        return new TomcatInto(LocaleContextHolder.getLocale(), aDefault);
    }

    @PostMapping("/date")
    public GetObjectDTO date(@RequestBody GetObjectDTO dto) {
        LOGGER.info(String.valueOf(dto.getDate()));
        return dto;
    }

    public class TomcatInto {
        public Locale locale;
        public TimeZone timeZone;

        public TomcatInto(Locale locale, TimeZone aDefault) {
            this.locale = locale;
            this.timeZone = aDefault;
        }
    }

}
