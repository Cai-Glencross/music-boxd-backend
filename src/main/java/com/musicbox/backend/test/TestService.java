package com.musicbox.backend.test;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    /**
     * A test method to test that the API is working properly.
     * @return - A simple DTO.
     */
    public TestDTO getTestResponseDTO() {
        TestDTO response = new TestDTO();
        response.testString = "hello world!";
        return response;
    }
}
