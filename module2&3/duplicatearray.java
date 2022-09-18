class duplicatearray{
	
	//create function to find duplicate values
	public static int findDuplicate(int[] nums) {
		//create array of n+1 for visited nums
		boolean visited[] = new boolean [nums.length + 1];
		
		
		//mark each element as visited and return if seen before
		for(int value:nums) {
			if(visited[value]) {
				return value;
			}
			visited [value] = true;
		}
		//if no repetative nums return
		return -1;
	}
	
	public static void main(String args[]) {
		int[] nums = {1,2,3,4,4};
		System.out.println("The duplicate element is : "+ findDuplicate(nums));
	}
	
}



