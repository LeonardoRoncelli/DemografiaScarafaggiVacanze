import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class RoachSimulation {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        RoachPopulation scarafaggi=new RoachPopulation(10);
        for(int i=0;i<4;i++) {
            System.out.println(scarafaggi.breed());
            scarafaggi.spray();
            try {
                TimeUnit.SECONDS.sleep(2);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
