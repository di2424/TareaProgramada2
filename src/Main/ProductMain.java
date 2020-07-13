package Main;

import java.io.FileNotFoundException;

public class ProductMain {


    public static void main(String args[]) throws FileNotFoundException {
        Menu menu = new Menu();
        LoadData data = new LoadData();
        int option = 0;


        do {
            menu.showMenu();
        } while (option != 5);


    }


}

