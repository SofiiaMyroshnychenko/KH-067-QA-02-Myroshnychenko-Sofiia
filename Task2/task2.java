package Task2;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {

        // Ask  the user for at least 3 favorite colors
        System.out.println("Enter at least three of your favorite colors (separate with commas):");
        Scanner scanner = new Scanner(System.in);

        String inputColors;

        // conditions

        while (true) {
            inputColors = scanner.nextLine();
            if (inputColors.isEmpty()) {
                System.out.println("Enter at least three of your favorite colors (separate with commas):");
            } else {
                String[] colors = inputColors.split(",");
                while (true) {
                    System.out.println("Please select a filter and enter the number \n1 - maximum length\n2 - start with\n3 - end with\n4 - contains\n0 - exit\n");
                    if (scanner.hasNextInt()) {
                        int num = scanner.nextInt();
                        scanner.nextLine();
                        switch (num) {
                            //quantity
                            case 1:
                                System.out.println("How many letters should be in the color?");
                                int quantity = scanner.nextInt();

                                for (String word : colors) {
                                    if (word.length() <= quantity) {
                                        System.out.println("Result: " + word);
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Please enter first letters of colors you want to see:");
                                String firstLetters = scanner.nextLine();
                                for (String word : colors) {
                                    if (word.startsWith(firstLetters)) {
                                        System.out.println("Result: " + word);
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Please enter last letters of colors you want to see:");
                                String lastLetters = scanner.nextLine();
                                for (String word : colors) {
                                    if (word.endsWith(lastLetters)) {
                                        System.out.println("Result: " + word);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Please enter letters which colors should contain:");
                                String containLetters = scanner.nextLine();
                                for (String word : colors) {
                                    if (word.contains(containLetters)) {
                                        System.out.println("Result: " + word);
                                    }
                                }
                                break;
                            case 0:
                                System.out.println("The program is complete. All the best to you!");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Your choice isn't correct. Please try again!");
                                break;
                        }


                    }
                }
            }
        }
    }
}

