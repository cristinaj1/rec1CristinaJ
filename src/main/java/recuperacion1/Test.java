/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacion1;

import static recuperacion1.ListaEnteros.leerEntero;

/**
 *
 * @author Cris
 */
public class Test {

    public static void main(String[] args) {

        //Crea un objeto ListaEnteros.
        ListaEnteros lista = new ListaEnteros();

        //Rellena la lista con 15 objetos Integer. Para ello usa el método estático leerEntero().
        for (int i = 0; i < 15; i++) {
            lista.insertarElemento(leerEntero());
        }

        //Muestra la lista.
        lista.mostrar();

        //Inserta un elemento en la posición 4.
        lista.insertarElemento(57, 4);

        //Muestra la lista.
        lista.mostrar();

        //Obtén el elemento que ocupe la posición 2 e imprime su valor por consola.
        System.out.println("Elemento de la posición 2-------- " + lista.obtenerElemento(2));

        //Busca en la lista el elemento "98" y muestra el resultado de la búsqueda.
        System.out.println("El elemento 98 se encuentra en la posicion:   " + lista.buscarElemento(98));

        //Muestra la suma de los pares, impares, el elemento mayor y el elemento menor.
        //Par
        System.out.println("Suma par--------");
        lista.mostrarSumaPares();

        //Impar
        System.out.println("Suma impares---------");
        lista.mostrarSumaImpares();

        //Mayor
        System.out.println("El número mayor-----------" + lista.getMayor());
        //Con for
        System.out.println("Mayor con for----" + lista.getMayorConFor());

        //Menor
        System.out.println("El número menor-------" + lista.getMenor());
        //Con for
        System.out.println("Menor con for----" + lista.getMenorConFor());

        //Borra el elemento que ocupa la posición 12
        System.out.println("Lista después de borrar el elemento número 12------");
        lista.borrarElemento(12);

        //Muestra la lista
        lista.mostrar();
        
        //No aparece en el ejercicio, es una prueba por si funcionaba el método
        //System.out.println("Longitud del array-----" + lista.getLogitud());
    }

}
