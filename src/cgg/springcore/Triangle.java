package cgg.springcore;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.context.ApplicationContext;

public class Triangle implements Shape {

	/*
	 * private String type; private int height;
	 * 
	 * //One arg Constructor public Triangle(String type) { super(); this.type =
	 * type; } //Another one arg constructor public Triangle(int height) { super();
	 * this.height= height; }
	 * 
	 * //Two arg constructor public Triangle(String type, int height) { super();
	 * this.type = type; this.height = height; }
	 * 
	 * public String getType() { return type; }
	 * 
	 * // public void setType(String type) { // this.type = type; // }
	 * 
	 * 
	 * 
	 * public int getHeight() { return height; }
	 * 
	 * public void setHeight(int height) { this.height = height; }
	 */
	private Point pointA;
	private Point pointB;
	private Point pointC;
	//member  variable for ApplicationContext
	//private ApplicationContext context;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	/*
	 * private List<Point> points;
	 * 
	 * public List<Point> getPoints() { return points; }
	 * 
	 * public void setPoints(List<Point> points) { this.points = points; }
	 */

	

	public void draw() {
		
		System.out.println("Drawing Traingle");
		//System.out.println(getType() + " Triangle drawn of height " + getHeight());
		System.out.println("Point A =("+getPointA().getX()+", "+getPointA().getY()+")");
		System.out.println("Point B =("+getPointB().getX()+", "+getPointB().getY()+")");
		System.out.println("Point C =("+getPointC().getX()+", "+getPointC().getY()+")");
		
//		for (Point point : points) {
//			System.out.println("Point = ("+point.getX()+", "+point.getY()+")");
//		}
		
		
		
	}

//	@Override
//	public void setApplicationContext(ApplicationContext context) throws BeansException {
//		this.context=context;
//		
//	}
//
//	@Override
//	public void setBeanName(String beanName) {
//		System.out.println("Bean Name is: "+beanName);
//		
//	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Initializing Bean init method call for triangle");
//		
//	}
//
//@Override
//public void destroy() throws Exception {
//	System.out.println("Disposable bean destroy method call for Triangle");
	
//	public void myInit() {
//		System.out.println("Init method called for Triangle");
//	}
//	public void cleanUp() {
//		System.out.println("Clean Up method is called for Triangle");
//	}
}




	





