package modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ConexaoHTTP {
	private static  String str = "";
	
	public static void main(String[] args) {
		try {	
			URL url = new URL("http://www.google.com");
			
			BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while ((str = input.readLine()) != null) {
				System.out.println(str);
			}
			input.close();
 
		} catch (Exception e) {
 
			e.printStackTrace();
		}
	}

}
