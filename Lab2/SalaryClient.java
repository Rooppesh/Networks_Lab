import java.util.*;
import java.io.*;
import java.net.*;  
public class SalaryClient{  
public static void main(String[] args) throws Exception {  
DatagramSocket ds = new DatagramSocket();  
Scanner var=new Scanner(System.in);
String str=var.nextLine();
InetAddress ip = InetAddress.getByName("127.0.0.1");  
DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);  
ds.send(dp);  
ds.close();  
}  
}  
