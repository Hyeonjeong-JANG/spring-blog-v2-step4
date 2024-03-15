package shop.mtcoding.blog._core.errors;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import shop.mtcoding.blog._core.errors.exception.*;

@ControllerAdvice // RuntimeException이 터지면 해당 파일로 오류가 모인다.
public class MyExceptionHandler{ // exception 전용 컨트롤러
    @ExceptionHandler(Exception400.class)
    public String ex400(Exception400 e, HttpServletRequest request) {
        request.setAttribute("msg", e.getMessage());
        return "err/400";
    }

    @ExceptionHandler(Exception401.class)
    public String ex401(Exception401 e, HttpServletRequest request) {
        request.setAttribute("msg", e.getMessage());
        return "err/401";
    }

    @ExceptionHandler(Exception403.class)
    public String ex403(Exception403 e, HttpServletRequest request) {
        request.setAttribute("msg", e.getMessage());
        return "err/403";
    }

    @ExceptionHandler(Exception404.class)
    public String ex404(Exception404 e, HttpServletRequest request) {
        request.setAttribute("msg", e.getMessage());
        return "err/404";
    }

    @ExceptionHandler(Exception500.class)
    public String ex500(Exception500 e, HttpServletRequest request) {
        request.setAttribute("msg", e.getMessage());
        return "err/500";
    }

//    @ExceptionHandler(Exception.class)
//    public String exUnknown(Exception e) {
//        // DB에러 로그도 남기고
//        // 관리자 문자 날려주고
//        // 이메일도 날려주고
//        return "err/exUnknown";
//    }
}
