/*
  largest of 4 numbers 
*/
import java.util.Scanner;
public class Program2a {
  private static void Largest(int n1, int n2, int n3, int n4) {
    if(n1>n2&& n1>n3 && n1>n4){
      System.out.println(n1);
    }
    else if(n2>n3 && n2>n4){
      System.out.println(n2);
    }
    else if (n3>n4) {
      System.out.println(n3);
    }
    else{
      System.out.println(n4);
    }
    
   
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your four number");
    int n1=sc.nextInt();
    int n2 =sc.nextInt();
    int n3=sc.nextInt();
    int n4=sc.nextInt();
    Largest(n1, n2, n3,n4);
  }

  
    
}
