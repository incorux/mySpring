package contact.classes.controllers;

import contact.classes.common.UriBuilder;
import contact.classes.entities.Contact;
import contact.classes.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

import static org.springframework.http.ResponseEntity.created;
import static org.springframework.http.ResponseEntity.noContent;

@CrossOrigin
@RequestMapping(value = "contactapi/contacts")
@RestController
public class ContactController {
    private ContactService contactService;
    private UriBuilder uriBuilder = new UriBuilder();

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping(method = RequestMethod.POST, value="createcontact")
    public ResponseEntity createContact() {
        Contact contact = contactService.createContact();
        URI uri = uriBuilder.requestUriWithId(contact.getId());
        return created(uri).build();
    }

    @RequestMapping(method = RequestMethod.POST, value="createcontact/{firstname}/{lastname}")
    public ResponseEntity createContact(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastName) {
        Contact contact = new Contact();
        contact.setFirstName(firstname);
        contact.setLastName(lastName);
        contactService.updateContact(contact);
        URI uri = uriBuilder.requestUriWithId(contact.getId());
        return created(uri).build();
    }

    @RequestMapping(value = "deletecontact/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteAccount(@PathVariable("id") Long id) {
        contactService.deleteContactById(id);
        return noContent().build();
    }
}