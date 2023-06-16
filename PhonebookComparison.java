// Question: Write a java program phonebook manipulation MeraCell mobile services needs to store their customer details in the company portal. The details are customer's first and last name, phone number, and email address. Help the company develop an application to maintain the details of their customer systematically.

// You are provided with a class Contact with the following attributes as private.

// String firstName String lastName

// long phoneNumber String emailld

// A 4 argument constructor and appropriate setters and getters to store and retrieve the details are also provided.

// Create a class PhoneBook with a private attribute

// List<Contact> phoneBook = new ArrayList<Contact>();

// Write the getters and setters.

// Write the following methods in the PhoneBook class.

// public void addContact(Contact contactObj) - This method should add the contact object to the phoneBook list

// public List<Contact> viewAllContacts() - This method should return the list of all contacts available.

// public Contact view ContactGiven Phone(long phoneNumber) - This method should return the contact details which has the phoneNumber given as parameter.
import java.util.ArrayList;
import java.util.List;

class PhonebookComparison {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String emailId;

    public Contact(String firstName, String lastName, long phoneNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}

class PhoneBook {
    private List<Contact> phoneBook = new ArrayList<Contact>();

    public void addContact(Contact contactObj) {
        phoneBook.add(contactObj);
    }

    public List<Contact> viewAllContacts() {
        return phoneBook;
    }

    public Contact viewContactGivenPhone(long phoneNumber) {
        for (Contact contact : phoneBook) {
            if (contact.getPhoneNumber() == phoneNumber) {
                return contact;
            }
        }
        return null;
    }
}
