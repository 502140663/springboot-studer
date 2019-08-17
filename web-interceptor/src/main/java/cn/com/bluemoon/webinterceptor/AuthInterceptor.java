package cn.com.bluemoon.webinterceptor;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * 权限拦截类
 */
public class AuthInterceptor implements HandlerInterceptor {

    /**
     * 重写了preHandle
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String authHeader=request.getHeader(HttpHeaders.AUTHORIZATION);

        //只有 weidan才能通过
        if(Objects.nonNull(authHeader)&& !authHeader.isEmpty()&&authHeader.equals("weidan")){
            return true;
        }
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        return false;
    }
}
