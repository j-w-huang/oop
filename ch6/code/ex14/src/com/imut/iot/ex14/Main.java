package com.imut.iot.ex14;

public class Main {

	public static void main(String[] args) {
		for(int i = 0;i < args.length;i++)
			System.out.println(args[0].trim().equals("s"));

		if (args.length == 0 || args[0].trim().equals("s")) {
			Serve sev = new Serve(2019);
			System.out.println("Server is listening in port 2019");
			sev.Listen();
		} else if (args.length == 0 || args[0].trim().equals("c")) {
			Client cl = new Client("localhost", 2019);
			cl.Connect();
		} else {
			System.out.println("Error args...");
		}
	}

}
