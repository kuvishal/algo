package algo.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GFG {

	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int no_of_TestCases=sc.nextInt();
		//System.out.println("GFG.main() no_of_TestCases "+no_of_TestCases);
		
		List<Integer[]> inputArrList= new ArrayList<Integer[]>(no_of_TestCases);
		do{
		    int no_of_elements=sc.nextInt();
		   // System.out.println("GFG.main()no_of_elements 2"+no_of_elements);
		    Integer[] inputArr= new Integer[no_of_elements];
		    for (int i=0;i<no_of_elements;i++){
		        int nextInt = sc.nextInt();
		       // System.out.println("GFG.main() nextInt "+nextInt);
				inputArr[i]=nextInt;
		    }
		    inputArrList.add(inputArr);
		    no_of_TestCases--;
		}while(no_of_TestCases>0);
		
	for (Integer[] integers : inputArrList) {
		for(int i=integers.length-1; i<-1;i--){
			System.out.println(integers[i]);
		}
		System.out.println();
	}
		
	}
}
