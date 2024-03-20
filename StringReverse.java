
/**
 * Write a description of class StringReverse here.
 *
 * @author mrcallaghan
 * @version 20mar2024
 */
public class StringReverse
{
    // solve string reversal iteratively
    public static String reverseIter(String str)
    {
        String strReversed = "";
        
        for(int i = 0; i < str.length(); i++)
        {
            strReversed = str.substring(i, i+1) + strReversed;
        }
        
        return strReversed;
    }
    
    
    // solve string reversal recursively
    public static String reverse(String str)
    {
        // must have a terminating condition (aka base case)
        if(str.equals(""))
        {
            return str;
        }
        
        // take a small step toward solving the problem
        String firstChar = str.substring(0,1);
        String restOfString = str.substring(1);
        
        // recurse - call this method with a simpler problem
        String restOfStringReversed = reverse(restOfString);
        
        String strReversed = restOfStringReversed + firstChar;
    
        return strReversed;
    }
}
