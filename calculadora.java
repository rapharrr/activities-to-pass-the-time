import java.util.Scanner;

class calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float numero1, numero2;
        String operação;

        System.out.print("Digite o primeiro valor: ");
        numero1 = input.nextFloat();
        System.out.print("Digite o segundo valor: ");
        numero2 = input.nextFloat();

        System.out
                .print("Informe a operação que deseja fazer, Divisão (/), Soma(+), Subtração(-), multiplicação(x):  ");
        operação = input.next();

        switch (operação) {
            case "/":
                System.out.print("O resultado da divisão é: ");
                System.out.println(numero1 / numero2);
                System.out.print("Deseja continuar ? ");

                break;
            case "+":
                System.out.print("O resultado da soma é: ");
                System.out.println(numero1 + numero2);
                break;
            case "-":
                System.out.print("O resultado da subtração é: ");
                System.out.println(numero1 - numero2);
                break;
            case "x":
                System.out.print("O resultado da multiplicação é: ");
                System.out.println(numero1 * numero2);
                break;
        }
        input.close();
    }
}
