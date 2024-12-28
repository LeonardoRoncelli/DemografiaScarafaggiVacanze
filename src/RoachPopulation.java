import java.util.Random;
public class RoachPopulation {
    private int roaches;
    public void setRoaches(int roaches){
        this.roaches=roaches;
    }
    public int getRoaches(){
        return roaches;
    }
    public RoachPopulation(int roaches){
        this.roaches=roaches;
    }
    public String breed(){
        Random random=new Random();
        int giorniRaddoppia;
        int popolazioneRaddoppiata;
            giorniRaddoppia = random.nextInt(6)+1;
            popolazioneRaddoppiata = (roaches * 2) * giorniRaddoppia;
            setRoaches(popolazioneRaddoppiata);
            return "La popolazione di scarafaggi in " + giorniRaddoppia + " giorno/i è raddoppiata." + "\n" +
                    "Ora la popolazione ammonta a: " + popolazioneRaddoppiata + " scarafaggi";
    }
    public void spray(){
        setRoaches(roaches-(int)(roaches*(10.0/100)));
        System.out.println("Popolazione di scarafaggi dopo aver spruzzato insetticida: "+getRoaches());
    }
}