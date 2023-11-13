import java.net.*;
public class ParsingURL
{
public static void main(String arg[]) throws Exception
{
URL obj=new URL(arg[0]);
System.out.println("Protocol "+obj.getProtocol());
System.out.println("Authority"+obj.getAuthority());
System.out.println("host"+obj.getHost());
System.out.println("Port"+obj.getPort());
System.out.println("Default port"+obj.getDefaultPort());
System.out.println("Path"+obj.getPath());
System.out.println("query"+obj.getQuery());
System.out.println("File"+obj.getFile());
System.out.println("Ref"+obj.getRef());
}
}
