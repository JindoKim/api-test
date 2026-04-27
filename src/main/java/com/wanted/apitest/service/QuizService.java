package com.wanted.apitest.service;

import org.springframework.stereotype.Service;

@Service
public class QuizService {

    public String getTestQuiz() {
        // 실제로는 여기서 여러 DAO/Repository나 DTO를 조합하여 데이터를 가공합니다.
        return "자바의 창시자는 누구일까요?";
    }
}