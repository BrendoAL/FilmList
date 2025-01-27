package com.filmList.FmList.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.filmList.FmList.enteties.Film;
import com.filmList.FmList.projections.FilmMinProjection;

public interface FilmRepository extends JpaRepository<Film, Long> {
	
	@Query(nativeQuery = true, value = """
	SELECT tb_film.id, tb_film.title, tb_film.film_year AS `year`, tb_film.img_url AS imgUrl,
	tb_film.short_description AS shortDescription, tb_belonging.position
	FROM tb_film
	INNER JOIN tb_belonging ON tb_film.id = tb_belonging.film_id
	WHERE tb_belonging.list_id = :listId
	ORDER BY tb_belonging.position
			""")
	
	List<FilmMinProjection> searchBylist(Long listId);
}
