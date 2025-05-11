import java.io.File; 
import java.io.IOException;

public class CreateFile {
public static void main(String[] args) {
try {
File myObj = new File("Nishantt.txt");
if (myObj.createNewFile()) {
System.out.println("File created: " + myObj.getName());
System.out.println("Path of the file is : " + myObj.getAbsolutePath());
System.out.println("Length of the file is: " + myObj.length());
System.out.println("Does the file exists: " + myObj.exists());
} else {
System.out.println("File already exists.");
}
} catch (IOException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}
}