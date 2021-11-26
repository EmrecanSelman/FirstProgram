package StudyStream;

import java.io.*;


public class InputOutput {
    public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter("ğğğ.txt"));
    bw.write("aslı");
    bw.write("\ndilara");
    bw.write("\nbarış");
    bw.write("\npınar");
bw.close();
 BufferedReader br = new BufferedReader(new FileReader("ğğğ.txt"));
  String a;
while ((a = br.readLine()) != null){
    System.out.println(a);
}
br.close();
    }

}
