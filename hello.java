import java.util.Scanner;

public class hello {
    public static void main (String[] args){
        System.out.println("Digite o ano do seu nascimento");
        Scanner sc = new Scanner(System.in);
        Integer ano = sc.nextInt();
        Integer idade = 2024 - ano;
        System.out.println("Sua idade no ano de 2024 será : " + idade);
        sc. close();
    }
}