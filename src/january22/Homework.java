package january22;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) throws Exception {

        // hw 2
//        int[] arr1 = {1, 2, 3, 5, 9, 0, 7};
//        int[] arr2 = {3, 4, 0, 8, 9, 1, 6};
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                try {
//                    int res = arr1[i] / arr2[j];
//                    System.out.println(arr1[i] + " " + arr2[j] + " " + res);
//                } catch (ArithmeticException e) {
//                    System.out.println(e.getMessage());
//                    System.out.println(arr1[i] + " " + arr2[j]);
//                }
//
//            }
//        }

        // hw 3
//        try {
//            FileWriter fw = new FileWriter(new File("text.txt"));
//            fw.write('5');
//            System.out.println("...");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();
        if (name.length() < 2) {
            throw new IncorrectNameException("Name is too short");
        }
        System.out.println("Enter the lastname: ");
        String lastname = sc.next();
        if (lastname.length() < 3) {
            throw new IncorrectNameException("Lastname is too short");
        }

        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(year < 1 || year > 2026) {
            throw new IncorrectYearException("Year is in the future");
        }

        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        if(month < 1 || month > 12) {
            throw new IncorrectMonthException("Month doesn't exist");
        }

        System.out.println("Enter the day: ");
        int day = sc.nextInt();
        if(day < 1 || day > 31) {
            throw new IncorrectDayException("Day doesn't exist");
        }

        System.out.println("Enter the username: ");
        String username = sc.next();
        if (username.length() < 4) {
            throw new IncorrectUsernameException("Username is too short");
        }

        System.out.println("Enter the password: ");
        String password = sc.next();
        if (password.length() < 8) {
            throw new IncorrectPasswordException("Password is too short");
        }

        if(password.length() > 15) {
            throw new IncorrectPasswordException("Password is too long");
        }

        System.out.println("Enter the id: ");
        String id = sc.next();
        if(id.length() != 11 || id.contains("[0-9]+")) {
            throw new IncorrectIdException("Id doesn't exist");
        }

        User user = new User(name, lastname, id, day, month, year, password, username);
        System.out.println(user.toString());

    }

}
