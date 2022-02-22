package CadernoDeRascunho;

import java.util.HashMap;
import java.util.Map;

public class MapsClass {

    public static void main(String[] args) {

        Map<Integer, String> mapaDados = new HashMap<Integer, String>();
        mapaDados.put(1, "fadas");
        mapaDados.put(2, "animais");
        mapaDados.put(3, "monstros");

        System.out.println(mapaDados.get(1));
    }


}
