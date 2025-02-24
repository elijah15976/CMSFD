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
      lg.dispMessage(e.getStackTrace(), "warn");
      return;
    }
  }

  public static void init() throws IOException{
    File logStuff = new File("./log/log.txt");
    File templateFolder = new File("./template");

    if(!logStuff.exists()){
      logStuff.mkdir();
    }
    if(!templateFolder.exists()){
      templateFolder.mkdir();
    }

    logStuff.createNewFile();
  }
}