package cn.com.bluemoon.springbootwebsimple.Controller;

import cn.com.bluemmon.springbootutils.helper.CommonMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author huangfuchao
 */
@RestController
@RequestMapping("/test")
public class TestController {
    /**
     * 获取时间
     * @return
     */
    @GetMapping("/getDate")
    public String getDate(){
        LocalDateTime localDate= CommonMethod.getCurDate();
        return "当前时间为:"+DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDate);
    }
}
