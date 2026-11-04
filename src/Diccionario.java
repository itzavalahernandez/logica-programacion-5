import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {
        //diccionario con HashMap
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("gracias", "thank you");
        diccionario.put("por favor", "please");
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("agua", "water");
        diccionario.put("comida", "food");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("escuela", "school");
        diccionario.put("trabajo", "work");
        diccionario.put("ciudad", "city");
        diccionario.put("país", "country");
        diccionario.put("coche", "car");
        diccionario.put("árbol", "tree");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");

        // Escoger 5 palabras al azar
        ArrayList<String> palabras = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabras);
        palabras = new ArrayList<>(palabras.subList(0, 5));

        // Pedir traducciones y comprobar
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("=== Traduce las siguientes palabras al ingles ===\n");

        for (String palabraEspanol : palabras) {
            System.out.print("¿Cómo se dice \"" + palabraEspanol + "\" en inglés? ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            String traduccionCorrecta = diccionario.get(palabraEspanol);

            if (respuesta.equals(traduccionCorrecta.toLowerCase())) {
                System.out.println("¡Correcto!\n");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: "
                        + traduccionCorrecta + "\n");
                incorrectas++;
            }
        }

        scanner.close();

        // Mostrar resumen por consola
        System.out.println("=== RESULTADOS ===");
        System.out.println("Respuestas correctas:   " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);
        System.out.println("Nota: " + correctas + "/5");
    }
}