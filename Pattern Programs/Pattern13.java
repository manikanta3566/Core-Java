class Pattern13{
	public static void main(String [] args){
		int i,j,k;
		for(i=1;i<=5;i++){
			for(k=1;k<=5-i+1;k++){
				System.out.print(" ");
			}
			for(j=0;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}