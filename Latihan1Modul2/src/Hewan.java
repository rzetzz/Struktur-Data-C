import java.util.ArrayList;
import java.util.Arrays;

public class Hewan {

    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<String>();
        ArrayList<String> deleteHewan = new ArrayList<String>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        System.out.println("Hewan : " + hewan);
        System.out.println("Delete Hewan : " + deleteHewan);
        for(int i = 0; i<deleteHewan.size(); i++){
            hewan.remove(deleteHewan.get(i));
        }

        System.out.println("Hasil : " + hewan);
    }

}
