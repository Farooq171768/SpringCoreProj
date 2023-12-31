package cgg.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;



@Component
public class Circle implements Shape{
	private Point center;

	public Point getCenter() {
		return center;
	}

	
//	 @Autowired
//	 @Qualifier("circleRelated")
	 
	@Resource(name="pointB")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Point A =("+getCenter().getX()+", "+getCenter().getY()+")");
	}
	@PostConstruct
	public void initializeCircle() {
		System.out.println("init of circle");
	}
	@PreDestroy
	public void destroyCircle() {
		System.out.println("destroy of circle");
	}
	
}
