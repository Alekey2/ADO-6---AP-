import java.util.Scanner;
public class Ex5
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N;
		
		do{
		    System.out.println("Digite um valor para N: ");
		    N = sc.nextInt();
		    
		    if(N>=2 && N<=1000){
		        for(int i=1 ; i<11; i++){
		            System.out.println(i + " * " + N + " = " + (i*N));
		            
		        }
		        break;
		    }
		    else if(N<=1 || N>=1001){
		        System.out.println("Número digitado é Inválido");
		    }
		    break;
		    }
		    while(N>=1);
	}
}
