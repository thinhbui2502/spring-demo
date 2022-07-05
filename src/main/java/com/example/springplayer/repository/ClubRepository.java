package com.example.springplayer.repository;

import com.example.springplayer.model.Club;
import com.example.springplayer.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClubRepository extends JpaRepository<Club, Long> {
    @Query("select c.players from Club c where c.id = :clubId")
    List<Player> getPlayerByClubId(Long clubId);
}
