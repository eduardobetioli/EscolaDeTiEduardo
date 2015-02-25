package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EscolaDeTiAula01Application.class)
@WebAppConfiguration
public class EscolaDeTiAula01ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
