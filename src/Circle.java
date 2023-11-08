/**************************************************************
*                     Circle                                  *
***************************************************************
* -radius: double                                              *
* -                                                           *
*                                                             *
* +Circle(double)                                              *
* +getArea(): double                                                 *
* +getPerimeter(): double                                          *
* +equals(): Object                                          *           
**************************************************************/




import java.lang.Math;

 
 public class Circle extends GeometricObject{

    
    public double radius;

    Circle(double radius){
        this.radius = radius;
    }

    

    public double getArea(){
        return(Math.PI * Math.pow(radius,2));
    }

    public double getPerimeter(){
        return(2 * Math.PI * radius);
    }

    @Override public boolean equals(Object other){
        Circle otherCircle = (Circle) other;
        Double thisRadius = Double.valueOf(this.radius);
        Double otherRadius = Double.valueOf(otherCircle.radius);
        
        return thisRadius.compareTo(otherRadius) == 0;
    }

 }