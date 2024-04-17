/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ut8.Cuestionario;
import java.util.*;

/**
 *
 * @author veros
 */
public class Traductor_HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap <String, String> mapa = new HashMap <String, String>();
        Scanner in = new Scanner(System.in);
        for (int i = 0;i<2;i++){
        String clave = in.nextLine();
        String llave = in.nextLine();
        mapa.put(clave,llave);
        }
        //System.out.println(mapa);
        //System.out.println("Todas las palabras registradas");
        for (String i : mapa.keySet()){
            System.out.println(i  + ": " + mapa.get(i) );
        }
        mostrarMapa(mapa);
        System.out.println("Introducir palabra en español a traducir");
        String inUsuario = in.nextLine();
        System.out.println(mapa.get(inUsuario));
        System.out.println("Eliminar la palabra del diccionario que incluyas");
        String elimUsuario= in.nextLine();
        mapa.remove(elimUsuario);
        mostrarMapa(mapa);
    } 
    
    public static void mostrarMapa(HashMap<String, String> mapa){
        System.out.println("Todas las palabras registradas");
        for (String i : mapa.keySet()){
            System.out.println(i  + ": " + mapa.get(i) );
        }
    }
}        

    

