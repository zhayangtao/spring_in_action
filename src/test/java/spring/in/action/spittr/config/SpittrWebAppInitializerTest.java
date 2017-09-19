package spring.in.action.spittr.config;

import com.google.common.collect.Lists;
import org.junit.Test;
import spring.in.action.spittr.Spittle;

import java.util.Date;
import java.util.List;

import static javafx.beans.binding.Bindings.when;
import static org.junit.Assert.*;

/**
 * Created by shliangyan on 2017/9/19.
 */
public class SpittrWebAppInitializerTest {

    @Test
    public void shouldShowRecentSpittles() {
        List<Spittle> expectedSpittles = createSpittleList(20);
//        when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).then(expectedSpittles);
    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = Lists.newArrayList();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }
}
