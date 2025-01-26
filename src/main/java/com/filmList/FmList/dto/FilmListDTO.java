package com.filmList.FmList.dto;

import com.filmList.FmList.enteties.FilmList;

public class FilmListDTO {
	
	private Long id;
	private String name;
	
	public FilmListDTO() {
	}

	public FilmListDTO(FilmList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
