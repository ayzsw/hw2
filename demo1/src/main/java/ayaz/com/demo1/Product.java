package ayaz.com.demo1;

import java.time.LocalDate;


public record Product(
        int id,
        String name,
        double price,
        int quantity,
        double totalPrice,
        LocalDate date
) {

}