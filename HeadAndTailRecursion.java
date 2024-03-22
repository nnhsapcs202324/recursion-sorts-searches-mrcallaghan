public class HeadAndTailRecursion
{
    public static void main(String[] args)
    {
        System.out.print("Tail Recursion: ");
        tail("blizzard");
        
        System.out.println("");
        
        System.out.print("Head Recursion: ");
        head("blizzard");        
        
    }

    public static void tail(String str)
    {
        if(str.length() == 0)
            return;

        System.out.print(str.charAt(0));
        
        // tail recursion means the recursive call is at the end of the method
        tail(str.substring(1));
    }

    public static void head(String str)
    {
        // terminating condition (empty loaf)
        if(str.length() == 0)
            return;
        
        // recursive call comes before the end of the method in head recursion
        head(str.substring(1));
        
        // print one character (contribute one small part to the larger solution)
        System.out.print(str.charAt(0));
    }
}