package com.example.springplayer.service.impl;

import com.example.springplayer.mapper.PlayerMapper;
import com.example.springplayer.model.Player;
import com.example.springplayer.model.dto.PlayerDto;
import com.example.springplayer.repository.PLayerRepository;
import com.example.springplayer.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PlayerServiceImpl implements PlayerService {
    private final PLayerRepository playerRepository;

    private final PlayerMapper playerMapper;

    @Override
    public List<PlayerDto> getAllPlayers() {
        return playerMapper.toDtos(playerRepository.findAll());
    }

    @Override
    public void createNewUser(Player player) {
        playerRepository.save(player);
    }

    @Override
    public Page<Player> getAllUsersWithPage(Pageable pageable) {
        return playerRepository.findAll(pageable);
    }
}
