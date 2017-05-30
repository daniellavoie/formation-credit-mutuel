package ei.formation.atelier0.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryMemImpl implements ProductRepository {
	private Map<String, Product> products = new HashMap<>();

	@Override
	public void delete(String name) {
		products.remove(name);
	}

	@Override
	public List<Product> findAll() {
		return new ArrayList<>(products.values());
	}

	@Override
	public Product save(Product product) {
		products.put(product.getName(), product);

		return product;
	}

}
