package code.coverage.demo;

import org.junit.Assert;
import org.junit.Test;

public class CodeCoverageTest {

    @Test
    public void test1() {
        Assert.assertEquals(CodeCoverage.start(), "start");
    }

    @Test
    public void test2() {
        Assert.assertEquals(CodeCoverage.stop(), "stop");
    }


}