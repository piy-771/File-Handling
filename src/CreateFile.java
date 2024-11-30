import javax.swing.*;
import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("f:\\Test1.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
                JOptionPane.showMessageDialog(null,"File Created");
            }catch (IOException ioException){
                System.out.println("ioException = " + ioException);
            }

        }

        //Address of file
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());


        //Write in a file
        try{
            FileWriter fileWriter = new FileWriter(file,true);
            PrintWriter out = new PrintWriter(fileWriter);
            out.println("python");
            out.println(45);
            out.println(true);
            fileWriter.close();
            out.close();
            JOptionPane.showMessageDialog(null,"Data Added");
        }catch (IOException ioException){
            System.out.println(ioException);
        }


        //Read data from file
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null){
                System.out.println(data);
            }
        }catch (IOException ioException){
            System.out.println("ioException = " + ioException);
        }

    }
}
