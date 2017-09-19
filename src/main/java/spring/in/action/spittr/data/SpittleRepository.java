package spring.in.action.spittr.data;

import spring.in.action.spittr.Spittle;

import java.util.List;

/**
 * Created by shliangyan on 2017/9/19.
 */
public interface SpittleRepository {
    abstract List<Spittle> findSpittles(long max, int count);
}
