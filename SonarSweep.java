import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class SonarSweep {
    
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            ArrayList<Integer> depths = new ArrayList<Integer>();
            int count = 0;
        
            while (scanner.hasNextLine()) {
                int num = Integer.parseInt(scanner.nextLine());
                depths.add(num);
            }

            for (int i = 0; i < depths.size() - 1; i++) {
                if (depths.get(i) < depths.get(i + 1)) {
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
