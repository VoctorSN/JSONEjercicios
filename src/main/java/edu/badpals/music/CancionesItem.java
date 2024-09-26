package edu.badpals.music;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancionesItem{

	@JsonProperty("titulo")
	private String titulo;

	@JsonProperty("duracion")
	private Object duracion;

	@JsonProperty("autor")
	private String autor;

	public String getTitulo(){
		return titulo;
	}

	public Object getDuracion(){
		return duracion;
	}

	public String getAutor(){
		return autor;
	}
}