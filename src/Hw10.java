import java.util.Scanner;

public class Hw10 {

    public static String scanner() {
        Scanner input = new Scanner(System.in);
        //System.out.println(text);
        return input.nextLine();
    }

    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        System.out.println("Input your full name:");
        String fullNameInput = scanner();
        //String fullNameInput = "Ivanov Ivan Ivanovich";

        //Splitting the input string by space to get first name, last name and middle name.
        String[] fullNameSplitting = fullNameInput.split(" ");
        String lastName = fullNameSplitting[0];
        String firstName = fullNameSplitting[1];
        String middleName = fullNameSplitting[2];
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Отчество: " + middleName);
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println();

        //Task 2
        System.out.println("Task 2");

        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName);

        System.out.println();

        //Task 3
        System.out.println("Task 3");

        if (fullNameInput.contains("ё")) {
            fullNameInput = fullName.toLowerCase().replace("ё", "е");
            String[] fullNameSplitting1 = fullNameInput.split(" ");
            String lastName1 = fullNameSplitting1[0];
            lastName1 = lastName1.substring(0, 1).toUpperCase() + lastName1.substring(1);
            String firstName1 = fullNameSplitting1[1];
            firstName1 = firstName1.substring(0, 1).toUpperCase() + firstName1.substring(1);
            String middleName1 = fullNameSplitting1[2];
            middleName1 = middleName1.substring(0, 1).toUpperCase() + middleName1.substring(1);
            String fullName1 = lastName1 + " " + firstName1 + " " + middleName1;
            System.out.println("Данные Ф. И. О. сотрудника - " + fullName1);
        } else {
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
            middleName = middleName.substring(0, 1).toUpperCase() + middleName.substring(1);
            fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("Данные Ф. И. О. сотрудника - " + fullName);
        }
    }
}
