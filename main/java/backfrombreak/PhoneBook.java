package backfrombreak;

import java.util.List;
import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneRecord;

    public PhoneBook() {
        this(new HashMap<>());
    }

    public PhoneBook(Map<String, List<String>> phoneRecord) {
        this.phoneRecord = phoneRecord;
    }

    // Add a number to the phonebook for a given name
    public void add(String name, String phoneNumber) {
        List<String> numbers = phoneRecord.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneRecord.put(name, numbers);
    }

    // Add multiple numbers to the phonebook for a given name
    public void addAll(String name, String... phoneNumbers) {
        List<String> numbers = phoneRecord.getOrDefault(name, new ArrayList<>());
        for (String phoneNumber : phoneNumbers) {
            numbers.add(phoneNumber);
        }
        phoneRecord.put(name, numbers);
    }

    // Remove a person from the phonebook
    public void remove(String name) {
        phoneRecord.remove(name);
    }

    // Check if an entry exists for a given name
    public Boolean hasEntry(String name) {
        return phoneRecord.containsKey(name);
    }

    // Look up phone numbers by a given name
    public List<String> lookup(String name) {
        return phoneRecord.get(name);
    }

    // Reverse lookup to find the name associated with a specific phone number
    public String reverseLookUp(String phoneNumber) {
        for (Map.Entry<String, List<String>> entry : phoneRecord.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // Get a list of all contact names in the phonebook
    public List<String> getAllContactNames() {
        return new ArrayList<>(phoneRecord.keySet());
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneRecord=" + phoneRecord +
                '}';
    }
}
