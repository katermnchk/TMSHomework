import java.io.*;
import java.util.regex.*;

public class MyMain {
    public static void main(String[] args) {
        try {
            //task1
            String longestWord = findLongestWord
                    ("C:/Users/katar/OneDrive/Рабочий стол/Romeo and Julietta (en).txt");
            saveWord("C:/Users/katar/OneDrive/Рабочий стол/LongestWord.txt", longestWord);
            System.out.println("The longest word is written to the new file. This word is: " + longestWord);

            //task2
            String inputFile = "C:/Users/katar/OneDrive/Рабочий стол/doc_numbers.txt";
            String validFile = "C:/Users/katar/OneDrive/Рабочий стол/valid_docs.txt";
            String invalidFile = "C:/Users/katar/OneDrive/Рабочий стол/invalid_docs.txt";
            validateDocumentNumbers(inputFile, validFile, invalidFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

   public static String findLongestWord(String myFile) throws IOException {
        String longestWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        }
       return longestWord;
   }

   public static void saveWord(String newFile, String word) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))) {
            writer.write("The longest word of Romeo and Julletta is: " + word);
        }
   }

   public static void validateDocumentNumbers(String inputFile, String validFile, String invalidFile) throws IOException
   {
       try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter validWriter = new BufferedWriter(new FileWriter(validFile));
            BufferedWriter invalidWriter = new BufferedWriter(new FileWriter(invalidFile))) {

           String line;
           while ((line = reader.readLine()) != null) {
               line = line.trim();
               if (isValidDocumentNumber(line)) {
                   validWriter.write(line);
                   validWriter.newLine();
               } else {
                   invalidWriter.write(line);
                   invalidWriter.newLine();
               }
           }
           System.out.println("Documents were checked");
       }
   }

   public static boolean isValidDocumentNumber(String line) {
        Pattern vallidPattern = Pattern.compile("^(docnum|contract)[a-zA-Z0-9]{9}$");
        return line.length() == 15 && vallidPattern.matcher(line).matches();
   }

}
