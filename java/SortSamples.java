import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

class SortSamples {
	
	
	public static void main(String[] args) {
		SortSamples sortTest = new SortSamples();
		int [] array = sortTest.createArray();
		sortTest.insertSort(array);
		System.out.println("============Sorted Array================");
		sortTest.printArray(array);
		
	}
	
	//Create a random array with 10 random number.
	
	public int[] createArray(){
		Random random = new Random();
		int[] array = new int[10];
		for (int i=0; i<10; i++){
			//2  numbers minus to get a more random number  
			array[i] = random.nextInt(100) - random.nextInt(100);
			
		}
		System.out.println("============Original Array================");
		printArray(array);
		return array;
	}
	

	//print out to console with array's items
	public void printArray(int[] data){
		for (int i:data){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	//normal inser sort method. 
	public static void insertSort(int[] a){
		
		for (int i = 1; i<a.length; i++){
			int temp = a[i];
			int j;
			for (j= i-1; j>=0; j--){
				if (a[j]>temp){
					a[j+1] = a[j];
				}
				else {
					break;
				}
				
				}
			a[j+1] = temp;
			}
		
	}
	public static void bubbleSort(int[] a){
		for (int i=0; i<a.length; i++){
			for(int j=0; j<a.length-i-1; j++){
				if (a[j]>a[j+1]){
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		
	}
	
	
}