public class User {
    private static final int MAX_NO_FRIENDS = 1000;
    private static final int MAX_NO_PAGES = 10000;

    private String userName;
    private String password;
    private String fullName;
    private int noFriends;
    private User[] listOfFriends =  new User[MAX_NO_FRIENDS];
    private int noLikedPages;
    private Page[] likedPages = new Page[MAX_NO_PAGES];
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
        return noFriends;
    }

    public int getNoLikedPages() {
        return noLikedPages;
    }

    public String getStatus() {
        return status;
    }

    public void displayFriends() {
        for (int i = 0; i < noFriends; i++) {
            System.out.print(listOfFriends[i].getFullName() + "  ");
        }
        System.out.println();
    }

    public void displayLikedPages() {
        for (int i = 0; i < noLikedPages; i++) {
            System.out.print(likedPages[i].getName() + "  ");
        }
        System.out.println();
    }

    public void addFriend(User newFriend) {
        listOfFriends[noFriends] = newFriend;
        noFriends += 1;
    }

    public void likePage(Page newPage) {
        likedPages[noLikedPages] = newPage;
        noLikedPages += 1;
    }

    public void findSingleFriends() {
        for (int i = 0; i < noFriends; i++) {
            if (listOfFriends[i].getStatus().equals("single")) {
                System.out.print(listOfFriends[i].getFullName() + "  ");
            }
        }
    }

    public void addAdministrators() {
        for (int i = 0; i < noLikedPages; i++) {
            addFriend(likedPages[i].getAdministrator());
        }
    }

    public void deletePages() {
        for (int i = 0; i < noLikedPages; i++) {
            if ((likedPages[i].getDomainOfActivity().equals("politics")) ||
                    (likedPages[i].getDomainOfActivity().equals("economy"))) {
                if (noLikedPages - 1 - i >= 0)
                    System.arraycopy(likedPages, i + 1, likedPages, i, noLikedPages - 1 - i);

                    i -= 1;
                    noLikedPages -= 1;
                }
            }
    }
}
