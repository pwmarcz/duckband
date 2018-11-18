package pl.pwmarcz.duckband.musicians;

public class DuckGuitarist implements Guitarist {
    @Override
    public void playGuitar() {
        System.out.println("(duck guitar playing)");
    }
}
