package homework4;
import java.util.*;
public class ExamForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. 1부터 입력한 수까지 더하기\n" 
 				+ "2. 최대값/최소값구하기\n" 
 				+ "3. 입력받은숫자의 합계와 평균구하기\n" 
				+ "4. 원하는 구구단 출력하기 \n" 
 				+ "5. 짝수단/홀수단 출력하기\n" 
 				+ "6. 종료하기\n" 
				+ "원하는 메뉴는>>");  
 		int abc = scanner.nextInt();		 
		switch(abc){	
 		case 1:	
 			SumOfNumbers a = new SumOfNumbers();		 
 			a.SON();	
 			break; 
 		case 2: 
 			MaxAndMin b = new MaxAndMin(); 
 			b.MAM(); 
 			break; 
 		case 3: 
 			SumAndAvg c = new SumAndAvg(); 
 			c.SAA(); 
 			break;
 		case 4: 
 			GuGuDan d = new GuGuDan(); 
 			d.GGD(); 
 			break;
 		case 5: 			
			GuGuDan2 e = new GuGuDan2(); 
			e.GGD2(); 
			break; 
		case 6: 
 			System.out.println("종료"); 
 			break; 	
	}
	}
}
