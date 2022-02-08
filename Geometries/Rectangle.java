
package Geometries;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 Class          Rectangle
 File           Rectangle.java
 Description    Derived class from the abstract class GeometricObject that
 *              represents a rectangle with 4 lengths of which will be computed
 *              for area and perimeter.
 *              The area is computed via formula:
 *              area = height * width
 *              perimeter = 2height + 2width
 * @author      <i>Leanne Vu</i>
 * Environment  PC, Windows 10, jdk1.8.0_241, Netbeans 11.3
 * Date     	2/17/2021
 * @version     1.2.1
 * @see         GeometricObject
 *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Rectangle extends GeometricObject {
    //set variables for the inputs that will be used in calculations
    private double height, width;
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   Rectangle
    * Description   Default constructor for the Rectangle class
    * @author       <i>Leanne Vu</i>
    * Date          2/17/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Rectangle() {
        this(0,0);
        setParameters();
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   Rectangle
    * Description   Overloaded constructor for the Rectangle class
    * @param        width double
    * @param        height double
    * @author       <i>Leanne Vu</i>
    * Date          2/17/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Rectangle(double width, double height) {
        this.width  = width;
        this.height = height;
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
    * Description   Computes area of the rectangle using height * width formula
    * @return       area double
    * @author       <i>Leanne Vu</i>
    * Date          2/15/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    @Override
    public double getArea() {
        double area;
        area = this.height * this.width;
        return area;
    }

   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getPerimeter()
    * Description   Computes perimeter of the rectangle using 
    *               2*height+2*width formula
    * @return       perimeter double
    * @author       <i>Leanne Vu</i>
    * Date          2/15/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = (2*this.height) + (2*this.width);
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
        return "Rectangle{" + "(height=" + height + ", width=" + width + ")}";
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getHeight()
    * Description   Return height value
    * @return       height double
    * @author       <i>Leanne Vu</i>
    * Date          2/17/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getHeight() {
        return this.height;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        setHeight()
    * Description   Assings height value
    * @param        height double
    * @author       <i>Leanne Vu</i>
    * Date          2/17/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setHeight(double height) {
        this.height = height;
    }
    
 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getWidth()
    * Description   Return width value
    * @return       width double
    * @author       <i>Leanne Vu</i>
    * Date          2/17/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getWidth() {
        return this.height;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        setWidth()
    * Description   Assings width value
    * @param        width double
    * @author       <i>Leanne Vu</i>
    * Date          2/17/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setWidth(double width) {
        this.width = width;
    }
    
 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        equals()
    * Description   Compares two rectangle objects
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
        final Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        return true;
        
    }
    
}
