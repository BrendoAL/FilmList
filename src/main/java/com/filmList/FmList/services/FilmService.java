package com.filmList.FmList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filmList.FmList.dto.FilmMinDTO;
import com.filmList.FmList.enteties.Film;
import com.filmList.FmList.repositories.FilmRepository;

@Service
public class FilmService {
	
	//chamada da 
	@Autowired
	private FilmRepository filmRepository;

	public List<FilmMinDTO> findAll() {
		List<Film> result = filmRepository.findAll();
		return result.stream().map(x -> new FilmMinDTO(x)).toList();
	}
}
