package com.example.springplayer.mapper;

import com.example.springplayer.model.Player;
import com.example.springplayer.model.dto.PlayerDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    PlayerDto toDto(Player player);

    List<PlayerDto> toDtos (List<Player> players);
}
