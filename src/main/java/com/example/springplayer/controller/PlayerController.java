package com.example.springplayer.controller;

import com.example.springplayer.model.Player;
import com.example.springplayer.model.dto.PlayerDto;
import com.example.springplayer.repository.PLayerRepository;
import com.example.springplayer.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/player")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @GetMapping()
    public ResponseEntity<List<PlayerDto>> getListUser() {
        return new ResponseEntity<>(playerService.getAllPlayers(), HttpStatus.OK);
    }

    @GetMapping("/page")
    public ResponseEntity<Page<Player>> getListUserWithPage(@RequestParam int pageSize, @RequestParam int cursor) {
        Page<Player> users = playerService.getAllUsersWithPage(PageRequest.of(cursor, pageSize));
        if (users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.ok(users);
    }

    @PostMapping("/create")
    public ResponseEntity<Player> saveUser(@RequestBody Player player) {
        playerService.createNewUser(player);
        return new ResponseEntity<>(player, HttpStatus.OK);
    }
}
