import java.io.*;
public class CopyFileText {
    public static void main(String[] args) {
        File targetFile = null;
        File sourceFile = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            sourceFile = new File("sourceFile.txt");
            targetFile = new File("targetFile.txt");
            FileReader fileReader = new FileReader(sourceFile);
            FileWriter fileWriter = new FileWriter(targetFile);
            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line +"\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
                System.out.println("Length of targetFile is: "+targetFile.length());
                System.out.println("Length of sourceFile is: "+sourceFile.length());
            } catch (IOException e) {
            }
        }
    }
}