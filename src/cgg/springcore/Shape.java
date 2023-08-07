package cgg.springcore;

public interface Shape {

	public void draw();
}


//CODING TO INTERFACES:
/* Instead of having an instance of bean directly what u do is u have an interface and then u use the interface
 * and not the bean inside the application class
 * 
 * The advantage is drawing application class does not have to know whether its calling the draw() method of 
 * triangle or any other shape. it just works on interfaces
 * 
 * Code to interface and not to specific implementation 
 * the drawing application does not know whether it is drawing a circle or triangle or any other shape
 * All it knows is that it is getting a bean which implements the shape interface and its calling a method of 
 * shape interface
 * 
 * In future, if a new class rectangle is added and as long as it implements the shape interface u just 
 * create the class and add configuration and call it as shape
 * 
 *  Shape has been defined as a triangle in this u can later modify it and add new implementation of the shape 
 *   interface and all u need to do is to change just the class in configuration and modify the properties
 *   Then the drawing application is going to draw a different shape which were not even there when application 
 *   was first coded
 *   
 *   All this is happening because u are just concerned with the methods of the interface itself and not the methods
 *   of individual objects that implements the interface
 *  
 *  This is the main advantage of coding to interface and what this translate to is in your application
 *  Normally u would have say business services DAO layer
 *  instead of having view layer directly call a business service object what u would do is an interface for the business
 *  service then u will call the methods of that interface and then the implementation would be later
 * plugged in with the specific business service implementation  that u have coded and then if u want to
 * change it later u don't have to change the view layer
 * For Example u have to just add the new business service implementation then re-wire it in your spring.xml
 * 
 * Whenever you are doing dependency injection always use interface so that if you change the implementation 
 * you don't have to change the actual class which depends on this interface
 * You just have to plug-in the new implementation and change the wiring so that the class can use new implementation 
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  */