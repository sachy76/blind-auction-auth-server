package com.myproject.blind_auction_auth_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BlindAuctionAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlindAuctionAuthServerApplication.class, args);
		//var enc = new BCryptPasswordEncoder();
		//System.out.println(">>>>>>"+enc.encode("secret1"));
		//System.out.println(">>>>>>"+enc.encode("secret2"));
		//System.out.println(">>>>>>"+enc.encode("secret3"));

	}
}
