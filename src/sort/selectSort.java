package sort;

public class selectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Select Sort Start!!!!");
		
		int[] sortBase = {4,6,1,3,5,2};
		int iBaseLength = sortBase.length;
		int minName;
		
		for(int i=0;i<iBaseLength-1;i++) {

			System.out.print("Step[" + (i+1) + "] : ");
			
			minName = i;
			
			for(int j=i+1;j<iBaseLength;j++) {
				
				if(sortBase[minName] > sortBase[j]) {
					minName = j;
				}
			}
			
			swap(sortBase,i,minName);
			
			for(int output : sortBase) {
				System.out.print("    " + output);
			}
			
			System.out.println("");
		}
	}
	
	public static void swap(int[] sortBase, int i, int minName) {
		int temp = sortBase[minName];
		sortBase[minName] = sortBase[i];
		sortBase[i] = temp;
	}

}
