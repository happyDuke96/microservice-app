package uz.abbos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import uz.abbos.model.Product;
import uz.abbos.repository.ProductRepository;

import java.math.BigDecimal;

@SpringBootApplication
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }


    @Bean
    public CommandLineRunner loadData(ProductRepository productRepository) {
        return args -> {
            Product firstData = new Product();
            firstData.setName("iPhone 13");
            firstData.setDescription("some text");
            firstData.setPrice(BigDecimal.valueOf(1200.0));
            firstData.setSkuCode("phone_black");
            firstData.setIsInStock(Boolean.FALSE);
            firstData.setQuantity(0);

            Product secondData = new Product();
            firstData.setName("iPhone 14");
            firstData.setDescription("some text");
            firstData.setPrice(BigDecimal.valueOf(1500.0));
            firstData.setSkuCode("phone_red");
            firstData.setIsInStock(Boolean.TRUE);
            firstData.setQuantity(120);


            productRepository.save(firstData);
            productRepository.save(secondData);
        };
    }

}
