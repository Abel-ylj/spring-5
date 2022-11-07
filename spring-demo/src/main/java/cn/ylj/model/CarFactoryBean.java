package cn.ylj.model;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author : ylj
 * create at:  2022/11/6
 */
public class CarFactoryBean implements FactoryBean<Car> {

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setBrand("很复杂的奔驰车");
		car.setPrice(1.0 * 1000);
		car.setMaxSpeed(100);
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	@Override
	public String toString() {
		return "CarFactoryBean{我是汽车工厂}";
	}
}