package Grafos;

import java.util.List;

public class SocialNetworkController {
     private SocialNetwork socialNetwork;

    public SocialNetworkController() {
        this.socialNetwork = new SocialNetwork();
    }

    public void createMember(String name, String photo) {
        socialNetwork.addMember(name, photo);
    }

    public void createConnection(String member1, String member2) {
        socialNetwork.addConnection(member1, member2);
    }

    public void removeConnection(String member1, String member2) {
        socialNetwork.removeConnection(member1, member2);
    }

    public List<Member> getContacts(String member) {
        return socialNetwork.getContacts(member);
    }

    public int getReach(String member) {
        return socialNetwork.getReach(member);
    }

    public void saveToCSV(String filename) {
        socialNetwork.saveToCSV(filename);
    }
    public void removeMember(String name) {
        Member removedMember = socialNetwork.removeMember(name);
        if (removedMember != null) {
            // Remover referências do membro removido nas conexões dos outros membros
            for (Member member : socialNetwork.getMembers().values()) {
                member.getContacts().remove(removedMember);
            }
        }
    }
}
