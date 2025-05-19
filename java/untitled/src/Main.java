/*
* 1. Reciba un menu semanal (lista de recetas por dia)
* 2. Verifique los ingredientes disponibles en inventario
* 3. Calcule la lista de compras con cantidades agregadas de lo que falta.
* 4. Opcional: Clasifique los productos por categoria (e.g., frutas, carnes, lacteos, etc.)
* */

import java.util.*;

class Ingrediente {
    String nombre;
    int cantidad;
    String unidad;
}



public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dia de la semana: ");
        String dia = scanner.nextLine().toLowerCase();
        verificarInventario(dia);
        scanner.close();
    }

    static void cargarMenu() {}

    static void verificarInventario(String dia) {

    }

    static Ingrediente buscarEnInventario(String nombre) {
        return null;
    }
}