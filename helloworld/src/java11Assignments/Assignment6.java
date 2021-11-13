package java11Assignments;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uri="https://httpbin.org/get?uname=karthik&pass=12345";
		HttpRequest req=HttpRequest.newBuilder().uri(URI.create(uri)).GET()
				.build();
		
		HttpClient client=HttpClient.newBuilder().build();
		try
		{
		HttpResponse<String> s1=client.send(req,BodyHandlers.ofString());
		System.out.println(s1.headers().toString());
		System.out.println(s1.statusCode());
		System.out.println(s1.body());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
