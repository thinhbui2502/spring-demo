package com.example.springplayer.model;

import com.example.springplayer.constant.Permission;
import com.example.springplayer.constant.Role;
import com.example.springplayer.converter.PermissionEnumConverter;
import com.example.springplayer.converter.RoleEnumConverter;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "player")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "name")
    private String name;

    @Convert(converter = PermissionEnumConverter.class)
    private Permission permission;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "player_role", joinColumns = {@JoinColumn(name = "player_id")})
    @Column(name = "role")
    @Convert(converter = RoleEnumConverter.class)
    private List<Role> roles = new ArrayList<>();
}
