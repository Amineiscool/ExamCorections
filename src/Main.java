import java.util.Scanner;

public class Main {
    public static void printName(String name) {

        System.out.println("Hi its me  " + name );
        String Name = "Mohammed amine ztait";
    }
    public static void Main(String[] args) {

        String name = "Mohammed amine ztait";
        printName(name);
    }


    static String greetinguser(String username) {
        return "Welcome to my car shop, " + username + "!";
    }

    public static void greeting (String[] args) {
        String greeting = greetinguser("Mikaila");
        System.out.println(greeting);

    }
    public static double buyCoffee(double dollars) {
        double change = dollars - 1.0;
        return change;
    }

    public static void buyCoffee(String[] args) {
        double change1 = buyCoffee(2.5);
        System.out.println("Change left: $" + change1);

        double change2 = buyCoffee(1.0);
        System.out.println("Change left: $" + change2);
    }


        static void hobbies(String[] hobbies) {
            System.out.println("My hobbies are");
            for (String hobby : hobbies) {

                System.out.println(hobby);

            }
        }

        public static void myHobbies(String[] args) {
            String[] myHobbies = {"learning to code", "soccer", "eating which i cant do right know due to ramadan"};
            myHobbies(myHobbies);

            myHobbies(myHobbies);
        }


        public static String checkWeather(String weatherCondition, int temperature) {
            if (weatherCondition.equalsIgnoreCase("hot") && temperature > 80) {
                return "Wear shorts";
            } else if (weatherCondition.equalsIgnoreCase("cool") && temperature > 50) {
                return "Wear wind breakers";
            } else if (weatherCondition.equalsIgnoreCase("cold") && temperature < 50) {
                return "Wear a jacket";
            } else {
                return "No such weather condition";
            }
        }

            public static void weather(String[] args) {
        String recommended = checkWeather("hot", 85);
        System.out.println(recommended);
    }

    public static void area(String[] args) {
        double base = 5.0;
        double height = 7.0;

        double area = areaOfTriangle(base, height);

        System.out.println("The area of the triangle is: " + area);
    }
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }
   /*public static void main(String[] args) {
       // Generate a random number between 1 and 6 (inclusive)
       int randomNumber = (int) (Math.random() * 6) + 1;

       // Print the random number
       System.out.println("You rolled a " + randomNumber);

       // Use a switch statement to print a message based on the random number
       switch (randomNumber) {
           case 1:
               System.out.println("You rolled a one");
               break;
           case 2:
               System.out.println("You rolled a two");
               break;
           case 3:
               System.out.println("You rolled a three");
               break;
           case 4:
               System.out.println("You rolled a four");
               break;
           case 5:
               System.out.println("You rolled a five");
               break;
           case 6:
               System.out.println("You rolled a six");
               break;
           default:
               System.out.println("Invalid number");
       }
   }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        boolean validName = false;

        while (!validName) {
            System.out.print("What is your name? ");
            name = scanner.nextLine();

            if (name.equalsIgnoreCase("Aliyah")) {
                System.out.println("Hello Aliyah!");
                validName = true;
            } else if (name.equalsIgnoreCase("Hakeem")) {
                System.out.println("Hello Hakeem!");
                validName = true;
            } else {
                System.out.println("I'm sorry, I don't recognize that name. Please try again.");
            }
        }
    }



   /* public static void artist (String... args) {
        String[][] artists = {
                {"Biggie"},
                {"JayZ"},
                {"Nas"},
                {"Juicy"},
                {"22Twos"},
                {"One mIc"}
        };


        for (int i = 0; i < artists.length; i++) {
            for (int j = 0; j < artists[i].length; j++) {
                System.out.println(artists[i][j]);
            }
        }
    }*/


}






