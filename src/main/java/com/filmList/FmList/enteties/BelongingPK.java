package com.filmList.FmList.enteties;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
	
	@ManyToOne
	@JoinColumn(name = "film_id")
	private Film film;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private FilmList list;
	
	public BelongingPK() {
	}

	public BelongingPK(Film film, FilmList list) {
		this.film = film;
		this.list = list;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public FilmList getList() {
		return list;
	}

	public void setList(FilmList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(film, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(film, other.film) && Objects.equals(list, other.list);
	}
	
	

}
