package com.changyanwei.mini_service.controller;

import com.changyanwei.mini_service.vo.TestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @PostMapping("/test")
    public ResponseEntity<Object> test(@RequestBody String body) {
        log.info("test:{}", body);
        TestVo testVo = new TestVo();
        testVo.setName("123");
        testVo.setPwd("123");
        return new ResponseEntity(testVo, HttpStatus.OK);
    }
}
