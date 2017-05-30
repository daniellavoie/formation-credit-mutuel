package ei.formation.atelier0.product;

import java.util.List;

public interface ProductRepository {
	void delete(String name);
	
	List<Product> findAll();
	
	Product save(Product product);
}
