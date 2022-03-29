package programs15;

public class MaxDistBetweenSeats {	       

	private static int MaxDistToClosest(int[] seats) {
		 int start=0;
	        int end=0;
	        int middle =0;
	        int k=0,i,j;
	        if(seats.length==0) {
	       	 System.out.println("invalid input parameters");
return 0 ;	        }
	        	
	        for (int j2 = 0; j2 < seats.length; j2++) {
	        	 if(!(seats[j2]==1 && seats[j2]==0)) {
	        		 System.out.println("invalid input parameters");
	        	 }
			}
	       
	        for(i=0;i<seats.length;i++){
	            if(seats[i]==1){
	                break;   
	            }
	            start++;
	        }
	        
	        for(j=i+1;j<seats.length;j++){
	            if(seats[j] == 1){
	                k++;
	                middle = Math.max(middle,k);
	                k=0;
	            }else{
	                k++;
	            }
	        }
	        end = k;
	        return Math.max(Math.max(start,middle/2),end);
	    }
	
	public static void main(String[] args) {
		int[] seats= {};
		System.out.println(MaxDistToClosest(seats));
	}
	
}
