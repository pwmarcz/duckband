package pl.pwmarcz.duckband;

import pl.pwmarcz.duckband.musicians.Drummer;
import pl.pwmarcz.duckband.musicians.Guitarist;
import pl.pwmarcz.duckband.musicians.Singer;

public abstract class AbstractBand {
    void playImperialMarch() {
        Singer singer = makeSinger();
        Guitarist guitarist = makeGuitarist();
        Drummer drummer = makeDrummer();

        drummer.playDrums();
        singer.sing("Darth Vader is coming");
        guitarist.playGuitar();
        singer.sing("I'm your father");
    }

    protected abstract Singer makeSinger();
    protected abstract Guitarist makeGuitarist();
    protected abstract Drummer makeDrummer();
}
