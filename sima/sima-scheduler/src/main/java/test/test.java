package test;

import mx.com.gentera.seguros.sima.scheduler.model.FileName;
import org.springframework.core.io.FileSystemResource;

public class test {
	
  public static void main(String... args) {
    String aux = "EMIASEG_01_20190715_133341.txt";
    FileName file = new FileName(aux.split("_"), "EMIASEG");
    String fi = "/filesper/java/PE/Insurance/inFinanciera//EMIASEG_01_20190509_102900.txt";
    FileSystemResource fileSystemResource = new FileSystemResource(fi);
    System.out.println(fileSystemResource.getFilename());
  }
}
