package spring.in.action.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by shliangyan on 2017/9/18.
 */
@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "spring.in.action.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
