package ei.formation.atelier0.product;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ei.formation.atelier0.Atelier0Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Atelier0Application.class)
public class ProductServiceImplTest {
	@Autowired
	private ProductService service;

	@Test
	public void testProductService() {
		Product product = new Product("Product 1");

		Assert.assertTrue(service.findAll().isEmpty());
		Assert.assertNotNull(service.save(product));
		Assert.assertEquals(1, service.findAll().size());
	}
}
