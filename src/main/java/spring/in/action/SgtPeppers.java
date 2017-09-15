package spring.in.action;

import org.springframework.stereotype.Component;

/**
 * Created by zhayangtao on 2017/9/15.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt.Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
