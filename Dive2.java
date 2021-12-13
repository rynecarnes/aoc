import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Dive2{ 
    
    public static void main(String[] args) {
        try {
            File file = new File("day2Input.txt");
            Scanner scanner = new Scanner(file);
            long x = 0;
            long y = 0;
            long aim = 0;
            

            while (scanner.hasNextLine()) {
                String[] command = scanner.nextLine().split(" ");
                if ("forward".equals(command[0])) {
                    x += Long.parseLong(command[1]);    
                    y += (aim * Long.parseLong(command[1]));
                }
                else if ("down".equals(command[0])) {
                    aim += Long.parseLong(command[1]);
                }
                else if ("up".equals(command[0])) {
                    aim -= Long.parseLong(command[1]);
                }
                System.out.println("New Position: " + x + ", " + y);
            }
            System.out.println(x * y);
        }
        catch (FileNotFoundException e) {
            System.out.println("File could not be found.");
            e.printStackTrace();
        }
    }

}
