import java.util.Scanner;

/*public class GilArnau_Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();

            // Llegir opció de l'usuari
            System.out.print("Selecciona una opció: ");
            int opcio = scanner.nextInt();

            // Processar l'opció seleccionada
            switch (opcio) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplicacio();
                    break;
                case 4:
                    divisio();
                    break;
                case 5:
                    System.out.println("Adéu!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna a provar.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n----- Calculadora -----");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicació");
        System.out.println("4. Divisió");
        System.out.println("5. Sortir");
    }

    private static void suma() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introdueix el segon número: ");
        double num2 = scanner.nextDouble();

        double resultat = num1 + num2;
        System.out.println("La suma és: " + resultat);
    }

    private static void resta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introdueix el segon número: ");
        double num2 = scanner.nextDouble();

        double resultat = num1 - num2;
        System.out.println("La resta és: " + resultat);
    }

    private static void multiplicacio() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introdueix el segon número: ");
        double num2 = scanner.nextDouble();

        double resultat = num1 * num2;
        System.out.println("La multiplicació és: " + resultat);
    }

    private static void divisio() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix el numerador: ");
        double numerador = scanner.nextDouble();

        System.out.print("Introdueix el denominador: ");
        double denominador = scanner.nextDouble();

        if (denominador != 0) {
            double resultat = numerador / denominador;
            System.out.println("La divisió és: " + resultat);
        } else {
            System.out.println("Error: No es pot dividir per zero.");
        }
    }
} */





/*import java.util.Scanner;

public class GilArnau_Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica la quantitat de diners de la venta feta:");
        int opcio = scanner.nextInt();

        if (opcio < 20000) {
            calcula_bonificacion1(opcio);
        } else if (opcio >= 20000 && opcio <= 50000) {
            calcula_bonificacion2(opcio);
        } else if (opcio > 50000) {
            calcula_bonificacion3(opcio);
        }
    }

    private static void calcula_bonificacion1(int opcio) {
        double bonificaciofinal1 = 7000 + (opcio / 100.0) * 2;
        System.out.println("La bonificació és de " + bonificaciofinal1 + "$");
    }

    private static void calcula_bonificacion2(int opcio) {
        double bonificaciofinal2 = 15000 + (opcio / 100.0) * 3;
        System.out.println("La bonificació és de " + bonificaciofinal2 + "$");
    }

    private static void calcula_bonificacion3(int opcio) {
        double bonificaciofinal3 = 20000 + (opcio / 100.0) * 12;
        System.out.println("La bonificació és de " + bonificaciofinal3 + "$");
    }
}


        if (opcio < 20000) {
            calcula_bonificacion1(opcio);
        } else if (opcio >= 20000 && opcio <= 50000) {
            calcula_bonificacion2(opcio);
        } else if (opcio > 50000) {
            calcula_bonificacion3(opcio);
        }
    }

    private static void calcula_bonificacion1(int opcio) {
        double bonificaciofinal1 = 7000 + (opcio / 100.0) * 2;
        System.out.println("La bonificació és de " + bonificaciofinal1 + "$");
    }

    private static void calcula_bonificacion2(int opcio) {
        double bonificaciofinal2 = 15000 + (opcio / 100.0) * 3;
        System.out.println("La bonificació és de " + bonificaciofinal2 + "$");
    }

    private static void calcula_bonificacion3(int opcio) {
        double bonificaciofinal3 = 20000 + (opcio / 100.0) * 12;
        System.out.println("La bonificació és de " + bonificaciofinal3 + "$");
    }
}*/






import java.util.Scanner;

/*public class GilArnau_Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica la opció que vols convertir el graus: ");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        int opcio = scanner.nextInt();

        System.out.println("Indica la temperatura que vols convertir:");
        double temperatura = scanner.nextDouble();

        if (opcio == 1) {
            CaF(temperatura);
        } else if (opcio == 2) {
            FaC(temperatura);
        }
    }

    private static void FaC(double temperatura) {
        double Celsius = (5.0 / 9) * (temperatura - 32);
        System.out.println("La conversió a Celsius és: " + Celsius);
    }

    private static void CaF(double temperatura) {
        double Fahrenheit = (9.0 / 5) * temperatura + 32;
        System.out.println("La conversió a Fahrenheit és: " + Fahrenheit);
    }
}*/





/*public class GilArnau_Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la opció: ");
        System.out.println("1. Calcular Volum del cilindre");
        System.out.println("2. Calcular Área del cilindre");
        int opcio = scanner.nextInt();

        if (opcio == 1) {
            v();
        } else if (opcio == 2) {
            a();
        }

    }

    private static void a() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix la mida del radi en metres: ");
        double radi = scanner.nextDouble();

        System.out.print("Introdueix l'altura en metres: ");
        double altura = scanner.nextDouble();

        double area = 2 * Math.PI * radi * (radi + altura);
        System.out.println("La àrea és: " +area +"m²");


    }

    private static void v() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix la mida del radi en metres: ");
        double radi = scanner.nextDouble();

        System.out.print("Introdueix l'altura en metres: ");
        double altura = scanner.nextDouble();

        double volum = Math.PI * Math.pow(radi, 2) * altura;
        System.out.println("El volum és: " +volum + "m³");
    }

}*/

public class GilArnau_Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("");

    }

}



