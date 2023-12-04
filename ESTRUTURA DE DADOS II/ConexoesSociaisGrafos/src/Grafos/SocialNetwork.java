package Grafos;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocialNetwork {
    private Map<String, Member> members;

    public SocialNetwork() {
        this.members = new HashMap<>();
    }

    public void addMember(String name, String photo) {
        Member newMember = new Member(name, photo);
        members.put(name, newMember);
    }

    public void addConnection(String member1, String member2) {
        Member m1 = members.get(member1);
        Member m2 = members.get(member2);

        if (m1 != null && m2 != null) {
            m1.addConnection(m2);
        }
    }

    public void removeConnection(String member1, String member2) {
        Member m1 = members.get(member1);
        Member m2 = members.get(member2);

        if (m1 != null && m2 != null) {
            m1.removeConnection(m2);
        }
    }

    public List<Member> getContacts(String member) {
        Member m = members.get(member);
        return (m != null) ? m.getContacts() : null;
    }

    public int getReach(String member) {
        Member m = members.get(member);
        return (m != null) ? calculateReach(m, new ArrayList<>()) : 0;
    }

    private int calculateReach(Member member, List<Member> visited) {
        int reach = 1;
        visited.add(member);

        for (Member contact : member.getContacts()) {
            if (!visited.contains(contact)) {
                reach += calculateReach(contact, visited);
            }
        }

        return reach;
    }
    public void saveToCSV(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.append("Name,Photo\n");

            for (Member member : members.values()) {
                writer.append(member.getName())
                        .append(",")
                        .append(member.getPhoto())
                        .append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Map<String, Member> getMembers() {
        return members;
    }

    public Member removeMember(String name) {
        return members.remove(name);
    }
}
