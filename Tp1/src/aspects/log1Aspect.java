package aspects;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class log1Aspect {	
	@Pointcut("call (* *.*.retirer(..))")
	public void log() {}	
	@Before("log()")
	public void avant() {
		System.out.println("Avant (aspect avec annotations)....");		
	}	
	@After("log()")
	public void après() {
		System.out.println("Après (aspect avec annotations).....");
	}
}

