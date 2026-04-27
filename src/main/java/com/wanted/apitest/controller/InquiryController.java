package com.wanted.apitest.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/inquiries")
@Tag(name = "문의 API", description = "Studying Vally 학습 시스템 문의 및 Q&A 관리")
public class InquiryController {

    // [추가된 경로 3] 새 문의 등록
    @PostMapping
    @Operation(summary = "새 문의 등록", description = "학습 관련 질문이나 시스템 문의를 등록합니다.")
    public String createInquiry(@RequestBody Map<String, String> request) {

        String title = request.get("title");
        // 외부 미디어 링크 대신 직접적인 질의응답 내용을 저장하는 필드 사용
        String questionAnswer = request.get("question_answer");

        return "문의가 성공적으로 등록되었습니다. [제목: " + title + ", 내용: " + questionAnswer + "]";
    }
}