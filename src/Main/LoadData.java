package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoadData {
    private Scanner input = new Scanner(System.in);
    public boolean loadData = false;

    public void loadProducts(ProductList list) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("C:\\Users\\50672\\TareaProgramada2\\src\\Main\\DataFinal.csv"));

        int counter = 0;
        String currentLine = "";

        while (reader.hasNextLine()) {
            currentLine = reader.nextLine();
            if (counter != 0) {
                String[] data = currentLine.split(",");
                Product newProduct = new Product();
                newProduct.setCode(data[0]);
                newProduct.setName(data[3]);
                newProduct.setCategory(data[4]);
                list.addProduct(newProduct);
            }
            counter++;
        }
        //list.printList();
        reader.close();
        loadData = true;
        if (loadData = true) {
            System.out.println("los datos han sido cargados");
        } else {
            System.out.println("hay un error en la carga de datos");
        }
    }
}



