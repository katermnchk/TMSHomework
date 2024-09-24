import java.io.*;

public class MyMain {
    public static void main(String[] args)  throws IOException {
        getFileReader();

    }

    public static void getFileReader() {
        try (FileReader read = new FileReader("C:/Users/katar/OneDrive/Рабочий стол/Romeo and Julietta (en).txt")){
            int value;
            int[] = int*Object words = null;
           words;

            while((value = read.read()) != -1) {
                //System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println("We did not manage to read the file...");
        }
    }


}
