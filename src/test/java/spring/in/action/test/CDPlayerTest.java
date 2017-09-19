package spring.in.action.test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.in.action.*;

/**
 * Created by shliangyan on 2017/9/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayerConfig.class, ConcertConfig.class})
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Autowired
    private Audience audience;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
        System.out.println("DONE");
    }

    @Test
    public void play() {
        player.play();
        System.out.println("play Done");
    }

    @Test
    public void audienceShouldNotNull() {
        assertNotNull(audience);
        System.out.println("audience is not null");
    }
}
