import java.net.*;
import java.io.File;
import java.util.Scanner;  
import java.lang.*;
import java.io.*;
import java.util.*;
public class StringServer{  
public static void main(String[] args) throws Exception {  
DatagramSocket ds = new DatagramSocket(3000);  
byte[] buf = new byte[1024];  
DatagramPacket dp = new DatagramPacket(buf, 1024);  
ds.receive(dp);  
String str = new String(dp.getData(), 0, dp.getLength());  
StringBuilder input1 = new StringBuilder();
input1.append(str);
input1 = input1.reverse();
System.out.println(input1);
ds.close();  
}  
}  
