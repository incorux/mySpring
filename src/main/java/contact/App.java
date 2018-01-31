package contact;

import contact.classes.entities.Contact;
import contact.classes.services.ContactService;
import contact.config.Beans;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] Args){
        try(AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Beans.class)){
/*            ContactService contactService = annotationConfigApplicationContext.getBean(ContactService.class);
            Contact contact = new Contact();
            contact.setFirstName("Jan");
            contact.setLastName("Kowalski");
            contactService.updateContact(contact);
            System.out.println(contact.getId());*/
        }
    }
}
