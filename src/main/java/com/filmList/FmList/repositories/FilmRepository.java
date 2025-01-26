package com.filmList.FmList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filmList.FmList.enteties.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {

}
