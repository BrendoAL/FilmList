package com.filmList.FmList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.filmList.FmList.dto.FilmListDTO;
import com.filmList.FmList.enteties.FilmList;
import com.filmList.FmList.repositories.FilmListRepository;

@Service
public class FilmListService {
	
	@Autowired
	private FilmListRepository filmListRepository;

	@Transactional(readOnly = true)
	public List<FilmListDTO> findAll() {
		List<FilmList> result = filmListRepository.findAll();
		return result.stream().map(x -> new FilmListDTO(x)).toList();
	}
}
