
import java.util.Scanner  ; 
class Program1{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		int num  = sc.nextInt()  ; 
		int result  = 1 ;  // 1! 
		for( int i = 2 ; i<= num ; i++ ){
			result = result* i  ; 
		}
		System.out.println(result);

	}
}
