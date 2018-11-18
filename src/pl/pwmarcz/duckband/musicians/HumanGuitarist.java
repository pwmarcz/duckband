package pl.pwmarcz.duckband.musicians;

public class HumanGuitarist implements Guitarist {
    @Override
    public void playGuitar() {
        System.out.println("(guitar playing)");
    }
}
