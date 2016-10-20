package homework4;
import java.util.*;
public class GuGuDan {
	Scanner scanner = new Scanner(System.in);
	public void GGD(){ 
 		while(true){ 		
 		System.out.print("출력하고 싶은 단(Q:종료) >> "); 
 		if(scanner.hasNextInt())
 		{		 
 			int abc = scanner.nextInt(); 
 			if(abc <= 1 || abc >= 10)
 			{	 
 				System.out.println("잘못입력");	
 			}
 			else
 			{  
 			for(int i=1; i<10; i++)
 			{	 
 				int result = abc *i;		 
 				System.out.println(abc+"*"+i+"="+result); 
 			} 
 			}
 		}else if(scanner.next().equals("Q")){	
 			break; 

	}
}
}
}