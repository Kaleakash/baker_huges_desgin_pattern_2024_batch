package opencloseprinicipal;

/*class Rectangle {
private double length;
private double width;
setter and getter method 
}
class Circle {
private double radius;
setter and getter methods;
}
class AreaCalculator {
public double calculateRectangleArea(Rectangle rec) {
return rec.getLength()*rec.getWidth();
}
public double calculateCircleArea(Cirlce cr) {
return (22/7)*cr.getRadius()*cr.getRadius();
}
}*/

interface Shape {
public double calculateArea();
}
class Rectangle implements Shape {
private double length;
private double width;
//setter and getter method 
public double calculateArea(){
return length*width;
}	
}
class Circle implements Shape {
private double radius;
//setter and getter methods;
public double calculateArea(){	
return (22/7)*radius*radius;
}
}
class AreaCalculator {
public double calculateShapeArea(Shape shape) {
return shape.calculateArea();
}
}


