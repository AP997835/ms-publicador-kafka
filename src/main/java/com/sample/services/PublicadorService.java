package com.sample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.dto.MensajeDto;

/**
 * Publicador service
 * @author daniel.mendez
 *
 */
@Service
public class PublicadorService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	/**
	 * Envio de mensaje hacia el tópico de Kafka
	 * @param topico
	 * @param mensaje
	 * @throws JsonProcessingException
	 */
	public void enviarMensaje(final String topico, final MensajeDto mensaje) throws JsonProcessingException {
		
		String msg = objectMapper.writeValueAsString(mensaje);
		kafkaTemplate.send(topico, msg);
	}

}
