package com.example.examen;

public class funciones {
    private String palabra;

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int vocales(String palabra){
        String palabra2 = palabra.toLowerCase();
        palabra2 = palabra2.replace(" ", "");

        int vocales = 0;

        for (int i = 0; i < palabra2.length(); i++){
            if (palabra2.charAt(i) == 'a' || palabra2.charAt(i) == 'e' || palabra2.charAt(i) == 'i' || palabra2.charAt(i) == 'o' ||palabra2.charAt(i) == 'u'){
                vocales ++;
            }
        }

        return vocales;
    }

    public int consonantes(String palabra){
        String palabra2 = palabra.toLowerCase();
        palabra2 = palabra2.replace(" ", "");

        int consonantes = 0;

        for (int i = 0; i < palabra2.length(); i++){
            if (palabra2.charAt(i) != 'a' && palabra2.charAt(i) != 'e' && palabra2.charAt(i) != 'i' && palabra2.charAt(i) != 'o' && palabra2.charAt(i) != 'u'){
                consonantes ++;
            }
        }

        return consonantes;
    }

    public String palindromo(String palabra){
        String palabra2 = palabra.toLowerCase();
        palabra2 = palabra2.replace(" ", "");

        for (int i = 0; i < palabra2.length(); i++){
            if (palabra2.charAt(i) != palabra2.charAt(palabra2.length()-i-1)){
                return "No es palindromo";
            }
        }

        return "Si es palindromo";
    }
}
