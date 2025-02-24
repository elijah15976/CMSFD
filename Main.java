//Java Libraries
import java.io.File;
import com.sun.net.httpserver.*;
import java.net.InetSocketAddress;

//Error Libraries
import java.io.IOException;


//Arg[0] = Port number
public class Main{
  private static Logger lg = new Logger();

  public static void main(String[] args) throws IOException{
    try{
      init();
    }
    catch(IOException e){
      lg.dispMessage(e.getMessage(), "warn");
      e.printStackTrace();
      return;
    }

    int port = Integer.valueOf(args[0]);
    HttpServer server = HttpServer.create(new InetSocketAddress(port),0);
    lg.dispMessage("System Online", "info");

    
    server.start();
    lg.dispMessage("Server is listening on port " + port, "info");
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