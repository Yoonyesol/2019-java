
public class GuGudanLength {

	public static void main(String[] args) {
		 int k=1;
		  int f=4;
		  for(int m=1; m<=3; m++) {
		   for(int i=1; i<10; i++) {
		  
		    if (m==2) {
		     k=4;
		     f=7;
		    } 
		    
		    
		    if(m==3) {
		     k=7;
		     f=10;
		    
		    }
		    
		    for(int j=k; j<f; j++) {
		     System.out.print(j+"*"+i+"="+i*j+"\t");
		    
		    
		     }
		    System.out.println(); 
		    
		   }
		   
		   System.out.println();
		  }
		  
		  
	}

}
