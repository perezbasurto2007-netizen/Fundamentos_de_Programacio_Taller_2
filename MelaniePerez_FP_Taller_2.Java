import java.util.Scanner;

public class MelaniePerez_FP_Taller2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int asientos = 50;

        // Paso 1: Solicitar hora
        System.out.print("Ingrese la hora actual (formato 24h): ");
        int hora = sc.nextInt();

        // Paso 2: Validar horario
        if (hora >= 6 && hora <= 23) {

            // Paso 3: Verificar asientos
            if (asientos > 0) {

                sc.nextLine(); // Limpiar buffer

                // Datos del pasajero
                System.out.print("Ingrese nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Ingrese cedula: ");
                String cedula = sc.nextLine();

                System.out.print("Ingrese edad: ");
                int edad = sc.nextInt();

                // Tipo de boleto
                System.out.println("Seleccione tipo de boleto:");
                System.out.println("1. Internacional");
                System.out.println("2. Nacional");
                int ticket = sc.nextInt();

                // Ruta
                if (ticket == 1) {
                    System.out.println("Ruta: Guayaquil - Miami");
                } else {
                    System.out.println("Ruta: Guayaquil - Cuenca");
                }

                // Equipaje
                System.out.print("Ingrese cantidad de maletas: ");
                int maletas = sc.nextInt();

                System.out.print("Ingrese peso del equipaje (kg): ");
                double peso = sc.nextDouble();

                // Validación de equipaje
                if (maletas <= 1 && peso <= 21) {
                    System.out.println("Reserva confirmada");
                    asientos--; // Restar asiento
                } else {
                    System.out.println("Equipaje no procede");
                }

            } else {
                System.out.println("No hay disponibilidad de asientos");
            }

        } else {
            System.out.println("Sistema fuera de horario");
        }

        sc.close();
    }
}
