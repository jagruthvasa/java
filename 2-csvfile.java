import java.io.*;
public class a{
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("student.csv");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null) {
            String[] data = s.split(",");
            for (String str : data) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
        br.close();
    }
}
