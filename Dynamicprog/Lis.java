package Dynamicprog;
public class Lis {

    public static void main(String[] args)
     {
        int[] arr = {5,8,7,1,9};
        int[] lis = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            lis[i]=1;
        }
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    lis[i] = Math.max(lis[i],lis[j]+1);
                }
            }
        }
        int maxx = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(lis[i]>maxx)
            {
                maxx = lis[i];
            }
        }
        System.out.println(maxx);
    }
}
/*another method */
/*
 * class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        for(int i=0;i<lis.length;i++)
        {
            lis[i] = 1;
        }
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(nums[i]>nums[j] && lis[i]<=lis[j])
                {
                    lis[i] = lis[j]+1;
                }
            }
        }
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(lis[i]>max)
            {
                max = lis[i];
            }
        }
        return max;

    }
}
 */