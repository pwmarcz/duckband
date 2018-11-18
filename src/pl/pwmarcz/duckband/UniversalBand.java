package pl.pwmarcz.duckband;

import pl.pwmarcz.duckband.factories.MusicianFactory;
import pl.pwmarcz.duckband.musicians.Drummer;
import pl.pwmarcz.duckband.musicians.Guitarist;
import pl.pwmarcz.duckband.musicians.Singer;

public class UniversalBand {
    void playImperialMarch(MusicianFactory factory) {
        Singer singer = factory.makeSinger();
        Guitarist guitarist = factory.makeGuitarist();
        Drummer drummer = factory.makeDrummer();

        drummer.playDrums();
        singer.sing("Darth Vader is coming");
        guitarist.playGuitar();
        singer.sing("I'm your father");
    }
}
