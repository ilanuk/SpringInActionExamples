package sia.knights;

import org.springframework.context.support.
                   FileSystemXmlApplicationContext;

public class KnightMainFileSystemXml {

  public static void main(String[] args) throws Exception {
    FileSystemXmlApplicationContext context = 
        new FileSystemXmlApplicationContext(
            "C:\\Users\\NidhiDeepa\\Documents\\GitHub\\SpringInActionExamples\\Chapter_01\\knight\\src\\main\\resources\\META-INF\\spring\\knight.xml");
    Knight knight = context.getBean(Knight.class);
    knight.embarkOnQuest();
    context.close();
  }

}