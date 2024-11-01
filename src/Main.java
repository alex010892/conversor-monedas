import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        double monedaApi = 0;
        double monedaConvertida = 0;
        double monedaAConvertir = 0;
        int opcion = 0;
        String clave = "";
        Moneda moneda = null;
        while(opcion != 7){
            System.out.println("\n***************************************************");
            System.out.println("Bienvenido al conversor de monedas: ");
            System.out.println("1. Dolar a peso colombiano");
            System.out.println("2. Peso colombiano a dolar");
            System.out.println("3. Dolar a peso argentino");
            System.out.println("4. Peso argentino a dolar");
            System.out.println("5. Dolar a real brasileño");
            System.out.println("6. Real brasileño a dolar");
            System.out.println("7. Salir");
            System.out.println("Escoja una opcion valida: ");
            System.out.println("***************************************************");
            opcion = scanner.nextInt();
            moneda = consultaMoneda.buscaMoneda();
            if(opcion == 1){
                System.out.println("Digite la cantidad de dolares a convertir: ");
                monedaAConvertir = scanner.nextDouble();
                clave = "COP";
                monedaApi = moneda.conversion_rates().get(clave);
                monedaConvertida = monedaAConvertir * monedaApi;
                monedaConvertida = Math.round(monedaConvertida * 100.0) / 100.0;
                System.out.println(monedaAConvertir + " dolares equivalen a " +  monedaConvertida + " pesos colombianos");
            } else if (opcion == 2){
                System.out.println("Digite la cantidad de pesos colombianos a convertir: ");
                monedaAConvertir = scanner.nextDouble();
                clave = "COP";
                monedaApi = moneda.conversion_rates().get(clave);
                monedaConvertida = monedaAConvertir / monedaApi;
                monedaConvertida = Math.round(monedaConvertida * 100.0) / 100.0;
                System.out.println(monedaAConvertir + " pesos colombianos equivalen a " +  monedaConvertida + " dolares");
            }else if (opcion == 3){
                System.out.println("Digite la cantidad de dolares a convertir: ");
                monedaAConvertir = scanner.nextDouble();
                clave = "ARS";
                monedaApi = moneda.conversion_rates().get(clave);
                monedaConvertida = monedaAConvertir * monedaApi;
                monedaConvertida = Math.round(monedaConvertida * 100.0) / 100.0;
                System.out.println(monedaAConvertir + " dolares equivalen a " +  monedaConvertida + " pesos argentinos");
            } else if (opcion == 4){
                System.out.println("Digite la cantidad de pesos argentinos a convertir: ");
                monedaAConvertir = scanner.nextDouble();
                clave = "ARS";
                monedaApi = moneda.conversion_rates().get(clave);
                monedaConvertida = monedaAConvertir / monedaApi;
                monedaConvertida = Math.round(monedaConvertida * 100.0) / 100.0;
                System.out.println(monedaAConvertir + " pesos argentinos equivalen a " +  monedaConvertida + " dolares");
            } else if (opcion == 5){
                System.out.println("Digite la cantidad de dolares a convertir: ");
                monedaAConvertir = scanner.nextDouble();
                clave = "BRL";
                monedaApi = moneda.conversion_rates().get(clave);
                monedaConvertida = monedaAConvertir * monedaApi;
                monedaConvertida = Math.round(monedaConvertida * 100.0) / 100.0;
                System.out.println(monedaAConvertir + " dolares equivalen a " +  monedaConvertida + " reales brasileños");
            } else if (opcion == 6){
                System.out.println("Digite la cantidad de reales brasileños a convertir: ");
                monedaAConvertir = scanner.nextDouble();
                clave = "BRL";
                monedaApi = moneda.conversion_rates().get(clave);
                monedaConvertida = monedaAConvertir / monedaApi;
                monedaConvertida = Math.round(monedaConvertida * 100.0) / 100.0;
                System.out.println(monedaAConvertir + " reales brasileños equivalen a " +  monedaConvertida + " dolares");
            }
            else if (opcion == 7) {
                System.out.println("Gracias por usar el servicio. Hasta luego");
            }
        }

    }
}