package pl.pwmarcz.duckband.factories;

import pl.pwmarcz.duckband.musicians.*;

public class DuckFactory implements MusicianFactory {
    @Override
    public Singer makeSinger() {
        return new DuckSinger();
    }

    @Override
    public Guitarist makeGuitarist() {
        return new DuckGuitarist();
    }

    @Override
    public Drummer makeDrummer() {
        return new DuckDrummer();
    }
}
