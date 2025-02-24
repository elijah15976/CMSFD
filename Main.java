//Java Libraries
import java.io.File;

//Error Libraries
import java.io.IOException;

public class Main{
  private static Logger lg = new Logger();

  public static void main(String[] args) {
    try{
      init();
    }
    catch(IOException e){
      lg.dispMessage(e.getMessage(), "warn");
      e.printStackTrace();
      return;
    }
  }

  public static void init() throws IOException{
    File logFolder = new File("./log");
    File templateFolder = new File("./template");

    if(!logFolder.exists()){
      logFolder.mkdirs();
    }
    if(!templateFolder.exists()){
      templateFolder.mkdir();
    }

    new File("./log/log.txt").createNewFile();
  }
}