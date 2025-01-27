package com.filmList.FmList.projections;

public interface FilmMinProjection {

	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
	Double getDuration();
}
