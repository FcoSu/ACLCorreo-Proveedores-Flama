package com.everis.latam.ACLCorreoProveedoresFlama.Service;

import org.springframework.stereotype.Service;

import com.everis.latam.ACLCorreoProveedoresFlama.Entity.Request;

@Service
public interface EmailService {
	
    void sendSimpleMessage(String to, String subject, Request req);
  
}
