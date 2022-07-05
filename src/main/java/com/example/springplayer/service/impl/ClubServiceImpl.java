package com.example.springplayer.service.impl;

import com.example.springplayer.model.Player;
import com.example.springplayer.repository.ClubRepository;
import com.example.springplayer.service.ClubService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClubServiceImpl implements ClubService {

    private final ClubRepository clubRepository;

    @Override
    public List<Player> getPlayerByClubId(Long clubId) {
        return clubRepository.getPlayerByClubId(clubId);
    }
}
