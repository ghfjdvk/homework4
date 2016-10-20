package homework4;
import java.util.*;
public class SumAndAvg {
	public void SAA(){
		Scanner scanner = new Scanner(System.in);    
		   int count =0; 		
		   int sum =0; 			
		   while(true){    
		      System.out.print("숫자를 입력(Q종료) >> ");  
		      try
		      {    
		      String abc = scanner.nextLine(); 
		      count += 1; 				
		      sum += Integer.parseInt(abc);   
		      }
		      catch (NumberFormatException e)
		      {	
		    	double avg = (double)sum/(count-1);  
		        System.out.println("합계는 "+sum+"이고, "+"평균은 "+avg+"입니다."); 
		        break;    
		      } 
		       
		   } 
	} 
}