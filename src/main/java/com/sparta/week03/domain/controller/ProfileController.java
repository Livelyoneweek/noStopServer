package com.sparta.week03.domain.controller;

import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@AllArgsConstructor
@RestController
public class ProfileController {

    private final Environment env;

    // 프로젝트의 환경설정 값을 다루는 Environment Bean을 DI 받아 현재 활성화된 Profile을 반환
    @GetMapping("/profile")
    public String profile() {
        return Arrays.stream(env.getActiveProfiles())
                .findFirst()
                .orElse("");
    }
}