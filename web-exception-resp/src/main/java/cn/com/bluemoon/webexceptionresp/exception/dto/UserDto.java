package cn.com.bluemoon.webexceptionresp.exception.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;

    private String name;

    private Integer age;

    public UserDto(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
