package pl.pwmarcz.duckband.factories;

import pl.pwmarcz.duckband.musicians.Drummer;
import pl.pwmarcz.duckband.musicians.Guitarist;
import pl.pwmarcz.duckband.musicians.Singer;

public interface MusicianFactory {
    Singer makeSinger();
    Guitarist makeGuitarist();
    Drummer makeDrummer();
}
