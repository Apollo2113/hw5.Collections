package phonebook;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();


        phoneBook.add(new Record("Tom", "0995387253"));
        phoneBook.add(new Record("Ridle", "0551050030"));
        phoneBook.add(new Record("Kolya", "0982035262"));


        Record record = phoneBook.find("Ridle");
        if (record != null) {
            System.out.println("Record found " + record.getName() + ": " + record.getPhone());
        } else {
            System.out.println("Record not found.");
        }
    }
}
