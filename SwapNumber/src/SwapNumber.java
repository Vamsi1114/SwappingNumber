import java.util.*;  
class SwapNumber {  
    public static void main(String[] args) {  
      int x,y;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the First Number: ");
       x = sc.nextInt();
       System.out.println("Enter the Second Number: ");
       y = sc.nextInt();
       System.out.println("Before swapping: ");
       System.out.println("X="+x);
       System.out.println("Y="+y);
       System.out.println("After Swapping:");
       
       x=x+y;
       y=x-y;
       x=x-y;
       System.out.println("X="+x);
       System.out.println("Y="+y);
    } 
}
