public class Star8 {
     public static void main(String[] args) {
		
		int k = 1; 
		int n = 0;
		for (int j = 1; j <20; j++) {
			for (int m = 10; m>k; m--) {
				System.out.printf(" ");
			}
			for (int i = 0; i<=n; i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			
			if (j < 10) {
				k++;
				n=n+2;
				} else {
					k--;
					n=n-2;
				}	
		}

	}

}