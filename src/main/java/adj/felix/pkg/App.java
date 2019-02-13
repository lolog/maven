package adj.felix.pkg;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		 
		 Date date = context.getBean("date", Date.class);
		 
		 System.out.println(date);
	}
}
