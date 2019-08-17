package cn.com.bluemoon.webexceptionresp.exception.service;

public class PelemException extends AbrException {
    public PelemException(String message) {
        super(message+"参数错误");
    }
}
