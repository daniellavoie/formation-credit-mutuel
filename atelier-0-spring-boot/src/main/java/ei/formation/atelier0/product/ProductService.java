package ei.formation.atelier0.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
	void delete(String name);
	
	Page<Product> findAll(Pageable pageable);
	
	Product save(Product product);
}
