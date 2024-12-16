import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Desktop;



public class main {
        public static void questions(){
            Scanner readInput=new Scanner(System.in);
            StopWatch sw=new StopWatch();
            sw.startTimer();
            System.out.println("Please enter topic");
            String topic=readInput.nextLine();
            System.out.println("Thanks! The topic will be "+ topic+". Enter number of questions");
            File file=new File("C:/Users/igors/Documents/Code/Java/Certified Associate Java Training/Answers/Answers "+topic+".txt");
            int n=readInput.nextInt();
            try {
                BufferedWriter writer=new BufferedWriter(new FileWriter(file));
                String ans;
                for (int i = 1; i <= n; i++) {
                    System.out.println("Enter all answers for question " +i+ " Enter x to terminate");
                    writer.write("Question "+i+")");
                    do{
                        ans=readInput.nextLine().trim();
                        if(!ans.equals("x"))writer.write(ans+" ");
                    }while(!ans.equals("x"));
                    writer.newLine();
                }
                sw.stopTimer();
                writer.write(sw.time());
                writer.close();
                Desktop.getDesktop().open(file);
                Runtime.getRuntime().exec("explorer C:\\Users\\igors\\Documents\\Code\\Java\\Certified Associate Java Training\\Answers");

            }catch (IOException e) {
                e.getStackTrace();
            }
        }
        public static void main(String[] args){
            questions();
        }

}
