import java.util.Scanner;

// ========================================
// CALCULADORA SIMPLES EM JAVA
// ========================================
// Descrição: Calculadora de linha de comando que realiza
// operações matemáticas básicas (adição, subtração, 
// multiplicação e divisão

public class Calculadora {

public static void main(String[] args) {
    // Criando o Scanner para ler entrada do usuário
    Scanner scanner = new Scanner(System.in);
    String continuar = "s";


    // Loop Principal da calculadora
while (continuar.equals("s")) {
    System.out.println("== Calculadora ==");
    
    // Solicita ao usuário que escolha uma operação matemática
    System.out.print("Digite a operação (+, -, *, /):");
    String operacao = scanner.next();

    // Aqui o usuario ira escrever o primeiro numero parao o calculo
    System.out.println("Digite o primeiro numero:");
    double numero1 = scanner.nextDouble();
    
    // Aqui o usuario ira escrever o segundo numero parao o calculo
    System.out.println("Digite o segundo numero:");
    double numero2 = scanner.nextDouble();

    // Inicializada com 0 por segurança
    double resultado = 0;

    // Estrutura condicional para determinar qual operação executar
    // Compara a operação digitada e executa o cálculo correspondente
    if (operacao.equals("+")) {
        //Operação de ADIÇÂO
        resultado = numero1 + numero2;
    } else if (operacao.equals("-")) {
        //Operação De SUBTRAÇÂO
        resultado = numero1 - numero2;
    } else if (operacao.equals("*")) {
        //Operação ed MULTIPLICAÇÂO
        resultado = numero1 * numero2;
    } else if (operacao.equals("/")) {
        //Operação de DIVISÂO
      if (numero2 !=0) {
        resultado = numero1 / numero2;
    } else {
        //Exibe o erro caso tente dividir por 0
        System.out.println("Operação Invalida");
    }
    
    //Exibe o resultado
    System.out.println("Resultado" + resultado);

    //Pergunta ao usuario se deseja fazer mais um calculo
    System.out.println("Deseja outro Calculo? (s/n): ");
        continuar = scanner.next();

} //fim do LOOP

    //Fecha o objeto While por boa pratica
    scanner.close();
    System.out.println("Calculadora Encerrada!");

} //Fim do metodo Main

} //Fim da Classe Calculadora


// ========================================
// TECNOLOGIAS UTILIZADAS:
// - Java SE
// - Scanner (java.util)
// 
// CONCEITOS APLICADOS:
// - Estruturas condicionais (if/else)
// - Laços de repetição (while)
// - Entrada e saída de dados
// - Operadores matemáticos
// - Tipos primitivos (double)
// - Manipulação de Strings
// ========================================