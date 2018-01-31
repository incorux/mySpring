package contact.classes.services;

import contact.classes.entities.Contact;

// Alternatywnie do Beans.java: @Service
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

    public void deleteContactById(long id){
        contactRepository.delete(id);
    }
}
