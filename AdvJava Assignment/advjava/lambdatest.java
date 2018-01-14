package advjava;

public class lambdatest{  
    public static void main(String[] args) {  
    	String[] tensNames = {
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
    	
    	String[] numNames = {
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
            System.out.println(x.inttostr(11));  
    }

	
}  