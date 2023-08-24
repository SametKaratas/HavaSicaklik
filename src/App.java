import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Sicaklik girin :");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak yapabilrisin.");
        }else if((heat > 5) && (heat < 15)){
            System.out.println("Sinemaya git.");
        }if((heat > 15) && (heat < 25)){
            System.out.println("Piknige git.");
        }if(heat > 25){
            System.out.println("Yuzmeye git.");
        }
    }
}
