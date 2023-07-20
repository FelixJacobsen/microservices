package feljac.tech.inventoryservice;

import feljac.tech.inventoryservice.model.Inventory;
import feljac.tech.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventoryLaptop = new Inventory();
			inventoryLaptop.setSkuCode("Laptop");
			inventoryLaptop.setQuantity(100);

			Inventory inventoryMobile = new Inventory();
			inventoryMobile.setSkuCode("Iphone X");
			inventoryMobile.setQuantity(0);

			inventoryRepository.save(inventoryLaptop);
			inventoryRepository.save(inventoryMobile);
		};
	}

}
