package aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
// import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class CacheAspect {
	private Map<Long, Object> cache = new HashMap<>();
	
//	@Pointcut("execution(public * chap07 ..*(long))")
//	public void cacheTarget() {
//	}
	
	@Around("execution(public * chap07 ..*(long))")
	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
		Long num = (Long) joinPoint.getArgs()[0];
		if (cache.containsKey(num)) {
			System.out.printf("CacheAspect: Get from Cache[%d]\n", num);
			return cache.get(num);
		}
	
		Object result = joinPoint.proceed();
		
		cache.put(num, result);
		System.out.printf("Cache Aspect: Add to Cache[%d]\n", num);
		return result;
	}
}
