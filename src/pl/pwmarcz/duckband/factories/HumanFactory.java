package pl.pwmarcz.duckband.factories;

import pl.pwmarcz.duckband.musicians.*;

public class HumanFactory implements MusicianFactory {
    @Override
    public Singer makeSinger() {
        return new HumanSinger();
    }

    @Override
    public Guitarist makeGuitarist() {
        return new HumanGuitarist();
    }

    @Override
    public Drummer makeDrummer() {
        return new HumanDrummer();
    }
}
