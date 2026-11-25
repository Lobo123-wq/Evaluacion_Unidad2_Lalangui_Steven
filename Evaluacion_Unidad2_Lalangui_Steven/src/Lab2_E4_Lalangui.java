import java.util.Scanner;
public class Lab2_E4_Lalangui {
    static int leerMinutos(Scanner sc) {
        int minutos;
        do {
            System.out.print("Ingrese los minutos (1-1440): ");
            while (!sc.hasNextInt()) {
                System.out.print("Dato inválido. Ingrese un entero (1-1440): ");
                sc.next();
            }
            minutos = sc.nextInt();
            if (minutos < 1 || minutos > 1440)
                System.out.println("Los minutos deben estar entre 1 y 1440.");
        } while (minutos < 1 || minutos > 1440);
        return minutos;
    }
    static int horasCobradas(int minutos) {
        return (minutos + 59) / 60;
    }
    // A = auto; M = moto.
    static double tarifa(int horas, char tipo) {
        double precioHora;
        if (tipo == 'A') precioHora = 1.00;
        else if (tipo == 'M') precioHora = 0.50;
        else throw new IllegalArgumentException("Tipo de vehículo inválido.");
        double total = horas * precioHora;
        if (horas > 8) total *= 0.80;
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos = leerMinutos(sc);
        System.out.print("Tipo de vehículo (A = auto, M = moto): ");
        char tipo = Character.toUpperCase(sc.next().charAt(0));
        while (tipo != 'A' && tipo != 'M') {
            System.out.print("Tipo inválido. Ingrese A o M: ");
            tipo = Character.toUpperCase(sc.next().charAt(0));
        }
        int horas = horasCobradas(minutos);
        System.out.println("Horas cobradas: " + horas);
        System.out.printf("Total a pagar: $%.2f%n", tarifa(horas, tipo));
        sc.close();
    }
}