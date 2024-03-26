package withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new  AnnotationConfigApplicationContext(Config.class);
	Mobile mobile=applicationContext.getBean("mobile",Mobile.class);
	mobile.used();
}
}
