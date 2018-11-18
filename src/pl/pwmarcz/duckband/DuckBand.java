package pl.pwmarcz.duckband;

import pl.pwmarcz.duckband.musicians.*;

public class DuckBand extends AbstractBand {
    @Override
    protected Singer makeSinger() {
        return new DuckSinger();
    }

    @Override
    protected Guitarist makeGuitarist() {
        return new DuckGuitarist();
    }

    @Override
    protected Drummer makeDrummer() {
        return new DuckDrummer();
    }
}
