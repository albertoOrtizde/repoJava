import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int solucion;
        solucion = Integer.parseInt(br.readLine());
        if (solucion > 0){
            System.out.println("mensaje alerta solucionado.");
        }
    }
}