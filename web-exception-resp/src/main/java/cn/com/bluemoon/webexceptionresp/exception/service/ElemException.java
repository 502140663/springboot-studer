package cn.com.bluemoon.webexceptionresp.exception.service;

public class ElemException extends AbrException {
    public ElemException(String message) {
        super(message+"不存在");
    }
}
