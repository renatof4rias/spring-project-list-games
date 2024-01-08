package com.softelse.resourcers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softelse.dto.GameListDTO;
import com.softelse.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListResource {

	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public ResponseEntity<List<GameListDTO>> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return ResponseEntity.ok().body(result);
	}
	
	
}
