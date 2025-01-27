package com.filmList.FmList.dto;

import com.filmList.FmList.enteties.Film;
import com.filmList.FmList.projections.FilmMinProjection;

public class FilmMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public FilmMinDTO () {
	}

	public FilmMinDTO(Film entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	public FilmMinDTO(FilmMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear(); 
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
