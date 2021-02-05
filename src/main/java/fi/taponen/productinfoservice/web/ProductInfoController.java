package fi.taponen.productinfoservice.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fi.taponen.productinfoservice.domain.Product;

@RestController
@RequestMapping("/products")
public class ProductInfoController {
	
	@RequestMapping("/{productId}")
	public Product getProductInfo(@PathVariable("productId") String productId) {
		return new Product(productId, "Test name");
	}

}
