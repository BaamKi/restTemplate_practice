package com.duo.toSever.service;

import com.duo.toSever.dto.ToServerDto;
import com.duo.toSever.entity.ToServerEntity;
import org.springframework.stereotype.Service;

@Service
public class ToServerService {
    public String hello()
    {
        return "hello";
    }

    public ToServerEntity hello2(ToServerDto toServerDto)
    {
        ToServerEntity toServerEntity = toServerDto.toServerEntity();
        return toServerEntity;
    }

}
