package com.example.springplayer.service;

import com.example.springplayer.model.Player;
import com.example.springplayer.model.dto.PlayerDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PlayerService {
    List<PlayerDto> getAllPlayers();

    void createNewUser(Player user);

    Page<Player> getAllUsersWithPage(Pageable pageable);

}
