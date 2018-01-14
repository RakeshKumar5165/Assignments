package advjava;

import java.lang.reflect.Method;

public class annotationtest {

	
		public static void main(String args[]) {
		}
		@myannotation(rollno=7,name="rakesh")
		public String toString() {
			return "Overridden toString method";
		}
}