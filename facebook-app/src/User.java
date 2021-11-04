import java.util.ArrayList;

public class User {
    private String userName;
    private String password;
    private String fullName;
    private ArrayList<User> listOfFriends = new ArrayList<>();
    private ArrayList<Page> likedPages = new ArrayList<>();
    private String status;

    public User(String userName, String password, String fullName, String status) {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getNoFriends() {
        return listOfFriends.size();
    }

    public int getNoLikedPages() {
        return likedPages.size();
    }

    public String getStatus() {
        return status;
    }

    public void displayFriends() {
        for (User friend :
                listOfFriends) {
            System.out.print(friend.getFullName() + "  ");
        }

        System.out.println();
    }

    public void displayLikedPages() {
        for (Page page :
                likedPages) {
            System.out.print(page.getName() + "  ");
        }

        System.out.println();
    }

    public void addFriend(User newFriend) {
        listOfFriends.add(newFriend);
    }

    public void likePage(Page newPage) {
        likedPages.add(newPage);
    }

    public void findSingleFriends() {
        for (User friend :
                listOfFriends) {
            if (friend.getStatus().equals("single"))
                System.out.print(friend.getFullName() + "  ");
        }
    }

    public void addAdministrators() {
        for (Page page :
                likedPages) {
            addFriend(page.getAdministrator());
        }
    }

    public void deletePages() {
        for (int i = 0; i < likedPages.size(); i++) {
            if ((likedPages.get(i).getDomainOfActivity().equals("politics")) ||
                    (likedPages.get(i).getDomainOfActivity().equals("economy"))) {
                likedPages.remove(i);
                i -= 1;
            }
        }
    }
}
