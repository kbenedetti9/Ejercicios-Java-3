package proyecto1personal;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Karen Benedetti M
 */
public class Proyecto1Personal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(in);

        /*1.Salario semanal*/
        System.out.println("Ingrese el salario actual");
        float salario = lector.nextFloat();
        float salarioSemana = salario / 4;
        System.out.println("El salario semanal es de " + salarioSemana);
        /*2.Calificacion final*/
        System.out.println("Ingrese la primera nota");
        float nota1 = lector.nextFloat();
        System.out.println("Ingrese la segunda nota");
        float nota2 = lector.nextFloat();
        System.out.println("Ingrese la tercera nota");
        float nota3 = lector.nextFloat();
        float notaFinal = (nota1 + nota2 + nota3) / 3;
        System.out.println("Nota final de: "+notaFinal);
        /*3.Cuadrado de una suma*/
        System.out.println("Ingrese un numero");
        int num1 = lector.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = lector.nextInt();
        int suma = num1 + num2;
        double resultado = Math.pow(suma, 2);
        System.out.println("El resultado es de: " + resultado);
        /*4.Ecuacion de segundo grado*/
        System.out.println("Ingrese el valor de A");
        double a = lector.nextDouble();
        System.out.println("Ingrese el valor de B");
        double b = lector.nextDouble();
        System.out.println("Ingrese el valor de C");
        double c = lector.nextDouble();
        double numCuadrado = Math.pow(b, 2);
        double resultRaiz = Math.sqrt(numCuadrado - (4*a*c));
        double resultPositivo = ((b + resultRaiz) / 2 * a);
        double resultNegativo = ((b - resultRaiz) / 2 * a);
        System.out.println("El resultado + es: " + resultPositivo);
        System.out.println("El resutado - es: " + resultNegativo);

    }

}
