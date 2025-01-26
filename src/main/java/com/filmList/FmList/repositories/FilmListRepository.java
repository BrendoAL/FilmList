package com.filmList.FmList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filmList.FmList.enteties.FilmList;

public interface FilmListRepository extends JpaRepository<FilmList, Long> {

}
