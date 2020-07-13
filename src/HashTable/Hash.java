package HashTable;

import Main.Product;
import Main.ProductList;

public class Hash {

    ProductList[] productHash = new ProductList[300];
    public Product product = new Product();

    public int generateHashId(int id) {
        System.out.println("Hash: " + id % 300);
        return id % 300;
    }

    public void addHashTable(int hashId, Product product) {
        if (productHash[hashId] == null) {
            productHash[hashId] = new ProductList();
            productHash[hashId].addProduct(product);
        } else {
            productHash[hashId].addProduct(product);
        }
    }

    public Product getProduct(int hashId, String code) {
        Product aux = productHash[hashId].initiation;
        while (aux != null) {
            if (aux.getCode().equals(code)) {
                return aux;
            }
            aux = aux.next;
        }
        return null;
    }
}
