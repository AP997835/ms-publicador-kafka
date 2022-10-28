package com.sample.dto;

import java.io.Serializable;

/**
 * Clase mensaje dto
 * @author daniel.mendez
 *
 */
public class MensajeDto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private String nombre;
	
	/**
	 * 
	 */
	private String uuid;

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * 
	 * @param uuid
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	
	
	

}
