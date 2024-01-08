package com.softelse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
