package pl.pwmarcz.duckband;

import pl.pwmarcz.duckband.musicians.*;

public class HumanBand extends AbstractBand {
    @Override
    protected Singer makeSinger() {
        return new HumanSinger();
    }

    @Override
    protected Guitarist makeGuitarist() {
        return new HumanGuitarist();
    }

    @Override
    protected Drummer makeDrummer() {
        return new HumanDrummer();
    }
}
