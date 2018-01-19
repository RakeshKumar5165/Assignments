<<<<<<< HEAD

var keys = document.querySelectorAll('#calculator span');
var operators = ['+', '-', '*', '/'];
var decimalAdded = false;


for(var i = 0; i < keys.length; i++) {
	keys[i].onclick = function(e) {
		
		var input = document.querySelector('.screen');
		var inputVal = input.innerHTML;
		var btnVal = this.innerHTML;
		
		if(btnVal == 'C') {
			input.innerHTML = '';
			decimalAdded = false;
		}
		
		else if(btnVal == '=') {
			var equation = inputVal;
			var lastChar = equation[equation.length - 1];
			
			if(operators.indexOf(lastChar) > -1 || lastChar == '.')
				equation = equation.replace(/.$/, '');
			
			if(equation)
				input.innerHTML = eval(equation);
				
			decimalAdded = false;
		}
		
		else if(operators.indexOf(btnVal) > -1) {
			var lastChar = inputVal[inputVal.length - 1];
			
			if(inputVal != '' && operators.indexOf(lastChar) == -1) 
				input.innerHTML += btnVal;
			
					else if(inputVal == '' && btnVal == '-') 
				input.innerHTML += btnVal;
			
			
			if(operators.indexOf(lastChar) > -1 && inputVal.length > 1) {
				input.innerHTML = inputVal.replace(/.$/, btnVal);
			}
			
			decimalAdded =false;
		}
		
		
		else if(btnVal == '.') {
			if(!decimalAdded) {
				input.innerHTML += btnVal;
				decimalAdded = true;
			}
		}
		
		
		else {
			input.innerHTML += btnVal;
		}
		
		
		e.preventDefault();
		
		
		
		
		
		
		
		
		
		
		
	var equation1 = input.innerHTML;
			var lastChar1 = equation1[equation1.length - 1];
			
			if(operators.indexOf(lastChar1) > -1 || lastChar1 == '.')
				equation1 = equation1.replace(/.$/, '');
			
			
				document.querySelector('.screen1').innerHTML = eval(equation1);
	} 
	
	
	
	
	
			
	
	
	
	
=======

var keys = document.querySelectorAll('#calculator span');
var operators = ['+', '-', '*', '/'];
var decimalAdded = false;


for(var i = 0; i < keys.length; i++) {
	keys[i].onclick = function(e) {
		
		var input = document.querySelector('.screen');
		var inputVal = input.innerHTML;
		var btnVal = this.innerHTML;
		
		if(btnVal == 'C') {
			input.innerHTML = '';
			decimalAdded = false;
		}
		
		else if(btnVal == '=') {
			var equation = inputVal;
			var lastChar = equation[equation.length - 1];
			
			if(operators.indexOf(lastChar) > -1 || lastChar == '.')
				equation = equation.replace(/.$/, '');
			
			if(equation)
				input.innerHTML = eval(equation);
				
			decimalAdded = false;
		}
		
		else if(operators.indexOf(btnVal) > -1) {
			var lastChar = inputVal[inputVal.length - 1];
			
			if(inputVal != '' && operators.indexOf(lastChar) == -1) 
				input.innerHTML += btnVal;
			
					else if(inputVal == '' && btnVal == '-') 
				input.innerHTML += btnVal;
			
			
			if(operators.indexOf(lastChar) > -1 && inputVal.length > 1) {
				input.innerHTML = inputVal.replace(/.$/, btnVal);
			}
			
			decimalAdded =false;
		}
		
		
		else if(btnVal == '.') {
			if(!decimalAdded) {
				input.innerHTML += btnVal;
				decimalAdded = true;
			}
		}
		
		
		else {
			input.innerHTML += btnVal;
		}
		
		
		e.preventDefault();
		
		
		
		
		
		
		
		
		
		
		
	var equation1 = input.innerHTML;
			var lastChar1 = equation1[equation1.length - 1];
			
			if(operators.indexOf(lastChar1) > -1 || lastChar1 == '.')
				equation1 = equation1.replace(/.$/, '');
			
			
				document.querySelector('.screen1').innerHTML = eval(equation1);
	} 
	
	
	
	
	
			
	
	
	
	
>>>>>>> a3fdb6ec394f947849e73a2d51d241320108623f
}