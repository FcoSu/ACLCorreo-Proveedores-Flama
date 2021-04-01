package com.everis.latam.ACLCorreoProveedoresFlama.Service.Implement;


import org.springframework.stereotype.Service;

import com.everis.latam.ACLCorreoProveedoresFlama.Entity.Request;
import com.everis.latam.ACLCorreoProveedoresFlama.Entity.Response;
import com.everis.latam.ACLCorreoProveedoresFlama.Service.EmailService;

@Service
public class EmailServiceImplement implements EmailService{
	
	
	@Override
	public void sendSimpleMessage(String to, String subject, Request req) {
		
	}

}
