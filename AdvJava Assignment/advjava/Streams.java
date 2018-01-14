package advjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	
	private static final String[] tensNames = {
		    "",
		    " ten",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty",
		    " sixty",
		    " seventy",
		    " eighty",
		    " ninety"
		  };

		  private static final String[] numNames = {
		    "",
		    " one",
		    " two",
		    " three",
		    " four",
		    " five",
		    " six",
		    " seven",
		    " eight",
		    " nine",
		    " ten",
		    " eleven",
		    " twelve",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen"
		  };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		List<Integer> myList =
			    Arrays.asList(1,5,7,9,10,80,567,700);
		List<Integer> fives=myList
	    .stream().filter(s->s%5==0).collect(Collectors.toList());
   	 
lambda x = (number)-> {  
        	

        	String out;
        	
		    if (number % 100 < 20){
		      out = numNames[number % 100];
		      number /= 100;
		    }
		    else {
		      out = numNames[number % 10];
		      number /= 10;

		      out = tensNames[number % 10] + out;
		      number /= 10;
		    }
		    if (number == 0) return out;
		    return numNames[number] + " hundred" + out;
        		

        		  

        };  

		
		for (int i=0;i<fives.size();i++)
		{
			 System.out.println(x.inttostr(fives.get(i)));  			
		}
	}

}
