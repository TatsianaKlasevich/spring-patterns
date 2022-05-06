package com.klasevich.spring.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class EmployeeLoggingAspect {

    @Around("execution(* com.klasevich.spring.repository.impl.get*(*))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();
        log.info("Begin of {}", methodName);
        Object targetMethodResult = proceedingJoinPoint.proceed();
        log.info("End of {}", methodName);
        return targetMethodResult;
    }
}