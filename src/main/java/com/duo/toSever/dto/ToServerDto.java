package com.duo.toSever.dto;

import com.duo.toSever.entity.ToServerEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ToServerDto {

    private String name;
    private String message;

    public ToServerEntity toServerEntity()
    {
        return new ToServerEntity(name,message);
    }

}
