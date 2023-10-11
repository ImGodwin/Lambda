import entities.Order;
import entities.Product;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random randomNumber = new Random();


        Product product = new Product(randomNumber.nextInt(0, 100), "Michael", "Books",
                randomNumber.nextInt(50, 150));

        List<Product> eachProduct = new ArrayList<>();



    /*Order order = new Order(randomNumber.nextInt(0, 20), "Babies", LocalDate.now(),
            LocalDate.of(2023, 11, 1), );
*/
    }


}
