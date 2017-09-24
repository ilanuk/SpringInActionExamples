package sia.knights;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import sia.knights.config.*;

public class KnightMainConfigAnnotation {

  public static void main(String[] args) throws Exception {
    //ClassPathXmlApplicationContext context = 
    //    new ClassPathXmlApplicationContext(
    //        "META-INF/spring/knight.xml");
	  AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(sia.knights.config.KnightConfig.class);
    Knight knight = context.getBean(Knight.class);
    knight.embarkOnQuest();
    context.close();
  }

}