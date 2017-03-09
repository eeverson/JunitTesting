package iloveyouboss.score;

import static org.junit.Assert.*;

import iloveyouboss.jobapp.ScoreCollection;
import org.junit.*;

/**
 * @author Erik
 */
public class MyScoreCollectionTest {
    int anInt1 = 5;
    int anInt2 = 7;
    ScoreCollection scoreCollection;

    @Before
    public void setUp() throws Exception {
        scoreCollection = new ScoreCollection();
    }

    @Test
    public void testArithmeticMean() throws Exception {
        //Arrange
        addTwoIntegersToArithmeticMean(scoreCollection, anInt1, anInt2);

        //Act
        int result = scoreCollection.arithmeticMean();

        //Assert
        assertEquals(6, result);

    }

    public void addTwoIntegersToArithmeticMean(ScoreCollection scoreCollection,
                                               int one, int two){
        scoreCollection.add(() -> one);
        scoreCollection.add(() -> two);
    }

}