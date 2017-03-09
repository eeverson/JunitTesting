package iloveyouboss.jobapp;

import iloveyouboss.jobapp.*;
import org.junit.*;

import java.util.PrimitiveIterator;

/**
 * Created by Erik on 3/8/2017.
 */

public class MyProfileTest {
    private String name = "John Doe";
    private Profile profile;

    @Before
    public void setUp(){
        profile = new Profile(name);
    }

    @Test
    public void getNameTest(){
        String profileName = profile.getName();

        Assert.assertSame(name, profileName);
    }

    @Test
    public void addTest(){

    }

    @Test
    public void matchesTest(){
        Question question = new BooleanQuestion(1, "Work life Balance?");
        Answer answer = new Answer(question, Bool.FALSE);
        profile.add(answer);
        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(question, Bool.TRUE);
        Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
        criteria.add(criterion);

        boolean matches = profile.matches(criteria);
        Assert.assertFalse(matches);
    }

    @Test
    public void scoreTest(){

    }
}
