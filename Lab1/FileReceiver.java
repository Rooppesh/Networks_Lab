import java.net.*;
import java.io.File;
import java.util.Scanner;  
public class FileReceiver{  
public static void main(String[] args) throws Exception {  
DatagramSocket ds = new DatagramSocket(3000);  
byte[] buf = new byte[1024];  
DatagramPacket dp = new DatagramPacket(buf, 1024);  
ds.receive(dp);  
String str = new String(dp.getData(), 0, dp.getLength());  

   File file =
      new File(str);
    Scanner sc = new Scanner(file);
 
    while (sc.hasNextLine())
      System.out.println(sc.nextLine());  
  
ds.close();  
}  
}  
