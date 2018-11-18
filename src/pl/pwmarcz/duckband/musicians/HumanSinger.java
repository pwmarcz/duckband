package pl.pwmarcz.duckband.musicians;

public class HumanSinger implements Singer {
    @Override
    public void sing(String lyrics) {
        System.out.println(lyrics);
    }
}
