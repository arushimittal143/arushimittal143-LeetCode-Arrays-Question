class Solution {
    public int[] searchRange(int[] num, int target) {
        int[] targetArr={-1,-1};
        
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==target)
            {
                targetArr[0]=i;
                break;
            }
        }                
        if(targetArr[0]==-1)
            return targetArr;
         for(int j=num.length-1;j>=0;j--)
        {
            if(num[j]==target)
            {
                targetArr[1]=j;
                break;
            }
        }
        return targetArr;
    }
}
