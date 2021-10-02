//1st Method
//T.C-O(n)
//S.C-O(1)  
import java.util.*;
public class Main
{
    public static void sortColors(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int mid=0;
        int temp;
        while(mid<=h)
        {
            switch(nums[mid])
            {
                    //If the element is 0
                case 0:
                    temp=nums[l];
                    nums[l]=nums[mid];
                    nums[mid]=temp;
                    l++;
                    mid++;
                    break;
                     //If the element is 1
                case 1:
                    mid++;
                    break;
                     //If the element is 2
                case 2:
                    temp=nums[mid];
                    nums[mid]=nums[h];
                    nums[h]=temp;
                    h--;
                    break;
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=sc.nextInt();
		}
	    sortColors(arr);
	    for(int i=0;i<arr.length;i++){
	        System.out.println(arr[i]);
	    }
	}
}



//2nd Method
//T.C-O(n)
package ArrayList;

public class Q1m1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,0,0,2,1};
		int zeroCount=0;
		int oneCount=0;
		int i;
		
//		count no. of 0's
		for(i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zeroCount++;
			}
//			count no. of 1's
			
			if(arr[i]==1) {
				oneCount++;
				
			}
		}
//		setting value 0
		
		for( i=0;i<zeroCount;i++) {
			arr[i]=0;
		}
//		setting value 1
		for( i=zeroCount;i<(zeroCount+oneCount);i++) {
			arr[i]=1;
		}
		
// setting value 2
		for( i=(zeroCount+oneCount);i<arr.length;i++) {
			arr[i]=2;
		}
		
		
//		printing the sorted array
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

