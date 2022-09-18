
public class duplicatearray2 {
	public static int findDuplicateArray(int[] nums) {
		
		boolean visited[] = new boolean[nums.length + 1];
		
		for(int value:nums) {
			if(visited[value]) {
				return value;
			}
			visited[value]=true;
		}
		return -1;
		
	}
	public static void main(String args[]) {
		int[] nums = {1,2,3,4,2};
		System.out.println("The duplicate element is = "+findDuplicateArray(nums));
	}

}
