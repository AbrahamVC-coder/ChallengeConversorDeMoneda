import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversorDeMonedaMenu {

    public void ConversorDeMonedaMenu() throws IOException {

        String moneda1;
        String moneda2;
        double cantidad;

        Scanner monedaB = new Scanner(System.in);
        Scanner monedaT =  new Scanner(System.in);
        Scanner valor = new Scanner(System.in);
        Scanner salida = new Scanner(System.in);

        ConversorDeMonedaAPI consulta = new ConversorDeMonedaAPI();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        List<APIConversor> conversiones = new ArrayList<>();





        while(true) {

            System.out.println("***********************************");
            System.out.println("Seleccione la moneda que quiera convertir: \n" +
                    "Con la denominacion de 3 letras, ejemplo: USD");
            System.out.println("USD: Dolares\n" +
                    "MXN: Pesos Mexicanos\n" +
                    "AUD: Dolar Australiano\n" +
                    "ARS: Peso Argentino\n" +
                    "BOB: Peso Bolivano\n" +
                    "BRL: Real Brasilenio\n" +
                    "CLP: Peso Chileno\n" +
                    "COP: Peso Colombiano");
            System.out.println("*************************************");
            moneda1 = monedaB.nextLine();

            System.out.println("**************************************");
            System.out.println("Escriba la cantidad que desea convertir: ");
            System.out.println("**************************************");
            cantidad = valor.nextDouble();

            System.out.println("**************************************");
            System.out.println("Ahora seleccione la moneda de conversion: ");
            System.out.println("**************************************");
            moneda2 = monedaT.nextLine();


            APIConversor moneda = consulta.convierteMoneda(moneda1, moneda2, String.valueOf(cantidad));
            System.out.println("El valor de: " + cantidad + "[" + moneda1 + "]");
            System.out.println("Corresponde al valor final de: " + moneda);

            System.out.println("**************************************");
            System.out.println("Desea hacer otra conversion? S/N ");
            System.out.println("**************************************");

            var busqueda = salida.nextLine();

            if (busqueda.equalsIgnoreCase("N")){
                System.out.println("Fin del programa gracias por probarlo");
                break;
            }

            conversiones.add(moneda);

        }
            FileWriter escritura = new FileWriter("MonedasConvertidas.txt");
            escritura.write(gson.toJson(conversiones));
            escritura.close();

    }
}
