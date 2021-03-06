package com.example.historyCore.repositories;

import com.example.historyCore.entities.PlayedGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayedGameRepository extends JpaRepository<PlayedGame, Long> {
}
