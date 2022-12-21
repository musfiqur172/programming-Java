public class Main {
    public static void main(String[] args) {
//        String role = "admin";
//
//        switch (role) {
//            case "admin":
//                System.out.println("You're an admin");
//                break;
//            case "moderator":
//                System.out.println("You're a moderator");
//                break;
//            default:
//                System.out.println("You're a guest");
//        }

        int role = 1;
        switch (role) {
            case 1:
                System.out.println("You're an admin");
                break;
            case 2:
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're guest");
        }
    }
}