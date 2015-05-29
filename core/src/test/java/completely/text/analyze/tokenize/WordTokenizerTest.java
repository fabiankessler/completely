package completely.text.analyze.tokenize;

import completely.text.analyze.AbstractAnalyzerTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordTokenizerTest extends AbstractAnalyzerTest<WordTokenizer>
{
    public WordTokenizerTest()
    {
        super(new WordTokenizer());
    }

    @Test
    public void testApply()
    {
        Object[] result = analyzer.apply("Lorem ipsum dolor sit amet, consectetur adipiscing elit.").toArray();
        assertEquals(8, result.length);
        assertEquals("Lorem", result[0]);
        assertEquals("ipsum", result[1]);
        assertEquals("dolor", result[2]);
        assertEquals("sit", result[3]);
        assertEquals("amet", result[4]);
        assertEquals("consectetur", result[5]);
        assertEquals("adipiscing", result[6]);
        assertEquals("elit", result[7]);
    }

    @Test
    public void testApplyNullElement()
    {
        exceptionRule.expect(NullPointerException.class);
        analyzer.apply((String) null);
    }
}
