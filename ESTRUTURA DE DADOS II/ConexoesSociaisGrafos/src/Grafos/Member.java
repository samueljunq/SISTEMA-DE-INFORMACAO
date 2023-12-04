package Grafos;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author samueljunq
 */
public class Member {
    private String name;
    private String photo;
    private List<Member> contacts;

    public Member(String name, String photo) {
        this.name = name;
        this.photo = photo;
        this.contacts = new ArrayList<>();
    }

    // Getters e Setters

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    public List<Member> getContacts() {
        return contacts;
    }

    public void addConnection(Member otherMember) {
        contacts.add(otherMember);
        otherMember.getContacts().add(this);
    }

    public void removeConnection(Member otherMember) {
        contacts.remove(otherMember);
        otherMember.getContacts().remove(this);
    }
}
