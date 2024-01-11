

import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class Main {

    public static void main(String[] args) {

        Shirt shirt=new Shirt(10.99,"RED", "NIKE", Size.SMALL);
        shirt.fold();
        

        Pants pants = new Pants(49.99,"BLACK","LEVI's",32,32);
        pants.fold();


        productStore(shirt);
        productStore(pants);

        System.out.println(shirt);

    }

    public static void productStore(Product product){
        System.out.println("\nThank you for purchasing the "+product.getBrand()+". "+product.getClass().getSimpleName().toLowerCase()+" your total comes to : "+product.getPrice());
        product.wear();
    }


}
