import java.util.Locale;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        System.out.println(esPalindromo(invertirPalabra(pedirEntrada())));
    }


    public static String invertirPalabra(String palabra) {
        StringBuilder palabraAux = new StringBuilder(palabra);
        palabra = palabraAux.reverse().toString().replace(" ","").toLowerCase(Locale.ROOT);

        return palabra;
    }

    public static boolean esPalindromo(String palabra){
        palabra = palabra.toLowerCase().replace(" ","");
        String palabraAux = invertirPalabra(palabra);
        return palabra.equals(palabraAux);
    }

    public static String pedirEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor escriba una palabra:");
        return scanner.nextLine();
    }


}

