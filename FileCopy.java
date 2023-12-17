import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("test1.txt");
            fw = new FileWriter("test2.txt");
            int ch;
            while((ch = fr.read()) != -1)
                fw.write(ch);
            System.out.println("파일 복사 완료");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null)
                try {
                    fr.close();
                } catch (IOException e) { e.printStackTrace(); }
            if (fw != null)
                try {
                    fw.close();
                } catch (IOException e) { e.printStackTrace(); }
        }
    }
}