package com.wanted.apitest.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/quiz")
@Tag(name = "퀴즈 API", description = "퀴즈 관련 데이터 처리")
public class QuizController {

    @GetMapping("/test")
    @Operation(summary = "테스트 퀴즈 조회", description = "화면 테스트용 샘플 퀴즈를 반환합니다.")
    public String getTestQuiz() {
        return "자바의 창시자는 누구일까요?";
    }

    // [추가된 경로 1] 퀴즈 목록 가져오기 (리스트 반환)
    @GetMapping("/list")
    @Operation(summary = "퀴즈 목록 조회", description = "현재 등록된 전체 퀴즈 목록을 가져옵니다.")
    public List<String> getQuizList() {
        return Arrays.asList("정보처리기사 기출모음", "최악의 면접 질문 월드컵", "스프링부트 핵심 개념");
    }

    // [추가된 경로 2] 특정 퀴즈 정답 제출 (POST 방식)
    @PostMapping("/{quizId}/submit")
    @Operation(summary = "퀴즈 정답 제출", description = "특정 퀴즈의 정답을 서버로 전송합니다.")
    public String submitQuiz(
            @Parameter(description = "퀴즈 ID 번호", example = "1") @PathVariable Long quizId,
            @Parameter(description = "유저가 선택한 정답", example = "제임스 고슬링") @RequestParam String answer) {

        return quizId + "번 퀴즈에 '" + answer + "' (으)로 답안을 제출했습니다. (자동 채점 중...)";
    }
}