package cgg.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor  implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("My Bean Factory Post Processor is called "+beanFactory);
		
	}
}
//This is the method that Spring si ging to run before the BeanFactory itself is being initialized and what
//argument we get is the BeanFactory itself

//What Spring going to do is to call PostProcessorBeanFactory() of all the classes thats declared in spring.xml
//which implements BeanFactoryPostProcessor

//When the BeanFactory is being initialized then this method of the class is being called.

//When spring initializes beanfactory the first thing it does is initializes all the singleton beans.(Default behaviour)
//BeanFactoryPostProcessor is first called then the beanfactory is initialized.

//And then all the singleton beand are initialiZed This is the order in which execution goes....This is the
//handy in which we can plug in extra functionality if u want to override some of the default behaviour when the 
//beanfactory is initialized.

//One example of BeanFactoryPOstProcessor that comes out of the box is called, Propertyplaceholder configurer
//What it help us to d is if we want to have some kind of placeholder for bean configuration


//In order to let spring know that these values(placeholder values) have to be substituted here, use out of the box
//beanFactoryPostProcessor that spring provides which is called PropertyPlaceholderConfigurer

//IN order to define any beanFactoryPostProcessor all we need to do is write a simple bean tag. 
//If we were to write our own beanFactoryPOstProcessor we have to write the class and add it to spring.xml
//If you are using out of the box beanFactoryPostProcessor dont even write the class spring ia already providing 
//that class, just add class name in spring.xml

//PropertyPlaceholderConfigurer:
//THis class is going to look at properties file and then going to look at spring.xml then whrever u have 
//placeholders its going to lookup the properties nd then substitute it.
//This gets executed before the beanfactory gets executed so the beanfactory will not see the placeholder.
//BeanFactory will have the completely substituted xml file ready