/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacion1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class ListaEnteros {

    //Único atributo
    private ArrayList<Integer> lista;

    //Constructor sin parámetros que crea la lista
    public ListaEnteros() {
        this.lista = new ArrayList<>();
    }

    //Inserta un elemento [10-100] en la lista(sin posición) y devuelve true o false
    public boolean insertarElemento(Integer i) {
        if (i < 101 && i > 9) {
            lista.add(i);
            return true;
        } else {
            return false;
        }
    }

    //Inserta y si hay un elemento en esa posición corre a la derecha 1 posición
    //Devuelve true o false
    public boolean insertarElemento(Integer i, int pos) {
        if (i < 101 && i > 9) {
            lista.add(pos, i);
            return true;
        } else {
            return false;
        }
    }

    //Cambia el elemento en esa posición
    //Devuelve true o false
    public boolean cambiarElemento(Integer i, int pos) {
        if (i < 101 && i > 9) {
            try {
                lista.set(pos, i);
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                System.out.println("La posición no se encuentra en el ArrayList");
            }
            return true;
        } else {
            return false;
        }
    }

    //Devolverá el elemento Integer que ocupe la posición pos
    public Integer obtenerElemento(int pos) {
        try {
            return lista.get(pos);
        } catch (IllegalArgumentException iae) {
            return -1;
        }
    }

    //Devolverá la primera posición en la que encuentre un valor igual a i. 
    //En caso de no existir devolverá -1
    //Con búsqueda secuencial
    public int buscarElemento(Integer i) {
        int posicion = -1;
        int longitudArray = lista.size();
        for (int j = 0; j < longitudArray; j++) {
            if (lista.get(j).equals(i)) {
                posicion = j;
                break;
            }
        }
        return posicion;
    }

    //Método estático para leer datos numéricos, que leerá por teclado una 
    //cadena de texto, y devolverá un entero con la información leída.
    public static int leerEntero() {
        Scanner teclado = new Scanner(System.in);
        String numero;

        //Cuidamos las excepciones
        try {
            System.out.println("Introduzca una cadena de texto");
            numero = teclado.nextLine();
            return Integer.parseInt(numero);

        } catch (NumberFormatException nfe) {
            System.out.println("Se ha introducido datos erroneos");
            return -1;
        }

    }

    //Imprime la lista completa de números
    public void mostrar() {
        System.out.println("La lista de numeros es");
        for (Integer numero : lista) {
            System.out.println(numero);
        }
    }

    //Imprime la suma de los números par
    public void mostrarSumaPares() {

        //El arrayList es para insertar los datos específicos que sumaremos
        ArrayList<Integer> listaDePares = new ArrayList<>();
        int resultadoPar = 0;

        //Para dividir los números par de los impar
        for (Integer numero : lista) {
            if (numero % 2 == 0) {
                listaDePares.add(numero);
            }
        }

        //Con este for hacemos que se vayan sumando un número detrás de otro
        for (Integer sumaPar : listaDePares) {
            resultadoPar += sumaPar;
        }
        System.out.println("El resultado de la suma de los pares es: " + resultadoPar);
    }

    //Imprime la suma de los números impares
    public void mostrarSumaImpares() {

        //El arrayList es necesario para insertar los impares que más tarde sumaremos
        ArrayList<Integer> listaDeImpares = new ArrayList<>();
        int resultadoImpar = 0;

        //Para dividir los números par de los impar
        for (Integer numero : lista) {
            if (numero % 2 != 0) {
                listaDeImpares.add(numero);

            }
        }

        //Usamos el for para ir sumando
        for (Integer sumaImpar : listaDeImpares) {
            resultadoImpar += sumaImpar;
        }

        System.out.println("El resultado de la suma de los impares es: " + resultadoImpar);
    }

    //BUSCAMOS MAYORES Y MENORES CON FOR
    //busca el mayor de la lista usando for
    public int getMayorConFor() {
        int mayor = 0;
        for (int i = 0; i < lista.size(); i++) {
            //Conforme llega el mayor se va sustituyendo el valor
            if (lista.get(i) > mayor) {
                mayor = lista.get(i);
            }
        }
        return mayor;
    }

    //Busca el menor de la lista usando for
    public int getMenorConFor() {
        //Se pone el máximo porque si ponemos 0 no sale correctamente
        int menor = 101;
        for (int i = 0; i < lista.size(); i++) {
            //Se va sustituyendo conforme va viendo uno menor
            if (lista.get(i) < menor) {
                menor = lista.get(i);
            }
        }
        return menor;
    }

    //BUSCAMOS EL MAYOR Y MENOR CON COLLECTION
    //Devuelve el entero mayor de la lista
    public int getMayor() {
        return Collections.max(lista);
    }

    //Devuelve el entero menor de la lista
    public int getMenor() {
        return Collections.min(lista);
    }

    //Devuelve un numéro entero que es la longitud de la lista
    public int getLogitud() {
        return lista.size();
    }

    //Borra un elemento de la lista según la posicion que se mete por parámetros
    public boolean borrarElemento(int pos) {
        //Primero comprobamos que el número sea aceptado
        //Cuidamos las posibles excepciones
        try {
            lista.remove(pos);
            return true;
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("No se encuentra en la lista esa posición");
            return false;
        }

    }

}
