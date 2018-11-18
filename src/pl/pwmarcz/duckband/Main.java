package pl.pwmarcz.duckband;

import pl.pwmarcz.duckband.factories.DuckFactory;
import pl.pwmarcz.duckband.factories.HumanFactory;
import pl.pwmarcz.duckband.musicians.*;

public class Main {

    public static void main(String[] args) {
	    DuckBand duckBand = new DuckBand();
        HumanBand humanBand = new HumanBand();

        System.out.println("Duck band:");
        duckBand.playImperialMarch();

        System.out.println();
        System.out.println("Human band:");
        humanBand.playImperialMarch();

        System.out.println();
        UniversalBand band = new UniversalBand();
        System.out.println("Duck band:");
        band.playImperialMarch(new DuckFactory());

        System.out.println();
        System.out.println("Human band:");
        band.playImperialMarch(new HumanFactory());
    }
}
