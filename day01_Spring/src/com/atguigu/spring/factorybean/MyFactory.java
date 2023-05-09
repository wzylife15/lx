package com.atguigu.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class MyFactory  implements FactoryBean<Car>{

	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setBrand("标志");
		car.setPrice(1000.0);
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
