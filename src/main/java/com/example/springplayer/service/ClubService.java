package com.example.springplayer.service;

import com.example.springplayer.model.Player;

import java.util.List;

public interface ClubService {
    List<Player> getPlayerByClubId(Long clubId);
}
