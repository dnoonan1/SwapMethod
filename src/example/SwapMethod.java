package example;

/**
 *
 * @author Dan Noonan
 */
public class SwapMethod {

    private static String str1 = "One",
                          str2 = "Two"; 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 5,
            y = 10;
        
        System.out.println("Example 1");
        System.out.println("=========");
        System.out.printf("x = %d, y = %d\n", x, y);
        System.out.println("Swapping x and y...");
        swap(x, y);
        System.out.printf("x = %d, y = %d\n", x, y);
        
        System.out.println("\nExample 2");
        System.out.println("=========");
        System.out.println(str1 + ", " + str2);
        System.out.println("Swapping...");
        swap(str1, str2);
        System.out.println(str1 + ", " + str2);
        
        System.out.println("\nExample 3");
        System.out.println("=========");
        System.out.println(str1 + ", " + str2);
        System.out.println("Swapping...");
        swap();
        System.out.println(str1 + ", " + str2);
        
    }
    
    public static void swap(Object o1, Object o2) {
        Object temp = o1;
        o1 = o2;
        o2 = temp;
    }
    
    public static void swap() {
        String temp = str1;
        str1 = str2;
        str2 = temp;
    }
    
}
