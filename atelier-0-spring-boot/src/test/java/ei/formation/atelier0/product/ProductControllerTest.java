package ei.formation.atelier0.product;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;

import ei.formation.atelier0.Atelier0Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Atelier0Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class ProductControllerTest {
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testFindAll() {
		System.out.println(
			"size : " + restTemplate.exchange("/product", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Product>>() {
				}).getBody().size());
	}
}
