package com.wanted.apitest.service;

import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class InquiryService {

    public String registerInquiry(Map<String, String> request) {
        String title = request.get("title");
        // 유튜브 링크 등 외부 미디어 대신 질의응답 본문에 집중하는 구조
        String questionAnswer = request.get("question_answer");

        // 향후 DAO/Repository를 통해 DB에 저장하는 로직이 들어갈 자리입니다.
        return "문의가 성공적으로 등록되었습니다. [제목: " + title + ", 내용: " + questionAnswer + "]";
    }
}