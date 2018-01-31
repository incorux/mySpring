package contact.config;

import contact.classes.services.ContactRepository;
import contact.classes.services.ContactService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class Beans {
    @Bean
    public ContactService contactService(ContactRepository contactRepository){
        return new ContactService(contactRepository);
    }
}
