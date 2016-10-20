package homework4;
import java.util.*;
public class SumOfNumbers {
	Scanner scanner = new Scanner(System.in);
	public void SON(){
	System.out.print("1부터 입력한 수까지 더하기 \n마지막 수를 입력(Q:종료) >> "); 
 	String abc = scanner.next();  
	switch(abc)
	{		
 	case "Q":	 
 		break; 
 	} 
 
 	int result =0; 
 	for(int i = 1; i <= Integer.parseInt(abc); i++)
 	{	 
 		result = result + i;	
 	} 
 		System.out.print("총 합은 "+result+"입니다."); 
 		SON(); 
}

}
