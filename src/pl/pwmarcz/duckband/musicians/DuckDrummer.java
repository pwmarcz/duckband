package pl.pwmarcz.duckband.musicians;

public class DuckDrummer implements Drummer {
    @Override
    public void playDrums() {
        System.out.println("(duck drum beat)");
    }
}
