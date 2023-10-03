package homework10;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> records;

    public PhoneBook() {
        this.records = new HashMap<>();
    }

    @Override
    public String toString() {
        return "PhoneBook{" + records + "}";
    }

    public Map<String, Set<String>> getRecords() {
        return records;
    }

    public void add(String name, String phone) {
        boolean recordExist = records.containsKey(name);

        if (recordExist) {
            records.get(name).add(phone);
        } else {
            Set<String> phones = new HashSet<>();
            phones.add(phone);
            records.put(name, phones);
        }
    }

    public Set<String> find(String name) {
        return records.get(name);
    }

    public boolean containsPhoneNumber(String phone) {
        Collection<Set<String>> values = records.values();

        for (Set<String> set : values) {
            if (set.contains(phone)) {
                return true;
            }
        }

        return false;
    }
}