package com.devsenior;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora(); // Esta linea crea un objeto de la clase Calculadora
        calc.sumar(5, 3);  // Argumentos que se le dicen a los numeors  5 y 3
        calc.restar(10, 4);
        calc.multiplicar(6, 7);
        calc.dividir(20, 5);
System.out.println("Operaciones realizadas correctamente.");

    }
}