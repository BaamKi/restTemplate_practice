package com.duo.toSever.controller;


import com.duo.toSever.dto.ToServerDto;
import com.duo.toSever.entity.ToServerEntity;
import com.duo.toSever.service.ToServerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ToServerController {

    RestTemplate restTemplate = new RestTemplate();


    ToServerService toServerService;

    public ToServerController(ToServerService toServerService)
    {
        this.toServerService = toServerService;
    }

    @GetMapping("/hello")
    public String hello()
    {
        return toServerService.hello();
    }

    @PostMapping("/post")
    public ResponseEntity<ToServerEntity> posttest(@RequestBody ToServerDto dto) {

        log.info(dto.toServerEntity().getName() + dto.toServerEntity().getMessage());
        ToServerEntity testEntity = toServerService.hello2(dto);
        return ResponseEntity.status(HttpStatus.OK).body(testEntity);
    }


    @GetMapping("/send")
    public String send()
    {
        ToServerDto dto = new ToServerDto("승훈이는   ","안 귀여워");
        restTemplate.postForEntity("http://localhost:8080/test",dto,ToServerDto.class);
        return "값 전송하기";

    }



}
