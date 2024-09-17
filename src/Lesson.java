public class Lesson {
    public static void main(String[] args) {
        String phone = "+7960-415 75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = "7" + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Phone number is too long!");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Phone number is too short!");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }


    }
}