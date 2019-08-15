package cn.com.bluemmon.springbootutils.helper;

import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author huangfuchao
 */
@Controller
public class CommonMethod {
    /**
     * 返回当前时间
     * @return
     */
    public static LocalDateTime getCurDate(){
       return LocalDateTime.now();
    }
}
