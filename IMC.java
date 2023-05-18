import java.util.Scanner;
  class Main {
    public static void main(String[]args) {
      Scanner in = new Scanner(System.in);
      

          System.out.print("Informe seu nome completo: ");
      String nome = in.nextLine(); 
      System.out.println("");

      System.out.print("Informe sua altura: ");
      Double altura = in.nextDouble();
      System.out.println("");

      System.out.print("Informe seu peso: ");
      Double peso = in.nextDouble();
      System.out.println("");

     
      in.close();
            
      double imc = peso/Math.pow(altura, 2);
      
int grau;
String classificacao;      
      
      if (imc<18.5) {
      grau = 0;
      classificacao = "MAGREZA";
      }
        
      else if (imc >= 18.5 && imc < 25) {
      grau = 0;
      classificacao = "NORMAL";
      }

      else if (imc >= 25 && imc < 30) {
      grau = 1;
      classificacao = "SOBREPESO";
      }

      else if (imc >= 30 && imc < 40) { 
      grau = 2;
      classificacao = "OBESIDADE";
      }

      else {  
      grau = 3;
      classificacao = "OBESIDADE GRAVE";
      }
      
      
      System.out.print("Paciente: " + nome + "\naltura: " + altura + "\npeso: " + peso);
      System.out.printf("\nIMC:" + "%.2f",imc);
      System.out.print("\nClassificação: " + classificacao + " e Obesidade Grau " + grau);
                        
      
      }
    }

  