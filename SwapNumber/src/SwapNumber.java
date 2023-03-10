import java.util.*;  
class SwapNumber {  
    public static void main(String[] args) {  
      int x,y,z;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the First Number: ");
       x = sc.nextInt();
       System.out.println("Enter the Second Number: ");
       y = sc.nextInt();
       System.out.println("Before swapping: ");
       System.out.println("X="+x);
       System.out.println("Y="+y);
       System.out.println("After Swapping:");
       z=x;
       x=y;
       y=z;
       System.out.println("X="+x);
       System.out.println("Y="+y);
    } 
}
