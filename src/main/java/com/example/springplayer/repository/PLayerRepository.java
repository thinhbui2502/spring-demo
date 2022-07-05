package com.example.springplayer.repository;

import com.example.springplayer.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PLayerRepository extends JpaRepository<Player, Long> {
}
