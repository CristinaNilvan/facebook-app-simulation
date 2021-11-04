public class Main {

    public static void main(String[] args) {
        User user01 = new User("reb.wil", "pass", "Rebecca Wilson", "in a relationship");
        User user02 = new User("jud.kng", "pass", "Judy King", "in a relationship");
        User user03 = new User("barb.lop", "pass", "Barbara Lopez", "married");
        User user04 = new User("geo.pete", "pass", "George Peterson", "single");
        User user05 = new User("ama.green", "pass", "Amanda Green", "married");
        User user06 = new User("fred.ross", "pass", "Fred Ross", "single");

        Page page01 = new Page("Eco-Eco", "economy", "desc", user01);
        Page page02 = new Page("PNL", "politics", "desc", user02);
        Page page03 = new Page("Econ", "economy", "desc", user03);
        Page page04 = new Page("UTCN-AC", "education", "desc", user04);

        user01.addFriend(user05);
        user01.addFriend(user06);

        System.out.println(user01.getFullName() + "' friends : ");
        user01.displayFriends();
        System.out.println();

        user01.likePage(page02);
        user01.likePage(page03);
        user01.likePage(page04);

        System.out.println(user01.getFullName() + "' liked pages : ");
        user01.displayLikedPages();
        System.out.println();

        System.out.println(user01.getFullName() + "' single friends : ");
        user01.findSingleFriends();
        System.out.println();

        System.out.println(user01.getFullName() + "' liked pages after deletion : ");
        user01.deletePages();
        user01.displayLikedPages();
        System.out.println();

        System.out.println(user01.getFullName() + "' friends are now : ");
        user01.addAdministrators();
        user01.displayFriends();
        System.out.println();
    }
}
