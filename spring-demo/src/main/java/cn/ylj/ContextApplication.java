package cn.ylj;

import cn.ylj.context.service.IUserService;
import cn.ylj.model.Car;
import cn.ylj.model.CarFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextApplication {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
//		IUserService bean = context.getBean(IUserService.class);
//		System.out.println(bean);

		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
		IUserService userService = (IUserService)app.getBean("userService");
		userService.sayHello("yanglujian nihao !");

		// 获取BeanFactory工厂的产品
		Car car = (Car)app.getBean("car");
		System.out.println(car);
		Car car2 = (Car)app.getBean("car");
		System.out.println(car2);

		// 获取BeanFactory 这工厂Bean
		CarFactoryBean factoryBean = (CarFactoryBean) app.getBean("&car");
		System.out.println(factoryBean);

		System.out.println("[DONE] " + userService);
	}
}