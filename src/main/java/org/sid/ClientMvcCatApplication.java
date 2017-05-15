package org.sid;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientMvcCatApplication  implements CommandLineRunner {


	@Autowired
	private ProduitRepository produitRepository;

	public static void main(String[] args) {
		SpringApplication.run(ClientMvcCatApplication.class, args);




	}

	@Override
	public void run(String... strings) throws Exception {

		produitRepository.save(new Produit("HP 678",900,6));
		produitRepository.save(new Produit("MSI GL72",1100,1));
		produitRepository.save(new Produit("Xerox",500,6));
	}
}
