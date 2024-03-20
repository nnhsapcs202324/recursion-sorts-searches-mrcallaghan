
/**
 * Write a description of class StringReverse here.
 *
 * @author mrcallaghan
 * @version 20mar2024
 */
public class StringReverse
{
    // iterative approach
    public static String reverseIter(String str)
    {
        String strReversed = "";
        
        for(int i = 0; i < str.length(); i++)
        {
            strReversed = str.substring(i, i+1) + strReversed;
        }

        return strReversed;
    }

    // recursive approach
    public static String reverse(String str)
    {
        // must have a terminating case (also known as a base case)
        if (str.equals(""))
        {
            return str;
        }
        
        // take a small step towards solving the problem
        String firstChar = str.substring(0,1);  // our contribution
        String restOfString = str.substring(1); // slightly smaller problem
        
        // recurse - call this method with a simpler version of the problem
        String restOfStringReversed = reverse(restOfString);
        
        String strReversed = restOfStringReversed + firstChar;  // our contribution

        return strReversed;
    }

}
