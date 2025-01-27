package com.filmList.FmList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filmList.FmList.dto.FilmListDTO;
import com.filmList.FmList.dto.FilmMinDTO;
import com.filmList.FmList.services.FilmListService;
import com.filmList.FmList.services.FilmService;

@RestController
@RequestMapping(value = "/lists")
public class FilmListController {
	
	@Autowired
	private FilmListService filmListService;
	
	@Autowired
	private FilmService filmService;
	
	@GetMapping
	public List<FilmListDTO> findAll(){
		List<FilmListDTO> result = filmListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/films")
	public List<FilmMinDTO> findByList(@PathVariable Long listId){
		List<FilmMinDTO> result = filmService.findByList(listId);
		return result;
	}

}
