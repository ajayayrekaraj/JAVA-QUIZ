class Core2Web{
	public static void main(String[] args) {
		int arr[] = new int[5];
		System.out.println(arr.length);
		arr.length = 40;
		System.out.println(arr.length);
	}
}
/* Question7.java:5: error: cannot assign a value to final variable length                                                                                                                                                              arr.length = 40;                                                                                                                                                                                                        ^              */ 
