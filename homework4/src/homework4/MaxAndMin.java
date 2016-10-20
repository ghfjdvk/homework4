package homework4;
import java.util.*;
public class MaxAndMin {
	Scanner scanner = new Scanner(System.in);
	public void MAM(){
 		int max =0; 	 
		int min=100;	  
 		String abc = "";	 
 		while (true){ 	 
 		System.out.print("0~100사이의 숫자를 입력(Q:종료) >> "); 
 		abc = scanner.next();	 
 		if(abc.equals("Q"))
 		   {	 
 		    break;	 
 		   } 
 		   if(Integer.parseInt(abc) > max)
 		   {	
 			   max = Integer.parseInt(abc);	 
 		   } 
 		    
		   if(Integer.parseInt(abc) < min)
		   {	 
 			   min = Integer.parseInt(abc);	 
 		   }	 
 		  } 
 		  System.out.println("가장 큰수는 " +max+"이고,"+" 작은 수는 "+min+"입니다.");	 
 	 

}
}

