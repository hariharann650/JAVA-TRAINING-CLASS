import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Ook {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\harih\\IdeaProjects\\untitled5\\out\\production\\untitled5\\nothing.txt");
            Scanner myReader = new Scanner(myObj);
            StringBuilder data = new StringBuilder();
            while (myReader.hasNextLine()) {
                data.append(myReader.nextLine());
                System.out.println(data);
            }
            myReader.close();
            File myObj1 = new File("C:\\Users\\harih\\IdeaProjects\\untitled5\\out\\production\\untitled5\\nothing1.txt");
            Scanner myReader1 = new Scanner(myObj1);
            StringBuilder data1 = new StringBuilder();
            while (myReader1.hasNextLine()) {
                 data1.append(myReader1.nextLine());
                System.out.println(data1);
            }
            myReader1.close();
            if(data.toString().equals(data1.toString())){
                System.out.println("this is same word");
            }
            else{
                System.out.println("this is not same");
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
