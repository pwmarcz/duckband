package pl.pwmarcz.duckband.musicians;

public class DuckSinger implements Singer {
    @Override
    public void sing(String lyrics) {
        System.out.println(lyrics.replaceAll("\\w+", "quack"));
    }
}
