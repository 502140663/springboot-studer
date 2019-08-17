package cn.com.bluemoon.webexceptionresp.exception.controller;

import cn.com.bluemoon.webexceptionresp.exception.dto.ResultDto;
import cn.com.bluemoon.webexceptionresp.exception.dto.UserDto;
import cn.com.bluemoon.webexceptionresp.exception.service.ElemException;
import cn.com.bluemoon.webexceptionresp.exception.service.PelemException;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("{id}")
    public ResultDto<UserDto> idOf(@PathVariable("id") Long id){
        //404 错误
        if(id>100){
            throw new  ElemException("狗蛋");
        }
        //参数错误
        if(id % 2==0){
            throw new PelemException("用户");
        }
        UserDto userDto=new UserDto(id,"法兰斯波兰巴德",0);

        return new ResultDto<>(userDto);

    }
}
