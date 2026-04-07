package LearnCoding.mod3;
import java.io.*;
public class createFile {
    static void main(String[] args) throws IOException{
        File f = new File("/Users/zaidzia/Desktop/developer/college programming/Java/IdeaProjects/FirstJavaProgramCWH/src/LearnCoding/mod3//lc.txt");
        if(f.createNewFile()){
            System.out.println("file created successfully");
        }
        else{
            System.out.println("file already there");
        }
    }
}
