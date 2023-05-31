package framework.problem;

import java.util.List;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * @author tcolburn
 */
public class ProblemTest {

    @Test
    public void testBenchmarks() {
        Problem p = new Problem();
        p.addBenchmark(new Benchmark("Test Bench 1", 1, null, null));
        p.addBenchmark(new Benchmark("Test Bench 2", 2, null, null));
        p.addBenchmark(new Benchmark("Test Bench 3", 3, null, null));
        List<Benchmark> benches = p.getBenchmarks();
        assertTrue(benches.size() == 3);
        System.out.println(benches);
    }
}
