package grabar.Homework_3;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;


public class Ukraine {

    public static List<Region> createListOfRegions () {


        boolean capital;

        ArrayList<Region> ukraine = new ArrayList<Region>();
        ukraine.add(new Region(Inforntion.centerOdessa,Inforntion.squareOdessa));
        ukraine.add(new Region(Inforntion.centerKyiv,Inforntion.squareKyiv));
        int numerOfRegions = ukraine.size();
        List<Region> ukraine2 = ukraine.stream()
                .collect(Collectors.toList());
        System.out.println(ukraine2);
        return ukraine2;
    }
}