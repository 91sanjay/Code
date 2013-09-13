
import java.io.*;
import java.io.InputStreamReader;
import java.net.*;
import java.io.IOException;
public class a {
public static void main(String args[])throws IOException
{
Socket clientsoc= null;

try
{
clientsoc=new Socket("cs5700f12.ccs.neu.edu",27993);
}catch(UnknownHostException e){
System.out.println(e);
try{
Thread.sleep(10000);
}
catch(Exception ex)
{
System.out.println("exception");
}
System.out.println("done sleeping");
}
BufferedOutputStream b=new BufferedOutputStream(clientsoc.getOutputStream());
OutputStreamWriter osw= new OutputStreamWriter(b,"US-ASCII");
String str= "cs5700fall2013 HELLO 001912881\n";
osw.write(str);
BufferedReader input= new BufferedReader(new InputStreamReader(clientsoc.getInputStream()));
System.out.println(input.readLine());
clientsoc.close();
}
}

         
