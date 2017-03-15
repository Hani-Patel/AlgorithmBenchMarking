import java.util.*;

class ScannerExample{
    
      	public  void sorty(){
        
        System.out.println("Enter array size");
        Scanner obj = new Scanner(System.in);
        
         int size=0;
         try{
	     size = obj.nextInt();
	     }catch(InputMismatchException e){
		 System.out.println("Enter the correct choice");
		 System.exit(0);
	     }
 
        int[] array = new int[size];
        System.out.println("Size of array is: " + size);
                
   	   System.out.println("\nEnter your choice:");
       System.out.println("1.Best case");
	   System.out.println("2.Average case");
	   System.out.println("3.Worst case");
	
	int choice = 0;
	try{
	choice = obj.nextInt();
	}catch(InputMismatchException e){
		System.out.println("Enter the correct choice");
		System.exit(0);
	}

   // int choice= obj.nextInt();
 	   
    switch (choice) {
        case 1:
			System.out.println("Best case");
			
			break;
        case 2:
            System.out.println("Average case");
            break;
        case 3:
            System.out.println("worst case");
            break;
        default:
            System.out.println("Enter proper choice");
            break;
    }
   
   if(choice==1){
       System.out.println("natural array");
       for(int i=0;i<array.length;i++){
			array[i]=i+1;
	  	System.out.print(array[i] + " "); 
	}
	}

	if(choice==2){	        
        System.out.println("random array");  
		for(int i=0;i<array.length;i++)
		array[i]=(int)(Math.random()*10);
        for(int i=0; i < array.length; i++){  
	    System.out.print(array[i] + " "); 
	    }
	    }
    if(choice==3){
        for(int i=0; i <array.length; i++)
	    array[i]=i+1;
	    for (int i =array.length -1; i>=0;i--)
	    System.out.print(array[i] + " "); 
	
   }
    
    System.out.println("\nEnter your choice:");
    System.out.println("1.Bubble sort");
	System.out.println("2.Selection sort");
	System.out.println("3.Insertion sort");
	System.out.println("4.Quick sort");
	System.out.println("5.merge sort");
	System.out.println("6.heap sort");
    System.out.println("7.Start over");
    System.out.println("8.Bench mark");
    System.out.println("9.Exit");
   int choice1 = 0;
	try{
	choice1 = obj.nextInt();
	}catch(InputMismatchException e){
		System.out.println("Enter the correct choice");
		System.exit(0);
	}
	
     
    //int choice1;
    //choice1= obj.nextInt();
    switch (choice1) {
        case 1:
			System.out.println("Bubble sort");
		       long startTime = System.nanoTime();
		  	  Algorithm.bubbleSort(array);
			  for(int i=0; i <array.length; i++)
	          System.out.print(array[i]+" ");
		      long duration = System.nanoTime() - startTime;
			System.out.println("\n The time duration in millisecond is = " + duration/1000000);
	
	        break;
        case 2:
            System.out.println("Selection sort");
			 long startTime1 = System.nanoTime();
			Algorithm.selectionSort(array);
			for(int i=0; i <array.length; i++)
	        System.out.print(array[i]+" ");
            long duration1 = System.nanoTime() - startTime1;
			System.out.println("\n The time duration in millisecond is = " + duration1/1000000);
	
			break;
        case 3:
            System.out.println("insertion sort");
			long startTime2 = System.nanoTime();
			Algorithm.insertionSort(array);
			for(int i=0; i <array.length; i++)
	        System.out.print(array[i]+" ");
            long duration2 = System.nanoTime() - startTime2;
			System.out.println("\n The time duration in millisecond is = " + duration2/1000000);
	
            break;
        
        case 4:
            System.out.println("Quick Sort");
	       long startTime3 = System.nanoTime();
		     Algorithm re =new Algorithm();
		     re.sort(array);
            for(int i:array){
            System.out.print(i);
            System.out.print(" ");
              }
		    long duration3 = System.nanoTime() - startTime3;
			System.out.println("\n The time duration in millisecond is = " + duration3/1000000);

			 break;
			 
	 case 5:System.out.println("Merge Sort ");
	     long   startTime4 = System.nanoTime();
		  Algorithm mms = new Algorithm();
            mms.Sort(array);
            for(int i:array){
            System.out.print(i);
            System.out.print("  ");
			}

		 long   duration4 = System.nanoTime() - startTime4;
			System.out.println("\n The time duration in millisecond is = " + duration4/1000000);

			 break;
			
			
	 case 6:System.out.println("Heap Sort");
	      long startTime5 = System.nanoTime();
		  Algorithm.Sort1(array);
          for(int i:array){
            System.out.print(i);
            System.out.print(" ");
	     	}

		    long duration5 = System.nanoTime() - startTime5;
			System.out.println("\n The time duration in millisecond is = " + duration5/1000000);

			 break;





        case 7:
		  sorty();
		  
		  break; 
		 
		 case 8:
	     	System.out.println("Bubble sort");
		       long startTime6 = System.nanoTime();
		  	  Algorithm.bubbleSort(array);
			  for(int i=0; i <array.length; i++)
	          System.out.print(array[i]+" ");
		      long duration6 = System.nanoTime() - startTime6;
			System.out.println("\nThe time duration in millisecond  is = " + duration6/1000000);
	

	        System.out.println("Selection sort");
			 long startTime7 = System.nanoTime();
			Algorithm.selectionSort(array);
			for(int i=0; i <array.length; i++)
	        System.out.print(array[i]+" ");
            long duration7 = System.nanoTime() - startTime7;
			System.out.println("\nThe time duration  in millisecond is = " + duration7/1000000);
	

	        System.out.println("insertion sort");
			long startTime8 = System.nanoTime();
			Algorithm.insertionSort(array);
			for(int i=0; i <array.length; i++)
	        System.out.print(array[i]+" ");
            long duration8 = System.nanoTime() - startTime8;
			System.out.println("\nThe time duration in millisecond is = " + duration8/1000000);
	
           System.out.println("Quick Sort");
	       long startTime9 = System.nanoTime();
            Algorithm  r=new Algorithm();
             r.sort(array);
            for(int i:array){
            System.out.print(i);
            System.out.print(" ");
              }
		    long duration9 = System.nanoTime() - startTime9;
			System.out.println("\n The time duration in millisecond is = " + duration9/1000000);
	        
	        System.out.println("Merge Sort ");
	        long   startTime10 = System.nanoTime();
	 	    Algorithm mm = new Algorithm();
            mm.Sort(array);
            for(int i:array){
            System.out.print(i);
            System.out.print("  ");
			}

		   long   duration10 = System.nanoTime() - startTime10;
			System.out.println("\n The time duration in millisecond is = " + duration10/1000000);

           System.out.println("Heap Sort");
	       long startTime11 = System.nanoTime();
   	   	  Algorithm.Sort1(array);
           for(int i:array){
            System.out.print(i);
            System.out.print(" ");
	     	}

	    long duration11 = System.nanoTime() - startTime11;
			System.out.println("\n The time duration in millisecond is = " + duration11/1000000);
	

    	   break;
	  	
		 case 9:
		  System.exit(0);
		  break;
		default:
            System.out.println("Enter proper choice");
            break;
        }
    }


public static void main(String[] args) {
   ScannerExample s1=new ScannerExample();
   s1.sorty();
	  
   
}

    
 }

 
 