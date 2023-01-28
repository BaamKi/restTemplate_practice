package com.duo.toSever.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToServerEntity {
    public String name;
    public String message;

    public ToServerEntity(String name, String message) {
        this.name = name;
        this.message =message;
    }

}
