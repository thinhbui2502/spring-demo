package com.example.springplayer.controller;

import com.example.springplayer.config.MyConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/config")
@RequiredArgsConstructor
public class ConfigController {
    private final MyConfiguration myConfiguration;

    @GetMapping
    public String getConfigValue() {
        return myConfiguration.getFoo();
    }
}
