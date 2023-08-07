package cgg.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In AfterInitialization method, Bean name is: "+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In BeforeInitialization method, Bean name is: "+beanName);
		return bean;
	}

}

//BeanPostProcessor is an extension point for the spring framework and how we can configure the framework
//for your specific needs using the BeanPostProcessor

//BeanFactoryPostProcessor is another extension point. This is a feature provided by SPring, when u want to 
//execute code, Bean factoy itself is initialized. Then u can use BenFactoryProcessor to write ur code.
