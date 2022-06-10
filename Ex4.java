import java.util.Scanner;
public class Ex4
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double y;
	    double soma = 0;
	    int contagem = 0;
	    int x = 0;
	    
	    do{
	       System.out.println("Digite 6 número:");
	       y = sc.nextDouble();
	       
	       if(y>0){
	           soma = y + soma;
	           contagem++;
	       }
	       x=x+1;
	    }
	    while(x<6);
	    
		System.out.println("Valor soma é: " + soma);
		System.out.println("Números digitados: " + contagem);
		System.out.println("Média: " + soma/contagem);
	}
}
