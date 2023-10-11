import entities.Order;
import entities.Product;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random randomNumber = new Random();


        Product product1 = new Product(randomNumber.nextInt(0, 100), "Shakespeare", "Books",
                randomNumber.nextInt(50, 200));
        Product product2 = new Product(randomNumber.nextInt(0, 100), "Long Island", "Baby",
                randomNumber.nextInt(50, 200));
        Product product3 = new Product(randomNumber.nextInt(0, 100), "Jaws", "Books",
                randomNumber.nextInt(50, 200));
        Product product4 = new Product(randomNumber.nextInt(0, 100), "Kids", "Books",
                randomNumber.nextInt(50, 200));
        Product product5 = new Product(randomNumber.nextInt(0, 100), "Parent", "Baby",
                randomNumber.nextInt(50, 200));
        Product product6 = new Product(randomNumber.nextInt(0, 100), "Hormones", "Books",
                randomNumber.nextInt(50, 200));
        Product product7 = new Product(randomNumber.nextInt(0, 100), "Christian", "Books",
                randomNumber.nextInt(50, 200));
        Product product8 = new Product(randomNumber.nextInt(0, 100), "Tech", "Babies",
                randomNumber.nextInt(50, 200));
        Product product9 = new Product(randomNumber.nextInt(0, 100), "AI", "Books",
                randomNumber.nextInt(50, 200));
        Product product10 = new Product(randomNumber.nextInt(0, 100), "Job", "Books",
                randomNumber.nextInt(50, 200));

        Product[] productsArr = {product1, product2, product3, product4, product5, product6,
                product7, product8, product9, product10};

        List<Product> eachProduct = new ArrayList<>(Arrays.asList(productsArr));

        //System.out.println(eachProduct);





    /*Order order = new Order(randomNumber.nextInt(0, 20), "Babies", LocalDate.now(),
            LocalDate.of(2023, 11, 1), );
*/
    }


}
