
package Geometries;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 Class          Triangle
 File           Triangle.java
 Description    Derived class from the abstract class GeometricObject that
 *              represents a triagnle with three points, plus methods to compute
 *              distances between points, triangle perimeter and area.
 *              The area is computed via Heron's formula:
 *              A = Sqrt of s(s-a)(s-b)(s-c) where a = lengthA, b = lengthB,
 *              c = lengthC length of two points = Sqrt of (x2-x1)^2 + (y2 - y1)^2
 * @author      <i>Leanne Vu</i>
 * Environment  PC, Windows 10, jdk1.8.0_241, Netbeans 11.3
 * Date     	2/16/2021
 * @version     1.2.1
 * @see         GeometricObject
 *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Triangle extends GeometricObject{
    //-------------------------------------------------------------------------
    // private data members represent points (x1, y1), (x2, y2), (x3, y3)
    //-------------------------------------------------------------------------
    private double x1, x2, y1, y2, x3, y3;
//    private Point[] points;
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   Triangle
    * Description   Default constructor for the Triangle class
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    * History Log   10/13/2001, 10/15/2019
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Triangle() {
        this(0, 0, 0, 0, 0, 0);
        setParameters();
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   Triangle
    * Description   Overloaded constructor for the Triangle class
    * @param        x1 double
    * @param        y1 double
    * @param        x2 double
    * @param        y2 double
    * @param        x3 double
    * @param        y3 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    * History Log   10/13/2001, 10/15/2019
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Triangle(double x1, double y1, double x2, double y2, double x3,
            double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
//        points[0] = new Point(x1, y1);
//        points[1] = new Point(x2, y2);
//        points[2] = new Point(x3, y3);
        setParameters();
        
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        setParameters()
    * Description   A method to set filled and color property.
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
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
    * Method        isValidTriangle()
    * Description   A method to determine if the sides of the triangle are
    *               valid: sum of any two must be greater than the third.
    * @return       valid boolean
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public boolean isValidTriangle() {
        //variables for sides
        double sideA, sideB, sideC;
        
        //calculate sides with vertexes using distance formula
        sideA = distance(x1, y1, x2, y2);
        sideB = distance(x1, y1, x3, y3);
        sideC = distance(x2, y2, x3, y3);
        
        //returns true if rule is surpassed, false if otherwise
        return (sideA + sideB > sideC && sideA + sideC > sideB &&
                sideB + sideC > sideA);
    }
      
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        isValidTriangle()
    * Description   Overloaded method to determine if the triangle is valid:
    *               sum of any two must be greater than the third.
    * @param        a double
    * @param        b double
    * @param        c double
    * @return       boolean
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public boolean isValidTriangle(double a, double b, double c) {
        
        //returns true if rule is surpassed, false if otherwise
        return (a + b > c && a + c > b && b + c > a);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        distance()
    * Description   Calculate distance between two points
    * @param        x1 double
    * @param        y1 double
    * @param        x2 double
    * @param        y2 double
    * @return       area distance
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double distance(double x1, double y1, double x2, double y2) {
        //uses distance formula
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getArea()
    * Description   Computes area of the triangle using Heron's formula
    * @return       area double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public double getArea() {
        double sideA, sideB, sideC, semiPerimeter;
        sideA = distance(x1, y1, x2, y2);
        sideB = distance(x1, y1, x3, y3);
        sideC = distance(x2, y2, x3, y3);
        semiPerimeter = (sideA + sideB + sideC) / 2;
        
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) *
                (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getArea
    * Description   Overloaded and alternative method to compute area of the
    *               triangle using the discriminant formula. **EXTRA CREDIT
    * @return       area double
    * @param        x1 double
    * @param        y1 double
    * @param        x2 double
    * @param        y2 double
    * @param        x3 double
    * @param        y3 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getArea(double x1, double y1, double x2, double y2, double x3,
                    double y3) {
        return Math.abs(((x1 * y2 - y1 * x2) + (x2 * y3 - y2 * x3) + 
                (x3 * y1 - y3 * x1)) / 2);
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getPerimeter()
    * Description   Computes the perimeter of this triangle
    * @return       double perimter of this triangle
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public double getPerimeter() {
        double sideA, sideB, sideC;
        sideA = distance(x1, y1, x2, y2);
        sideB = distance(x1, y1, x3, y3);
        sideC = distance(x2, y2, x3, y3);
        
        return (sideA + sideB + sideC);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getPerimeter()
    * Description   Computes the perimeter of this triangle
    * @param        sideA double
    * @param        sideB double
    * @param        sideC double
    * @return       double perimter of this triangle
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getPerimeter(double sideA, double sideB, double sideC) {
        return (sideA + sideB + sideC);
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getX1()
    * Description   Return x1 coordinate value
    * @return       x1 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getX1() {
        return x1;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        setX1()
    * Description   Assings x1 coordinate value
    * @param       x1 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setX1(double x1) {
        this.x1 = x1;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getY1()
    * Description   Return y1 coordinate value
    * @return       y1 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getY1() {
        return y1;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        setY1()
    * Description   Assings y1 coordinate value
    * @param        y1 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setY1(double y1) {
        this.y1 = y1;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getX2()
    * Description   Return x2 coordinate value
    * @return       x2 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getX2() {
        return x2;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        setX2()
    * Description   Assings x2 coordinate value
    * @param        x2 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setX2(double x2) {
        this.x2 = x2;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getY2()
    * Description   Return y2 coordinate value
    * @return       y2 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getY2() {
        return y2;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        setY2()
    * Description   Assings y2 coordinate value
    * @param        y2 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setY2(double y2) {
        this.y2 = y2;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getX3()
    * Description   Return x3 coordinate value
    * @return       x3 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getX3() {
        return x3;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        setY2()
    * Description   Assings y2 coordinate value
    * @param        x3 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setX3(double x3) {
        this.x3 = x3;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getY3()
    * Description   Return y3 coordinate value
    * @return       y3 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getY3() {
        return y3;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        setY3()
    * Description   Assings y3 coordinate value
    * @param        y3 double
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setY3(double y3) {
        this.y3 = y3;
    }
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        toString()
    * Description   Return all 6 coordinates of the three points
    * @return       points String
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public String toString() {
        return "Triangle{" + "(x1=" + x1 + ", x2=" + x2 + "), y1=(" + y1 +
                ", y2=" + y2 + "), x3=(" + x3 + ", y3=" + y3 + ")}";
    }

   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        equals()
    * Description   Compares two triangle objects
    * @return       true or false boolean
    * @author       <i>Leanne Vu</i>
    * Date          2/16/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) { //returns false if one of the objets are null
            return false;
        } 
        
        //right off the bat, if one of the objects are not equal used operand, return false
        if (getClass() != obj.getClass()) {
            return false;
        } 
        
        //compares values from text fields passed via paramter to the class (from text field)
        final Triangle other = (Triangle) obj;
        if (Double.doubleToLongBits(this.x1) != Double.doubleToLongBits(other.x1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y1) != Double.doubleToLongBits(other.y1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.x2) != Double.doubleToLongBits(other.x2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y2) != Double.doubleToLongBits(other.y2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.x3) != Double.doubleToLongBits(other.x3)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y3) != Double.doubleToLongBits(other.y3)) {
            return false;
        }
        return true;
    }
   
}
