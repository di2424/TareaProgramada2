package Main;

import HashTable.Hash;

import java.io.FileNotFoundException;

public class ProductFunctions {
    ProductList list = new ProductList();
    LoadData data = new LoadData();
    Hash hash = new Hash();

    public void readList(String text){
        int count = 0;
        if (list.isEmpty()){
            System.out.println("Los datos no han sido cargados");
        }else{
            Product temp = list.initiation;
            while (temp != null){
                if (temp.getName().toLowerCase().contains(text.toLowerCase())){
                    System.out.println("Codigo: " + temp.getCode() + "    " + "Nombre: " + temp.getName() + "   "+
                            "Categoria:" + temp.getCategory() + "En la posicion: " + count);
                    temp = temp.next;
                }else{
                    temp = temp.next;
                }
                count ++;
            }
        }
        System.out.println("Datos encontrados: " + count);
    }

    public void threeDigitsCode(){
        Product temp = list.initiation;
        while(temp != null){
            String code = temp.getCode();
            String digits =  code.substring(29,32);
            int codeValue = Integer.parseInt(digits ,16);
            hash.addHashTable(hash.generateHashId(codeValue), temp);
            temp = temp.next;
            System.out.println(codeValue);

        }

    }
    public void loadDataFunctions() throws FileNotFoundException {
        data.loadProducts(list);
    }


}
