import com.biw.asg.lib.SeeNSay;

public class Application {
    public static void main(String[] args) {
        Farm.getAnimals().forEach(SeeNSay::speak);
    }
}