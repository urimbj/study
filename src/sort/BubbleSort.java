package sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bubble Sort Start!!!!");
		
		int[] sortBase = {6,5,3,1};
		int baseSize = sortBase.length - 1;
		
		outPut(sortBase,"Base");
		
		for(int i=0;i<baseSize;i++) {
			
			System.out.println("----- Step[" + (i+1) + "] -----");
			
			for(int j=0;j<baseSize-i;j++) {
				
				if(sortBase[j] > sortBase[j+1]) {
					swap(sortBase,j,j+1);
				}
			}
			
			outPut(sortBase,"Sorting...");
		}
		
		System.out.println("-------------------");
		outPut(sortBase,"BubbleSort");
		System.out.println("Bubble Sort End!!!!");
	}
	
	public static void swap(int[] base, int first, int second) {
		
		int temp = base[first];
		base[first] = base[second];
		base[second] = temp;
	}
	
	public static void outPut(int[] base, String text) {
		
		System.out.print(text + " : ");
		
		for(int i=0;i<base.length;i++) {
			
			if(i == base.length-1) {
				System.out.println(base[i]);
			} else {
				System.out.print(base[i] + ",");
			}
		}
	}
}
