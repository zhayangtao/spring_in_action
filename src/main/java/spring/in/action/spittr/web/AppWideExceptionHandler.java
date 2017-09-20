package spring.in.action.spittr.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by shliangyan on 2017/9/20.
 */
@ControllerAdvice
public class AppWideExceptionHandler {

    public String duplicateSpittlehandler() {
        return "error/duplicate";
    }
}
