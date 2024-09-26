package edu.badpals.music;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListasItem{

	@JsonProperty("fecha")
	private String fecha;

	@JsonProperty("canciones")
	private List<CancionesItem> canciones;

	@JsonProperty("nombre")
	private String nombre;

	public String getFecha(){
		return fecha;
	}

	public List<CancionesItem> getCanciones(){
		return canciones;
	}

	public String getNombre(){
		return nombre;
	}
}