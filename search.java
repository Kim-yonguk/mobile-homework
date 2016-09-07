public class search
{
   public static int compare(int x,int y)
   {
      if(x>y)
         return 1;
      else if(x<y)
         return 2;
      else
         return 3;
   
   }
   public static int binarysearch(int array[],int num,int left,int right)
   {
      int middle;
      if((array[9]<num)||array[0]>num)
    	  return 0;
      else
      {
      while(left<=right)
      {
         middle=(left+right)/2;
         switch(compare(array[middle],num))
         {
         
         case 1: right=middle-1; break;
         
         case 2: left=middle+1; break;
         
         case 3: return -1;
         
      
         }
         
      }
      return -1;
      }
   }
   
   public static void main(String[] args)
   {
      int arr[]={1,2,3,4,5,6,7,8,9,10};
      int found,found1;
      found=search.binarysearch(arr,5,1,10);
      found1=search.binarysearch(arr,15,1,10);
      if(found==-1)
         System.out.println("Found");
      else
         System.out.println("Not Found");
      if(found1==-1)
          System.out.println("Found");
       else
          System.out.println("Not Found");
      
   }
}