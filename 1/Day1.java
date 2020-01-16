import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Day1{

    public static void main(String[] args) throws Exception {
        File file = new File("pzl1input.txt");
        shortestPath(file);
    }

    public static int shortestPath(File file) throws Exception{
        Scanner sc = new Scanner(file);
        String input = new String();
        while(sc.hasNextLine()) {
            input = sc.nextLine();
        }
        String[] directions = input.split(",");
        System.out.println(directions.length);
        for(int i = 0; i < directions.length; i++) {
            String currentValue = directions[i];
            currentValue = currentValue.trim();
            Character direction = currentValue.charAt(0);
            switch(direction) {
                case 'R':
                    System.out.println("Right");
                    break;
                case 'L':
                    System.out.println("Left");
                    break;
                default:
                    System.out.println("Fell through");
                    break;
            }
            System.out.println(directions[i]);
        }
        return 0;
    }

}