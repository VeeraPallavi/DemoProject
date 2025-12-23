package Arrays;

import java.lang.*;
public class LargestElement
{
    public static void main(String[] args)
    {
        int[] arr={64,34,86,32,76};
        int max=arr[0];
        for(int i:arr)
        {
            if(i>max)
            {
                max=i;
            }
        }
        System.out.print(max);
    }
}
