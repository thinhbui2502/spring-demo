package com.example.springplayer.model.dto;

import com.example.springplayer.constant.Permission;
import com.example.springplayer.constant.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDto {
    private String name;
    private Permission permission;
    private List<Role> roles;
}
