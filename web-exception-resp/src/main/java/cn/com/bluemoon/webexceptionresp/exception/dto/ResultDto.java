package cn.com.bluemoon.webexceptionresp.exception.dto;

import lombok.Data;

@Data
public class ResultDto<T> {
    private Boolean success;
    private T data;
    private String maessage;

    public ResultDto(T data) {
        this.success=true;
        this.data = data;
    }

    public ResultDto(Boolean success) {
        this.success = false;
    }
}
