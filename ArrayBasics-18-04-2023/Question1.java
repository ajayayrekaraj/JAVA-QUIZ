class Core2Web {

		public static void main(String[] args) {
					
		   int [] var1 = new int[5];
		   var1[2] = 1;
		   var1[3] = 2;
		   var1[4] = 3;

		for(int var2 = 0; var2 < var1.length; var2++){
															
			System.out.println(var1[var2]);	
	 	     }		
		}
}
/* Output:0 0 1 2 3
Explanation
int Array is initialized with 0 by default, 
so the index where no value is put explicitly contains zero */

