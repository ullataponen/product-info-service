package fi.taponen.productinfoservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import fi.taponen.productinfoservice.domain.Product;
import fi.taponen.productinfoservice.domain.ProductSummary;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/products")
public class ProductInfoController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{productId}")
	public Product getProductInfo(@PathVariable("productId") long productId) {
		ProductSummary productSummary = restTemplate.getForObject("https://arcane-reef-64898.herokuapp.com/api/products/" + productId, ProductSummary.class);
	
		return new Product(productId, productSummary.getName(), productSummary.getManufacturer());
	}

}
