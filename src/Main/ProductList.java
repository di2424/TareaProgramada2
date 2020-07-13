package Main;

public class ProductList {
public Product product = new Product();
    public Product initiation = null;

    public boolean isEmpty(){
        return initiation == null;
    }

    public void addProduct (Product newProduct){
        if (initiation == null){
            initiation = newProduct;
        }else{
            Product temp = initiation;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newProduct;
        }
    }
    public void printList(){
        Product temp = initiation;
        while (temp != null){
            System.out.println("Producto: " +temp.getCode()  + " " + temp.getName() +" "+ "  " +   temp.getCategory());
            temp = temp.next;
        }
    }


}


