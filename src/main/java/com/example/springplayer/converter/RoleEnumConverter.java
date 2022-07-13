package com.example.springplayer.converter;

import com.example.springplayer.constant.Role;

import javax.persistence.AttributeConverter;

public class RoleEnumConverter implements AttributeConverter<Role, String> {
    @Override
    public String convertToDatabaseColumn(Role attribute) {
        return attribute.getValue();
    }

    @Override
    public Role convertToEntityAttribute(String dbData) {
        return Role.of(dbData);
    }
}
