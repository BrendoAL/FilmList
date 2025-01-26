package com.filmList.FmList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filmList.FmList.dto.FilmDTO;
import com.filmList.FmList.dto.FilmMinDTO;
import com.filmList.FmList.services.FilmService;

@RestController
@RequestMapping(value = "/films")
public class FilmControllers {
	
	@Autowired
	private FilmService filmService;

	@GetMapping(value = "/{id}")
	public FilmDTO findById(@PathVariable Long id){
		return filmService.findById(id);
	}
	
	@GetMapping
	public List<FilmMinDTO> findAll(){
		return filmService.findAll();
	}
}
