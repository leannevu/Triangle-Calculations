
package Geometries;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        Validation.java
 * Description  Provides a number of boolean methods for validating different 
 *              types using regular expressions.
 * Platform	jdk 1.8.0_241; NetBeans IDE 11.3; Windows 10
 * Course	CS 142, EdCC
 * @author      <i>Leanne Vu</i>
 * Date     	2/17/2021
 * @version     1.0.0
 * @see         java.util.regex.Matcher
 * @see         java.util.regex.Pattern
 *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Validation {
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        isNotDouble() 
    * Description   Checks whether the input value is not a double. Allows positives
    *               and negatives.
    * Date          2/17/2021
    * @return       boolean
    * @param        fieldValue: String, input
    * @author       <i>Leanne Vu</i>	
    * @see          java.util.regex.Matcher
    * @see          java.util.regex.Pattern
    *</pre>
    * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static boolean isNotDouble(String fieldValue){
        //checks if it is a double - has digits 0-9. Accepts positive as well as negatives!!
        Pattern pat = Pattern.compile ("-?[0-9]+");
        
        //condition for the value input passed in parameter
        Matcher mat = pat.matcher(fieldValue);
        
        //boolean value returns based on if the fieldValue matches the pattern given.
        //Add '!' in front of mat.matches() because in this case, validating if it is does not match - (flipped)
        return !mat.matches();
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        isEmpty() 
    * Description   Validates that JTextField is empty. These values could be
    *               null, no length, or just an empty string.
    * @return       boolean
    * @param        fieldValue: String, input
    * @author       <i>Leanne Vu</i>	
    * @see          java.util.regex.Matcher
    * @see          java.util.regex.Pattern
    * @see          javax.swing.JTextField
    * Date          2/17/2021
    *</pre>
    * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static boolean isEmpty(String fieldValue){
        String input = fieldValue;
        
        //conditions for the value input passed in parameter
        if (input == null || input.length() <= 0 || input.equals(""))
            return true; //return true, it is empty
        else
            return false; //return false, it is not empty
    }

   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        isNegative() 
    * Description   Validates that JTextField is not a negative number. Anything 
    *               less than 0.
    * @return       boolean
    * @param        fieldValue: String, input
    * @author       <i>Leanne Vu</i>	
    * @see          java.util.regex.Matcher
    * @see          java.util.regex.Pattern
    * @see          javax.swing.JTextField
    * Date          2/18/2021
    *</pre>
    * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static boolean isNegative(String fieldValue) {
        double input = Double.parseDouble(fieldValue);
        //condition for the value input passed in paramter is less than 0
        
        if (input < 0) {
            return true; //return true, it is a negative
        } else {
            return false; //return false, it is not a negative
        }
    }
}
