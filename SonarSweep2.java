import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class SonarSweep2 {
    
    public static void main(String[] args) {
        try {
            File file = new File("day1Input.txt");
            Scanner scanner = new Scanner(file);
            ArrayList<Integer> depths = new ArrayList<Integer>();
            int count = 0;
        
            while (scanner.hasNextLine()) {
                int num = Integer.parseInt(scanner.nextLine());
                depths.add(num);
            }

            for (int i = 2; i < depths.size() - 1; i++) {
                int currentWindow = depths.get(i - 1) + depths.get(i) + depths.get(i + 1);
                int prevWindow = depths.get(i - 2) + depths.get(i - 1) + depths.get(i);
                if (currentWindow > prevWindow) {
                    count++;
                }
            }

            System.out.println(count);
        }
        catch (FileNotFoundException e) {
            System.out.println("File could not be found.");
            e.printStackTrace();
        }
    }

}
