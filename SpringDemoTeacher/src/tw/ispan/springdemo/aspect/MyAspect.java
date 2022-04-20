package tw.ispan.springdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Before(value="execution(* tw.ispan.springdemo.model.EnglishTeacher.*(..))")
	public void before() {
		System.out.println("跑在方法前(驗證...)");
	}
	
	@After(value="execution(* tw.ispan.springdemo.model.EnglishTeacher.*(..))")
	public void after() {
		System.out.println("跑在方法後做...");
	}
	
	@Around(value="execution(* tw.ispan.springdemo.model.EnglishTeacher.*(..))")
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable {
		// 該方法執行前做的事
		System.out.println("Around 方法前");
		
		Object obj = joinpoint.proceed();
		
		// 該方法執行後做的事
		System.out.println("Around 方法後");
		return obj;
	}

}
