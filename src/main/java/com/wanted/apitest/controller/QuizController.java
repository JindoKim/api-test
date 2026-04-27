package com.wanted.apitest.controller;

import com.wanted.apitest.service.QuizService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/quiz")
@RequiredArgsConstructor
@Tag(name = "퀴즈 API", description = "퀴즈 관련 데이터 처리") // Swagger 카테고리 이름
public class QuizController {

    private final QuizService quizService;

    @GetMapping("/test")
    @Operation(summary = "테스트 퀴즈 조회", description = "화면 테스트용 샘플 퀴즈를 반환합니다.") // Swagger API 설명
    public String getTestQuiz() {
        return quizService.getTestQuiz();
    }
}
