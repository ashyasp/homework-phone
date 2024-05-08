package backfrombreak;

public class PhoneDirectory {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();


        phoneBook.add("Alice", "263-156-7590");
        phoneBook.add("Justice", "484-456-7950");
        phoneBook.add("Allison", "483-456-6660");
        phoneBook.add("Ken", "267-456-7810");


        phoneBook.addAll("Bob", "234-567-8901", "345-678-9012");

        System.out.println("Alice's numbers: " + phoneBook.lookup("Alice"));
        System.out.println("Bob's numbers: " + phoneBook.lookup("Bob"));

        System.out.println("Who owns 234-567-8901? " + phoneBook.reverseLookUp("234-567-8901"));

        System.out.println("Does Alice exist in the phonebook? " + phoneBook.hasEntry("Alice"));

        phoneBook.remove("Alice");
        System.out.println("Does Alice exist in the phonebook after removal? " + phoneBook.hasEntry("Alice"));


        System.out.println("All contacts: " + phoneBook.getAllContactNames());


        System.out.println(phoneBook);
    }
}
