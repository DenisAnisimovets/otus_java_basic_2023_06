package homework10;

public class App {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Mike", "9111111111");
        pb.add("Mike", "9111111111");
        pb.add("Mike", "9222222222");
        pb.add("Helen", "9333333333");

        System.out.println(pb);
        System.out.println(pb.find("Mike"));
        System.out.println(pb.find("Kalvin"));
        System.out.println(pb.containsPhoneNumber("9111111111"));
        System.out.println(pb.containsPhoneNumber("9000000000"));
    }
}
