import java.util.*;
public class LargestArrayElement{
    //function where i will send the num
    public int largestNum(int [] nums, int length)
    {
        int max=nums[0];
        for(int i=1;i<length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Size of array
        int n=sc.nextInt();
        //declare array
        int [] a= new int[n];
        //take array input
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            //coul apply largest filter here, but will do in function
        }
        LargestArrayElement obj=new LargestArrayElement();
        int largest= obj.largestNum(a,n);
        System.out.println("Largest number is:"+ largest);
    }
}