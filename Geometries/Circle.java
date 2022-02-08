/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometries;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 Class          Circle
 File           Circle.java
 Description    Derived class from the abstract class GeometricObject that
 *              represents a circle with radius input of which will be computed
 *              for area and circumference.
 *              The area is computed via formula:
 *              pi * r ^ 2
 *              perimeter = 2 * pi * r
 * @author      <i>Leanne Vu</i>
 * Environment  PC, Windows 10, jdk1.8.0_241, Netbeans 11.3
 * Date     	2/17/2021
 * @version     1.2.1
 * @see         GeometricObject
 *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Circle extends GeometricObject {
    //set constant and necessary variable that will be used in calculation
    final double PI = 3.14159265359;
    private double radius;
        
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   Circle
    * Description   Default constructor for the Circle class
    * @author       <i>Leanne Vu</i>
    * Date          2/17/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Circle() {
        this(0);
        setParameters();
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   Circle
    * Description   Overloaded constructor for the Triangle class
    * @param        radius double
    * @author       <i>Leanne Vu</i>
    * Date          2/17/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Circle(double radius) {
        this.radius  = radius;
        setParameters();
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        setParameters()
    * Description   A methodd to set filled and color property.
    * @author       <i>Leanne Vu</i>
    * Date          2/12/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void setParameters() {
        filled = rand.nextBoolean();
        
        //sets whether it is filled (from parent class - setFilled()
        this.setFilled(filled);
        
        //set color by using the given selection from the parent class- setColors() 
        this.setColor(colors[rand.nextInt(SIZE)]);
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getArea()
    * Description   Computes area of the circle using pi*r^2 formula
    * @return       area double
    * @author       <i>Leanne Vu</i>
    * Date          2/15/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public double getArea() {
        double area;
        area = PI * Math.pow(this.radius, 2);
        return area;
    }

   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getPerimeter()
    * Description   Computes perimeter of the circle using 2*pi*r formula
    * @return       perimeter double
    * @author       <i>Leanne Vu</i>
    * Date          2/15/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = 2 * PI * this.radius;
        return perimeter;
    }
    
  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        toString()
    * Description   Return all 6 coordinates of the three points
    * @return       points String
    * @author       <i>Leanne Vu</i>
    * Date          2/12/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public String toString() {
        return "Circle{" + "(radius=" + radius + ")}";
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getRadius()
    * Description   Return radius
    * @return       radius double
    * @author       <i>Leanne Vu</i>
    * Date          2/17/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getRadius() {
        return this.radius;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        setY2()
    * Description   Assings y2 coordinate value
    * @param        radius double
    * @author       <i>Leanne Vu</i>
    * Date          2/17/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        equals()
    * Description   Compares two circle objects
    * @return       true or false boolean
    * @author       <i>Leanne Vu</i>
    * Date          2/12/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circle other = (Circle) obj;
        if (Double.doubleToLongBits(this.radius) != Double.doubleToLongBits(other.radius)) {
            return false;
        }
        return true;
    }
}

