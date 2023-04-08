import java.util.Scanner;
class Main{
public static void main(String[] args){
//Mostrar variaveis
double metros;
double centimetros;
//Passo1:Entrada de dados
Scanner teclado = new Scanner(System.in);
  System.out.println("Digite um número em metros");
metros = teclado.nextDouble();
//Passo2:Transformar metros em centimetros
centimetros = metros * 100;
//Passo3:Mostrar resultado
System.out.println("O número em centimetros é:" + centimetros);
}
}
