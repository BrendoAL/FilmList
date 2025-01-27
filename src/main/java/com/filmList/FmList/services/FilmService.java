package com.filmList.FmList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.filmList.FmList.dto.FilmDTO;
import com.filmList.FmList.dto.FilmMinDTO;
import com.filmList.FmList.enteties.Film;
import com.filmList.FmList.projections.FilmMinProjection;
import com.filmList.FmList.repositories.FilmRepository;

@Service
public class FilmService {
	
	@Autowired
	private FilmRepository filmRepository;
	
	@Transactional(readOnly = true)
	public FilmDTO findById(Long id) {
		Film result = filmRepository.findById(id).get(); 
		return new FilmDTO(result);
	}

	@Transactional(readOnly = true)
	public List<FilmMinDTO> findAll() {
		List<Film> result = filmRepository.findAll();
		return result.stream().map(x -> new FilmMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<FilmMinDTO> findByList(Long ListId) {
		List<FilmMinProjection> result = filmRepository.searchBylist(ListId);
		return result.stream().map(x -> new FilmMinDTO(x)).toList();
	}
}
