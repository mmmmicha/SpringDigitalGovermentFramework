package kr.re.kitri.hello.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class KitriAspect {

    private static Logger log = LoggerFactory.getLogger(KitriAspect.class);

    @Before("execution(* kr.re.kitri.hello.service.*Service.*(..))")// point-cut 표현식
    public void logging(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + "에서 로그를 남깁니다.");
    }

    @Around("execution(* kr.re.kitri.hello..dao.*Dao.*(..))")
    public Object measureAdvice(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object obj = pjp.proceed();  // 해당 함수를 실행 시킨다.
        long endTime = System.currentTimeMillis();

        long estimateTime = endTime - startTime;
        log.debug("[" + pjp.getSignature().getDeclaringTypeName() + "] 클래스의 [" +
                pjp.getSignature().getName() + "] 메소드의 수행시간은 [" +
                estimateTime + "] 밀리초 입니다.");
        return obj;
    }


}
