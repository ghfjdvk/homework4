package homework4;
import java.util.*;
public class GuGuDan2 {
	public void GGD2(){
	Scanner scanner = new Scanner(System.in); 
	while(true){	 
 			System.out.print("E짝수단, O홀수단(Q종료) >> "); 
 			String c = scanner.nextLine(); 
 			switch(c)
 			{	 
 			case "E":	 
 				for(int j=2; j<10; j=j+2){ 
 					System.out.println(""); 
 				for(int i=1; i<10; i++)
 				{	 
 					int result = j *i; 
 					System.out.print(j+"*"+i+"="+result+"  "); 
 				} 
 				} 
 				break;   
 			case "O":	 
 				for(int j=3; j<10; j=j+2)
 				{ 
 					System.out.println(""); 
 					for(int i=1; i<10; i++)
 					{ 
 						int result = j *i; 
 						System.out.print(j+"*"+i+"="+result+"  "); 
 					} 
 					} 
 					break; 
 			}
 			if(scanner.next().equals("Q")){   
 				break;	
 			} 
	}
	
	}

}