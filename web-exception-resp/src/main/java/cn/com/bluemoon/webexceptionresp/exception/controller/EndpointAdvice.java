package cn.com.bluemoon.webexceptionresp.exception.controller;

import cn.com.bluemoon.webexceptionresp.exception.dto.ResultDto;
import cn.com.bluemoon.webexceptionresp.exception.service.ElemException;
import cn.com.bluemoon.webexceptionresp.exception.service.PelemException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangfuchao
 */
@ControllerAdvice
@RestController
public class EndpointAdvice {

    /**
     * 404 参数错误
     * @param e
     * @return
     */
    @ExceptionHandler(ElemException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResultDto<Void> eleException(ElemException e){

        return new ResultDto(e.getMessage());
    }

    /**
     * 400 参数不正确
     * @param e
     * @return
     */
    @ExceptionHandler(PelemException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResultDto<Void> eleException(PelemException e){
        return new ResultDto(e.getMessage());
    }

    /**
     * 其他错误 参数不正确
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResultDto<Void> otherException(Exception e){
        return new ResultDto(e.getMessage());
    }
}
