package framework.solution;

import framework.graph.Vertex;
import framework.problem.Mover;
import framework.problem.Problem;
import framework.problem.State;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents a state space solver by extending the abstract
 * Solver class.
 * @author Sydney Hoglund Section 001
 */
public abstract class StateSpaceSolver extends Solver {
    
    /**
     * Creates a BFS or DFS state space solver.
     * This constructor should set the queue to a double-ended queue 
     * (DEQUE) like the GraphSolver.
     * @param problem the problem being solved
     */
    public StateSpaceSolver(Problem problem) {
        super(problem);
        super.setQueue(new LinkedList<>());
    }
    
    /**
     * This method implements the expand operation required by the 
     * state space search algorithm.
     * @param u the vertex being expanded
     * @return the children of u in the state space search tree
     */
    @Override
    public List<Vertex> expand(Vertex u) { 
        LinkedList<Vertex> verts = new LinkedList();
        moves = getProblem().getMover().getMoveNames();
        for (String m : moves) {
                State next = getProblem().getMover().doMove(m, (State) u.getData());
                if (next != null) {
                    Vertex v = new Vertex(next);
                    verts.add(v);
                }
        }
        return verts;
    }
    private List<String> moves;
}