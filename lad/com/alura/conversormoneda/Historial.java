package lad.com.alura.conversormoneda;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    private static final List<String> registros = new ArrayList<>();

    public static void agregarRegistro(String registro) {
        registros.add(registro);
    }

    public static void mostrarHistorial() {
        if (registros.isEmpty()) {
            System.out.println("📭 Sin conversiones registradas.");
        } else {
            System.out.println("\n📘 Historial:");
            for (String registro : registros) {
                System.out.println(registro);
            }
        }
    }
}
