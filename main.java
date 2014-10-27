
public class main {
	
	public static void main(String args[]){
		
		int Zahl = 100 ;
		
		System.out.print(Zahl+" = ");
		
		for(int i = 2;i<=Zahl;i++){
			
			if(Zahl%i == 0){
				
				Zahl = Zahl/i;
				System.out.print(i+" ");
				i = 2;
				
			}
			
		}
		
	}

}
