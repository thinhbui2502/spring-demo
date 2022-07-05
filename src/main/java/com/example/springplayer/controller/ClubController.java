package com.example.springplayer.controller;

import com.example.springplayer.model.Club;
import com.example.springplayer.model.Player;
import com.example.springplayer.repository.ClubRepository;
import com.example.springplayer.service.ClubService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/club")
@RequiredArgsConstructor
public class ClubController {
    private final ClubService clubService;

    @GetMapping()
    public ResponseEntity<List<Player>> getAll(@RequestParam("clubId") Long clubId) {
        return new ResponseEntity<>(clubService.getPlayerByClubId(clubId), HttpStatus.OK);
    }
}
