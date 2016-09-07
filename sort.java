public class sort {
    public static int[] arr(int[] arr)
    {
    	int i,j,min;
    	for(i=0; i<arr.length; i++)
    	{
    		min=i;
    		for(j=i+1; j<arr.length; j++)
    		{
    			if(arr[min]>arr[j])
    			{
    				min=j;
    			}
    			if(min!=i)
    			{
    				int temp=arr[i];
    				arr[i]=arr[min];
    				arr[min]=temp;
    			}
    		}
    	}
    	return arr;
    }
    public static void main(String[] args)
    {
    	int[] arr={1,4,6,3,2,9,10};
    	for(int i=0; i<arr.length; i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println("");
    	sort.arr(arr);
    	for(int i=0; i<arr.length; i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    }
}