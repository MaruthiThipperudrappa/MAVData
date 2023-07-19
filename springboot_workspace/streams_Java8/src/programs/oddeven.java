package programs;

public class oddeven {

	
	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5,6,7,8};//=25 4=20 3=12
		
		System.out.println("4 wheel cars");
		for (int i=0;i<arr.length;i++) {	
			if(arr[i]%2!=0) {
			}
		}
		int size4=arr.length;
		
		int oddcars=((size4*4)/2);
		System.out.println(oddcars);
		
		System.out.println("3 wheel cars");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				//System.out.println(arr[i]);
			}
		}
		int size3=arr.length;
		//System.out.println(((size3*3)+1)/2);
		int evencars=(((size3*3)+1)/2);
		System.out.println(evencars);
		
		int total_cars=oddcars+evencars;
		
		System.out.println("odd and even cars tyres :"+ total_cars);		
	}
}
