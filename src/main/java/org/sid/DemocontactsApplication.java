package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemocontactsApplication implements CommandLineRunner {
    @Autowired
	private ContactRepository contactRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemocontactsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
         contactRepository.save(new Contact("Asma", "MAz", df.parse("07/08/1991"), "asma@gmail.com",58676877, "asma.jpeg"));	
         contactRepository.save(new Contact("Sana", "5ra", df.parse("02/11/1993"), "sana@gmail.com",58676870, "aasma.jpeg"));	
         contactRepository.save(new Contact("nan", "MAz", df.parse("07/08/1991"), "lama@gmail.com",58676877, "assma.jpeg"));	
         contactRepository.save(new Contact("jjjja", "MAz", df.parse("07/08/1991"), "kkkk@gmail.com",58678877, "asdma.jpeg"));	
         contactRepository.findAll().forEach(c->{
        	 System.out.println(c.getNom());
         });
	
	
	}

}
