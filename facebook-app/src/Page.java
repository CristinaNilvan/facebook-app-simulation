public class Page {
    private String name;
    private String domainOfActivity;
    private String description;
    private User administrator;

    public Page(String name, String domainOfActivity, String description, User administrator) {
        this.name = name;
        this.domainOfActivity = domainOfActivity;
        this.description = description;
        this.administrator = administrator;
    }

    public String getName() {
        return name;
    }

    public String getDomainOfActivity() {
        return domainOfActivity;
    }

    public String getDescription() {
        return description;
    }

    public User getAdministrator() {
        return administrator;
    }
}
