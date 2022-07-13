package com.example.springplayer.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Role {
    STRIKER("s"),
    MIDFIELDER("m"),
    DEFENDER("d"),
    WINGER("w"),
    GOAL_KEEPER("g");

    private String value;

    private static final Map<String, Role> roleMap = new HashMap<>();

    static {
        for (Role role: Role.values()) {
            roleMap.put(role.value, role);
        }
    }

    public static Role of(String s) {
        return roleMap.get(s);
    }
}
