package nz.ac.auckland.common.stereotypes;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.fest.assertions.Assertions.assertThat;

public class UniversityComponentTest {

  @Test
  public void testInjection() throws Exception {
    ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/uoa/loader.xml");

    Service1 service1 = context.getBean(Service1.class);

    assertThat(service1.getService2()).isNotNull();
  }

}
