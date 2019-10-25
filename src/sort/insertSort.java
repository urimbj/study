package sort;

public class insertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("insert Sort Start!!!!");
		
		int[] sortBase = {4,6,1,3,5,2};
		int iBaseLength = sortBase.length;
				
		for(int i=1;i<iBaseLength;i++) {
			
			System.out.print("Step[" + (i) + "] : ");
			
			for(int j=i-1;j>=0;j--) {
				
				int iFrontValue = j;
				int iStandardValue = j+1;
				
				if(sortBase[iStandardValue] < sortBase[iFrontValue]) {
					swap(sortBase,iFrontValue,iStandardValue);
				}
			}
			
			for(int output : sortBase) {
				System.out.print("    " + output);
			}
			
			System.out.println("");
		}
		
	}
	
	public static void swap(int[] sortBase,int iFrontValue,int iStandardValue) {
		
		int temp = sortBase[iFrontValue];
		sortBase[iFrontValue] = sortBase[iStandardValue];
		sortBase[iStandardValue] = temp;

	}

}
