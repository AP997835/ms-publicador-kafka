package com.sample;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sample.dto.MensajeDto;
import com.sample.services.PublicadorService;

/**
 * @author
 *
 */
@RestController
public class AppController {

	@Value("${message.topic.name}")
    private String TOPIC_NAME;
    @Autowired
    private PublicadorService publicadorService;

    private final Logger log = LoggerFactory.getLogger(AppController.class);

    @GetMapping("/enviarMensaje")
    public MensajeDto enviarMensaje(
                    @RequestParam(value = "nombre", defaultValue = "Yisus") String nombre)
                    throws JsonProcessingException {
        MensajeDto m = new MensajeDto();
        m.setNombre(nombre);
        m.setUuid(UUID.randomUUID().toString());
        publicadorService.enviarMensaje(TOPIC_NAME, m);
        log.info("Mensaje enviado correctamente");
        return m;
    }

}
