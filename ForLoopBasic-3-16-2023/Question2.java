class Core2Web{
	public static void main(String[]args){
		System.out.println("Before for loop");
		for(int i,j;i<3;i++){
			System.out.println("Inside for");
		}
		System.out.println("After for loop");
	}
}
// Compile error:variable i might not have been initialized
