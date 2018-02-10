package labs.comp3111.ust.hk;

public class Lab1Activity {
     public static void main(String[] arg)
     {
    	 int arr[] = {1,2,3,4,5,6,7,8,9,10};
    	 int sum = 0;
    	 for(int i = 0;i<10;i++)
    		 sum = sum + arr[i];
    	 System.out.print(String.format("The sum of the numbers is %d \n",sum));
    	 int max = arr[0];
    	 int min = arr[0];
    	 for(int i = 0 ; i <10 ;i++)
    	 {
    		 if(arr[i]<min)
    			 min = arr[i];
    		 if(arr[i]>max)
    			 max = arr[i];
    	 }
    	 System.out.print(String.format("Min = %d; Max = %d ",min,max));
     }
}
