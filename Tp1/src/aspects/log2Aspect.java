package aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import metier.CompteBancaire;

@Aspect
public class log2Aspect {
	
	@Pointcut("call (* *.*.retirer(..)) && target(c)")
	public void log(CompteBancaire c) { }
	
	@Before("log(c)")
	public void avant(CompteBancaire c) {
		System.out.println("Avant (aspect avec annotations target)...." + c.toString());
		
	}	
	@After("log(c)")
	public void après(CompteBancaire c) {
		System.out.println("Après (aspect avec annotations target)....."+c.toString());
		
	}
}

