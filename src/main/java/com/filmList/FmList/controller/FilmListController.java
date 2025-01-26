package com.filmList.FmList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filmList.FmList.dto.FilmListDTO;
import com.filmList.FmList.services.FilmListService;

@RestController
@RequestMapping(value = "/lists")
public class FilmListController {
	
	@Autowired
	private FilmListService filmListService;
	
	@GetMapping
	public List<FilmListDTO> findAll(){
		List<FilmListDTO> result = filmListService.findAll();
		return result;
	}
}
