package lad.com.alura.conversormoneda;

import java.io.IOException;
import java.util.Scanner;

public class Conversor {

    private static final String API_KEY = " 44d715fafeaa90fa42719f7e"; // 👈 Coloca aquí tu API KEY

    public static void eleccionUserMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("💱 Bienvenido al Conversor de Monedas");
        System.out.println("-------------------------------------");

        while (true) {
            try {
                System.out.print("Moneda origen (ej: USD): ");
                String from = scanner.nextLine().trim().toUpperCase();

                System.out.print("Moneda destino (ej: COP): ");
                String to = scanner.nextLine().trim().toUpperCase();

                System.out.print("Cantidad a convertir: ");
                double cantidad = Double.parseDouble(scanner.nextLine());

                String json = ConexionAPI.obtenerJsonDeAPI(from, API_KEY);
                double tasa = JsonParserHelper.extraerTasaDeCambio(json, to);
                double resultado = cantidad * tasa;

                String log = String.format("💰 %.2f %s = %.2f %s (Tasa: %.4f)", cantidad, from, resultado, to, tasa);
                System.out.println(log);
                Historial.agregarRegistro(log);

            } catch (IOException | InterruptedException e) {
                System.out.println("❌ Error al conectar con la API: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Cantidad inválida. Intenta nuevamente.");
            } catch (IllegalArgumentException e) {
                System.out.println("⚠️ " + e.getMessage());
            }

            System.out.print("\n¿Deseas hacer otra conversión? (s/n): ");
            String seguir = scanner.nextLine();
            if (!seguir.equalsIgnoreCase("s")) break;

            System.out.print("¿Deseas ver el historial? (s/n): ");
            if (scanner.nextLine().equalsIgnoreCase("s")) {
                Historial.mostrarHistorial();
            }
        }

        System.out.println("👋 ¡Gracias por usar el conversor!");
        scanner.close();
    }
}
