package contact.classes.services;

import contact.classes.entities.Contact;

public class ContactService {
    private ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact createContact(){
        Contact contact = new Contact();
        contact = contactRepository.save(contact);
        return contact;
    }

    public void updateContact(Contact contact){
        contactRepository.saveAndFlush(contact);
    }
}
