package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp 
{
	public static void main(String[] args) 
	{
		// Read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean
		Coach theCoach = context.getBean("badmintonCoach", Coach.class);
		Coach alphaCoach = context.getBean("badmintonCoach", Coach.class);
		
		// check their hashcodes
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		
		System.out.println(System.identityHashCode(theCoach));
		System.out.println(System.identityHashCode(alphaCoach));
		
		System.out.println(theCoach==alphaCoach);
		
		// Close the context
		context.close();
	}
}
