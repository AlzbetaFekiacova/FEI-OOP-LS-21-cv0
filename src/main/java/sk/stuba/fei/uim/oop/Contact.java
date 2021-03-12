package sk.stuba.fei.uim.oop;

public class Contact {
    String firstName;
    String surname;

    Contact[] friends;

    public Contact(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public Contact(String fullname) {
        var parts = fullname.split(" ");
        firstName = parts[0];
        surname = parts[1];

    }
    public static Contact parseFromFullName(String fullName){
        return new Contact(fullName);
    }

    public void setFriends(Contact ... friends){
        this.friends = friends;
    }
}
