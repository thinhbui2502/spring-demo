package com.example.springplayer.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Permission {
    CORNER("c"),
    FREE_KICK("f"),
    THROW_IN("t"),
    PENALTY("p");

    private String value;

    private static final Map<String, Permission> permissionMap = new HashMap<>();

    static {
        for (Permission permission : Permission.values()) {
            permissionMap.put(permission.value, permission);
        }
    }

    public static Permission of(String s) {
        return permissionMap.get(s);
    }
}
