package Main;

import HashTable.Hash;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
    private Scanner input = new Scanner(System.in);
    ProductFunctions functions = new ProductFunctions();
    Hash hash = new Hash();

    public void showMenu() throws FileNotFoundException {
        System.out.println("*******************************");
        System.out.println("*****CATALOGO DE PRODUCTOS*****");
        System.out.println("*******************************");
        System.out.println("1. Cargar datos");
        System.out.println("2. Buscar datos con aproximacion de nombre");
        System.out.println("3. Ultimos digitos del codigo");
        System.out.println("4. Tabla hash");
        System.out.println("5. Salir");
        System.out.println("*******************************");
        int option = input.nextInt();

        switch (option){
            case 1:functions.loadDataFunctions();
                break;
            case 2:
                System.out.println("Ingrese el texto");
                String lala = input.nextLine();
                functions.readList(input.nextLine());
                break;
            case 3:
                functions.threeDigitsCode();
                break;
            case 4:functions.threeDigitsCode();
                break;
           // default:
        }
    }


}
