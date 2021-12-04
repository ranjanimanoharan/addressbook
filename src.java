import java.io.Serializable;
import java.util.Comparator;

public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String primaryPhoneNumber;

    public Contact(String name, String primaryPhoneNumber) {
        this.name = name;
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public String toString() {
        return name + ", " + primaryPhoneNumber;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Contact) {
            Contact contact = (Contact) obj;
            return (name.equals(contact.getName()) && primaryPhoneNumber
                    .equals(contact.getPrimaryPhoneNumber()));
        }

        return false;
    }

    public int hashCode() {
        return (name.length() + primaryPhoneNumber.length());
    }
}

class ContactNameComparator implements Comparator<Contact> {
    public int compare(Contact contact1, Contact contact2) {
        return contact1.getName().compareToIgnoreCase(contact2.getName());
    }
}
