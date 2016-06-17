package online.uva.supereasy;
import java.util.Scanner;

public class TexQuotes {
    public static void main(String[] args) {
        String line = "";
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            StringBuffer bufferOutput = new StringBuffer();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '\"') {
                    if (flag) {
                        bufferOutput.append("``");
                        flag = false;
                        continue;
                    } else {
                        bufferOutput.append("''");
                        flag = true;
                        continue;
                    }
                }
                bufferOutput.append(line.charAt(i));
            }
            System.out.println(bufferOutput);
        }
        scanner.close();
    }
}
