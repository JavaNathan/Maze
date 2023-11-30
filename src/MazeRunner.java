import java.util.Scanner;
public class MazeRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maze maze1 = new Maze();
        String reset = "\u001B[0m";
        String red = "\u001B[41m";
        String blue = "\u001B[44m";
        System.out.println(blue+"Welcome adventurer! Are you ready for a maze game?"+reset);
        String choice = sc.nextLine();
        String real = choice.toLowerCase();
        int k = 12;
        if (real.equals("yes")) {
            System.out.println("\nGreat! Let's get started!");
            System.out.println("\nThis is going to be so fun! \\(> v <)/");
            // for (int i = 0; i < k; i++){
            //

            //}
            maze1.maze1();
            System.out.println("\nEnter a Direction: (East, West, North, South)");
            String direction1 = sc.nextLine();
            String real2 = direction1.toLowerCase();
            if (real2.equals("east")) {
                System.out.println("\nYou Entered the maze! Good Job!");
                maze1.maze2();
                boolean end = false;
                if (end != true) {
                    System.out.println("\nEnter a Direction: (East, West, North, South)");
                    String direction2 = sc.nextLine();
                    String real3 = direction2.toLowerCase();
                    if (real3.equals("east")) {
                        maze1.message();
                        maze1.maze3();
                        if (end != true){
                            System.out.println("\nEnter a Direction: (East, West, North, South)");
                            String direction3 = sc.nextLine();
                            String real4 = direction3.toLowerCase();
                            if (real4.equals("east")) {
                                maze1.message();
                                maze1.maze4();
                                if (end != true){
                                    System.out.println("\nEnter a Direction: (East, West, North, South)");
                                    String direction4 = sc.nextLine();
                                    String real5 = direction4.toLowerCase();
                                    if (real5.equals("east")) {
                                        maze1.message();
                                        maze1.maze5();
                                        if (end != true){
                                            System.out.println("\nEnter a Direction: (East, West, North, South)");
                                            String direction5 = sc.nextLine();
                                            String real6 = direction5.toLowerCase();
                                            if (real6.equals("north")) {
                                                maze1.message();
                                                maze1.maze6();
                                                if (end != true){
                                                    System.out.println("\nEnter a Direction: (East, West, North, South)");
                                                    String direction6 = sc.nextLine();
                                                    String real7 = direction6.toLowerCase();
                                                    if (real7.equals("north")){
                                                        maze1.message();
                                                        maze1.maze7();
                                                        if (end!= true){
                                                            System.out.println("\nEnter a Direction: (East, West, North, South)");
                                                            String direction7 = sc.nextLine();
                                                            String real8 = direction7.toLowerCase();
                                                            if (real8.equals("west")){
                                                                maze1.message();
                                                                maze1.maze8();
                                                                if (end != true){
                                                                    System.out.println("\nEnter a Direction: (East, West, North, South)");
                                                                    String direction8 = sc.nextLine();
                                                                    String real9 = direction8.toLowerCase();
                                                                    if (real9.equals("north")){
                                                                        maze1.message();
                                                                        maze1.maze9();
                                                                        if (end != true){
                                                                            System.out.println("\nEnter a Direction: (East, West, North, South)");
                                                                            String direction9 = sc.nextLine();
                                                                            String real10 = direction9.toLowerCase();
                                                                            if (real10.equals("east")){
                                                                                maze1.message();
                                                                                maze1.maze10();
                                                                                if (end != true){
                                                                                    System.out.println("\nEnter a Direction: (East, West, North, South)");
                                                                                    String direction10 = sc.nextLine();
                                                                                    String real11 = direction10.toLowerCase();
                                                                                    if (real11.equals("south")){
                                                                                        maze1.message();
                                                                                        maze1.maze11();
                                                                                        if (end != true){
                                                                                            System.out.println("\nEnter a Direction: (East, West, North, South)");
                                                                                            String direction11 = sc.nextLine();
                                                                                            String real12 = direction11.toLowerCase();
                                                                                            if (real12.equals("east")){
                                                                                                maze1.message();
                                                                                                maze1.maze12();
                                                                                                end = true;
                                                                                                if (end == true){
                                                                                                    System.out.println(red + "\nCongratulations! You escaped the maze!"+reset);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        System.out.println("Try Again!");
                                                    }

                                                } else{
                                                    System.out.println("You hit a wall! Try again!");
                                                }
                                            }
                                            else if (choice.equals("No")){
                                                System.out.println("Oh, too bad.");
                                                System.out.println("Ending 1: Never play a maze game!");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}