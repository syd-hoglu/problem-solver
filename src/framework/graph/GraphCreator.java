package framework.graph;

import framework.problem.Problem;
import framework.problem.State;
import java.util.Stack;
import java.util.List;

/**
 * @author Sydney Hoglund Section 001
 */
public class GraphCreator {

    public Graph createGraphFor(Problem problem) {
        graph = new Graph();
        stack = new Stack();
        start = new Vertex(problem.getCurrentState());
        stack.push(start);
        moves = problem.getMover().getMoveNames();
        while (!stack.empty()) {
            u = (Vertex)stack.pop();
            for (String m : moves) {
                State next = problem.getMover().doMove(m, (State) u.getData());
                if (next != null) {
                    Vertex v = new Vertex(next);
                    if (graph.getVertices().containsKey(v)) {
                        v = graph.getVertices().get(v);
                    } else {
                        stack.push(v);
                    }
                    graph.addEdge(u, v);
                }
            }
        }

        return graph;
    }

    private Graph graph = null;
    private Vertex start;
    private Stack<Vertex> stack;
    private List<String> moves;
    private Vertex u;
}
