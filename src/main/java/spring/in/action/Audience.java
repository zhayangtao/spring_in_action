package spring.in.action;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by shliangyan on 2017/9/18.
 */
@Aspect
public class Audience {

    @Before("execution(* spring.in.action.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("execution(* spring.in.action.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @Pointcut("execution(* spring.in.action.Performance.perform(..))")
    public void performance() {

    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {

    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
