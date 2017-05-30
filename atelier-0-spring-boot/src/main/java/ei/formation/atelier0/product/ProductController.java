package ei.formation.atelier0.product;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping(params = { "name", "delete" })
	public void delete(String name) {
		productService.delete(name);
	}

	@GetMapping
	public List<Product> findAll(Pageable pageable) {
		return productService.findAll(pageable).getContent();
	}

	@GetMapping(params = "name")
	@ResponseStatus(HttpStatus.CREATED)
	public Product createNew(@RequestParam String name) {
		return productService.save(new Product(name));
	}
}
