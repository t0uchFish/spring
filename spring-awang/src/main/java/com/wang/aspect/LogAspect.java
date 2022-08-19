//package com.wang.aspect;
//
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
//
///**
// * controller输入输出日志
// *
// * @author Jason.wang
// * @version 1.0
// */
//@Aspect
//@Component
//public class LogAspect {
//
//    /**
//     * 将xx换成实际项目
//     */
//    @Around("execution(* com.wang.WangTest(..))")
//    public Object logElapseTime(ProceedingJoinPoint pjp) throws Throwable {
//		System.out.println("动态代理");
//        Object result = pjp.proceed();
//        return result;
//    }
//}
