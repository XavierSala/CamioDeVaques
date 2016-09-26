package net.xaviersala;

import java.util.List;
import java.util.Arrays;

public class App {

    private static final int PES = 700;

	public static void main(String[] args) {

        List<Vaca> vaques = Arrays.asList(
                new Vaca("Maria", 360, 40),
                new Vaca("Pepa", 250, 35),
                new Vaca("Flor", 400, 43),
                new Vaca("Toñi", 180, 28),
                new Vaca("Conxita", 50, 12),
                new Vaca("Blanca", 90, 13)
        );

        Pastor pastor = new Pastor();
        pastor.ompleCamio(new Camio(PES), vaques);
        System.out.println(pastor.getResultat());


    }

}
