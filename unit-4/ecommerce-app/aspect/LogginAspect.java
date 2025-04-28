package org.ncu.ecommerce_app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
	// ✅ Task 1 – @Before Advice
    @Before("execution(* org.ncu.ecommerce_app.services.SmartProductService.saveSmartProduct(..))")
    public void logBeforeSave(JoinPoint joinPoint) {
        System.out.println("🚀 [Before] Method called: " + joinPoint.getSignature().getName());
    }

    // ✅ Task 2 – @After Advice
    @After("execution(* org.ncu.ecommerce_app.services.SmartProductService.getSmartProduct(..))")
    public void logAfterGet(JoinPoint joinPoint) {
        System.out.println("✅ [After] Method finished: " + joinPoint.getSignature().getName());
    }

    // ✅ Task 3 – @AfterReturning Advice
    @AfterReturning(
        pointcut = "execution(* org.ncu.ecommerce_app.services.CategoryService.getCategoryById(..))",
        returning = "result")
    public void logAfterReturningCategory(Object result) {
        System.out.println("🎉 [AfterReturning] Returned category: " + result);
    }

    // ✅ Task 4 – @AfterThrowing Advice
    @AfterThrowing(
        pointcut = "execution(* org.ncu.ecommerce_app.services.SmartProductService.deleteProduct(..))",
        throwing = "ex")
    public void logAfterThrowing(Exception ex) {
        System.out.println("❌ [AfterThrowing] Exception caught: " + ex.getClass().getSimpleName() +
                           " - " + ex.getMessage());
    }

    // ✅ Task 5 – @Around Advice
    @Around("execution(* org.ncu.ecommerce_app.controllers.SmartProductController.*(..))")
    public Object trackExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long duration = System.currentTimeMillis() - startTime;

        System.out.println("⏱ [Around] Execution time of " + joinPoint.getSignature().getName() +
                           ": " + duration + " ms");
        return result;
    }
}
