package com.hsu.test.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomAPIResponse<T> {

    private int status;
    private T data; // 어떤 형태로 값이 반환될지 모름
    private String message;

    // 통신 성공
    public static <T> CustomAPIResponse<T> createSuccess(int status, T data, String message) {
        return new CustomAPIResponse<T>(status, data, message);
    }

    // 통신 실패
    public static <T> CustomAPIResponse<T> createFailWithout (int status, String message) {
        return new CustomAPIResponse<T>(status, null, message);
    }

}
