package miscelleneous;

public class SecondLargest{
	 public static void main(String[] args)
	 {
	    int [] arr={1,2,3,7,8,10,4} ;
		
		int firstLargest= arr[0];
		
		int secondlargest=0;
		
		for(int i=1;i<arr.length;i++)
		{
		   if(arr[i]>firstLargest )
		   {
		      secondlargest=firstLargest;
			  firstLargest=arr[i];
		   
		   }
		   /*else if(secondlargest<firstLargest){
		       //arr[i]=secondlargest;
			   secondlargest=arr[i];	   
		   
		   }*/
		   
		  }
		    System.out.println(firstLargest);
		   System.out.println(secondlargest);
		}
	  // System.out.println(secondlargest);

	}