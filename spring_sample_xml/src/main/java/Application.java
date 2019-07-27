import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		//CustomerService customerService = new CustomerServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = appContext.getBean("customerService2", CustomerService.class);
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
