class Pattern11{
	public static void main(String [] args){
		int i,j,k;
			for(i=1;i<=5;i++){
			for(j=1;j<=5;j++){
				if(j<=5-i+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
				for(k=1;k<=5;k++)
					{
					if(k>=i)
					{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		
			System.out.println();
		}
		for(i=1;i<=5;i++){
			for(j=1;j<=5;j++){
				if(j<=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			
				for(k=1;k<=5;k++)
					{
					if(k>=5-i+1)
					{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

		
			System.out.println();
		
	}
}
}


