import javax.swing.*;
import java.awt.*;
import java.util.*;

public class GraphVisualizer extends JFrame {

    private final Map<String, Integer> weights;
    private Set<String> algorithmOutputEdges;  // MST edges

    public GraphVisualizer() {
        weights = new HashMap<>();
        addEdge("a - b", 2);
        addEdge("a - c", 3);
        addEdge("a - d", 1);
        addEdge("b - e", 5);
        addEdge("d - f", 4);
        addEdge("e - f", 6);
        addEdge("e - g", 2);
        addEdge("f - e", 6);  // Same as e-f, for bidirectional consistency
        addEdge("f - g", 3);

        algorithmOutputEdges = new HashSet<>(); // MST edges will be stored here

        // Sample MST edges for visualization (example from Prim's or Kruskal’s)
        algorithmOutputEdges.add(normalizeEdge("a - d"));
        algorithmOutputEdges.add(normalizeEdge("a - b"));
        algorithmOutputEdges.add(normalizeEdge("a - c"));
        algorithmOutputEdges.add(normalizeEdge("d - f"));
        algorithmOutputEdges.add(normalizeEdge("e - g"));
        algorithmOutputEdges.add(normalizeEdge("f - g"));

        setTitle("Graph MST Visualizer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(createOutputPanel());
        setVisible(true);
    }

    private JPanel createOutputPanel() {
        JPanel outputPanel = new JPanel(new BorderLayout());

        JPanel graphPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawGraph(g, algorithmOutputEdges);
            }
        };

        outputPanel.add(graphPanel, BorderLayout.CENTER);
        return outputPanel;
    }

    private void addEdge(String edge, int weight) {
        weights.put(edge, weight);
    }

    private void drawGraph(Graphics g, Set<String> mstEdges) {
        drawEdgeWithWeight(g, 75, 105, 105, 75, "a - b", mstEdges);
        drawEdgeWithWeight(g, 70, 110, 140, 110, "a - c", mstEdges);
        drawEdgeWithWeight(g, 75, 115, 105, 145, "a - d", mstEdges);
        drawEdgeWithWeight(g, 105, 75, 175, 75, "b - e", mstEdges);
        drawEdgeWithWeight(g, 105, 145, 175, 145, "d - f", mstEdges);
        drawEdgeWithWeight(g, 175, 75, 205, 105, "e - f", mstEdges);
        drawEdgeWithWeight(g, 175, 75, 245, 75, "e - g", mstEdges);
        drawEdgeWithWeight(g, 205, 145, 175, 145, "f - e", mstEdges);
        drawEdgeWithWeight(g, 205, 145, 245, 75, "f - g", mstEdges);

        // Draw vertices
        g.setColor(Color.BLACK);
        g.fillOval(70, 100, 10, 10); g.drawString("a", 60, 100);
        g.fillOval(100, 70, 10, 10); g.drawString("b", 100, 60);
        g.fillOval(140, 100, 10, 10); g.drawString("c", 140, 90);
        g.fillOval(100, 140, 10, 10); g.drawString("d", 90, 155);
        g.fillOval(170, 70, 10, 10); g.drawString("e", 170, 60);
        g.fillOval(200, 140, 10, 10); g.drawString("f", 200, 155);
        g.fillOval(240, 70, 10, 10); g.drawString("g", 240, 60);
    }

    private void drawEdgeWithWeight(Graphics g, int x1, int y1, int x2, int y2, String edge, Set<String> mstEdges) {
        String normalizedEdge = normalizeEdge(edge);
        boolean isHighlighted = mstEdges != null && mstEdges.contains(normalizedEdge);

        g.setColor(isHighlighted ? Color.RED : Color.BLACK);
        g.drawLine(x1, y1, x2, y2);
        int midX = (x1 + x2) / 2;
        int midY = (y1 + y2) / 2;
        g.drawString(weights.getOrDefault(edge, 0).toString(), midX, midY);
    }

    // Normalize undirected edge to same form: "a - b" == "b - a"
    private String normalizeEdge(String edge) {
        String[] parts = edge.replaceAll(" ", "").toLowerCase().split("-");
        if (parts.length != 2) return edge;
        return (parts[0].compareTo(parts[1]) < 0) ? parts[0] + "-" + parts[1] : parts[1] + "-" + parts[0];
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GraphVisualizer::new);
    }
}
