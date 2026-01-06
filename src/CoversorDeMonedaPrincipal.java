import java.io.IOException;

public class CoversorDeMonedaPrincipal {

    public static void main(String[] args) {

        ConversorDeMonedaMenu menu = new ConversorDeMonedaMenu();

        try{

            menu.ConversorDeMonedaMenu();

        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Fin del programa");
        }

    }
}
