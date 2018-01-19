var display;           //display box
var val; //entered value

//analyze input
function evaluateinput(){
	display=document.getElementById('disp');
    val=document.getElementById('entertext').value;
	
   if(isNaN(val)){                                      //checking if text
        evaluatetext();
    }
    else{
		val=document.getElementById('enternumber').value;
	     evaluatenumber();
    }
}
 
 
 function evaluatetext(){
	         var x=document.getElementById('table');
	            x.style.display="block";
				                  var row = table.insertRow(1);
								  var cell1 = row.insertCell(0);
								  var cell2 = row.insertCell(1);
                                  var cell3 = row.insertCell(2);
	         if(document.getElementById('male').checked==true){
				   
      
									  cell1.innerHTML = val;
									  cell3.innerHTML = "Master "+val;
			                           cell2.innerHTML = "male";}
			if(document.getElementById('female').checked==true){
				
                     cell1.innerHTML = val;
									  cell3.innerHTML = "Miss "+val;
			                           cell2.innerHTML = "female";}
 }



//analyze number 
 function evaluatenumber(){
   if(val>0 && val<1000){
        if(val<50){
              display.innerHTML = "Number is lesser than 50";
         }
         else if(val>50 && val<100){
               display.innerHTML = "Number is greater than 50 and lesser than 100";
         }
         else{
               display.innerHTML = "Number is greater than 100";
          }
    }
   else{
        display.innerHTML = "Invalid input";
    }
  }
 function checkbox(){

             document.getElementById('enternumber').style.display="block";
			 document.getElementById('entertext').style.display="none";
			 document.getElementById('gender').style.display="none";
   }
