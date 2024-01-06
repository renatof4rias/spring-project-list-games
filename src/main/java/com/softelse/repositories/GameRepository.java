package com.softelse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
