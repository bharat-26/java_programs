class IntroJava{
	public static void main(String[] args) {
		float i = 4.4f;
		System.out.println(i);
	}
	
}
class For_eachLoop{
	public static void LocalMethod(String[] args) {
		int arr[] = {11,12,13,14,15};
		for(int i:arr){
			System.out.println(i);
		}
	}
}
class LabeledFor{
	public static void main(String[] args) {
		labelled_a:
			for(int i = 0; i<=5 ; i++){
				labelled_b:
					for(int j = 0 ; j<=5 ; j++){
						if(i == 3 && j == 3)
							// break labelled_a;
							break labelled_b;
						if(i==2 && j >=0)
							continue labelled_a;
						System.out.println(i+" "+j);
					}
			}
	}
}
class InfinitiveLoop{
	public static void main(String[] args) {
		for(;;){
			System.out.println("infnitiveLoop");
		}
	}
}
class WhileLoopInfinitive{
	public static void main(String[] args) {
		while(true){
			System.out.println("infnitiveLoop");
		}
	}
}