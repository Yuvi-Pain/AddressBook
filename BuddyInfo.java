public class BuddyInfo {
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Yuvi");
        System.out.println("Hello " + buddy.getName());

    }
    public String getName() {
        return name;
    }

    public BuddyInfo(String name) {
        this.name = name;
    }

    private String name;
}
