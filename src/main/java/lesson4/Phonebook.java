package lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    HashMap<String, ArrayList<String>> phonebook = new HashMap<>();
    ArrayList<String> phoneNumbers;

    public void add(String surname, String phoneNumber) {
        if (phonebook.containsKey(surname)) {
            phoneNumbers = phonebook.get(surname);
        } else {
            phoneNumbers = new ArrayList<>();
        }
        phoneNumbers.add(phoneNumber);
        phonebook.put(surname, phoneNumbers);
    }

    public String get(String surname) {
        return surname + "- " + " " + phonebook.get(surname);
    }
}
