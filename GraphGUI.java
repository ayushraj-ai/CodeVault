import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
import java.util.*;
import java.util.List;

public class GraphGUI extends JFrame {
	private Map<String, JTextField> edgeWeightFields;
	private CardLayout cardLayout;
	private JPanel mainPanel;
	private JPanel inputPanel;
	private JPanel outputPanel;
	private Map<String, Integer> weights;

	public GraphGUI() {
		edgeWeightFields = new HashMap<>();
		weights = new HashMap<>();

		setTitle("Graph Algorithm Visualizer");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cardLayout = new CardLayout();
		mainPanel = new JPanel(cardLayout);

		createInputPanel();
		createOutputPanel();

		mainPanel.add(inputPanel, "Input");
		mainPanel.add(outputPanel, "Output");

		add(mainPanel);
		setVisible(true);
	}

	private void createInputPanel() {
		inputPanel = new JPanel(new BorderLayout(10, 10));
		inputPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

		JPanel weightsPanel = new JPanel();
		weightsPanel.setLayout(new BoxLayout(weightsPanel, BoxLayout.Y_AXIS));
		weightsPanel.setBorder(BorderFactory.createTitledBorder("Enter Edge Weights"));

		String[] edges = {
			"a - b", "a - h", "b - c", "b - h",
			"h - i", "h - g", "c - i", "i - g",
			"c - d", "c - f", "g - f", "d - e",
			"d - f", "f - e"
		};

		for (String edge : edges) {
			JPanel edgePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel edgeLabel = new JLabel(edge + " == ");
			JTextField weightField = new JTextField(3); 
			edgePanel.add(edgeLabel);
			edgePanel.add(weightField);
			weightsPanel.add(edgePanel);
			edgeWeightFields.put(edge, weightField); 
		}

		JPanel graphPanel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				drawGraph(g); 
			}
		};
		graphPanel.setPreferredSize(new Dimension(500, 300));
		graphPanel.setBorder(BorderFactory.createTitledBorder("Graph"));

		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));

		JPanel algorithmPanel = new JPanel();
		algorithmPanel.setBorder(BorderFactory.createTitledBorder("Algorithms"));
		JRadioButton kruskalButton = new JRadioButton("Kruskal's");
		JRadioButton primButton = new JRadioButton("Prim's");
		ButtonGroup algorithmGroup = new ButtonGroup();
		algorithmGroup.add(kruskalButton);
		algorithmGroup.add(primButton);
		algorithmPanel.add(kruskalButton);
		algorithmPanel.add(primButton);

		JPanel buttonPanel = new JPanel();
		JButton startButton = new JButton("START");
		JButton refreshButton = new JButton("REFRESH");
		JButton saveButton = new JButton("SAVE"); 
		buttonPanel.add(startButton);
		buttonPanel.add(refreshButton);
		buttonPanel.add(saveButton); 

		controlPanel.add(algorithmPanel);
		controlPanel.add(Box.createVerticalStrut(20)); 
		controlPanel.add(buttonPanel);

		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (collectWeights()) {
					String selectedAlgorithm = getSelectedAlgorithm(kruskalButton, primButton);
					if (selectedAlgorithm != null) {
						String result = runAlgorithm(selectedAlgorithm);
						showOutput(result);
					}
				}
			}
		});

		refreshButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				refreshWeights();
				inputPanel.repaint(); 
			}
		});

		saveButton.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				if (collectWeights()) {
					JOptionPane.showMessageDialog(inputPanel, "Weights saved successfully!", "Save", JOptionPane.INFORMATION_MESSAGE);
					inputPanel.repaint(); 
				}
			}
		});

		inputPanel.add(weightsPanel, BorderLayout.WEST);
		inputPanel.add(graphPanel, BorderLayout.CENTER);
		inputPanel.add(controlPanel, BorderLayout.EAST);
	}

	private void createOutputPanel() {
		outputPanel = new JPanel(new BorderLayout());

		JPanel graphPanel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				drawGraph(g);  
			}
		};
		graphPanel.setPreferredSize(new Dimension(500, 300)); 
		graphPanel.setBorder(BorderFactory.createTitledBorder("Graph"));

		JTextArea outputArea = new JTextArea();
		outputArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(outputArea);

		outputPanel.add(scrollPane, BorderLayout.CENTER);
		outputPanel.add(graphPanel, BorderLayout.SOUTH); 

		JPanel bottomPanel = new JPanel();
		JButton goBackButton = new JButton("Go Back");
		goBackButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Input"); 
			}
		});
		bottomPanel.add(goBackButton);

		outputPanel.add(bottomPanel, BorderLayout.SOUTH);
	}

	private void drawGraph(Graphics g) {

		g.setColor(Color.ORANGE);
		g.fillOval(50, 100, 30, 30); 
		g.fillOval(100, 50, 30, 30); 
		g.fillOval(200, 50, 30, 30); 
		g.fillOval(300, 50, 30, 30); 
		g.fillOval(350, 100, 30, 30); 
		g.fillOval(300, 150, 30, 30); 
		g.fillOval(200, 150, 30, 30); 
		g.fillOval(100, 150, 30, 30); 
		g.fillOval(150, 100, 30, 30); 

		g.setColor(Color.BLACK);
		g.drawString("A", 60, 120);
		g.drawString("B", 110, 70);
		g.drawString("C", 210, 70);
		g.drawString("D", 310, 70);
		g.drawString("E", 360, 120);
		g.drawString("F", 310, 170);
		g.drawString("G", 210, 170);
		g.drawString("H", 110, 170);
		g.drawString("I", 165, 120);

		drawEdgeWithWeight(g, 75, 105, 105, 75, "a - b"); 
		drawEdgeWithWeight(g, 75, 125, 105, 155, "a - h"); 
		drawEdgeWithWeight(g, 115, 80, 115, 150, "b - h"); 
		drawEdgeWithWeight(g, 130, 65, 200, 65, "b - c"); 
		drawEdgeWithWeight(g, 125, 155, 155, 125, "h - i"); 
		drawEdgeWithWeight(g, 130, 165, 200, 165, "h - g"); 
		drawEdgeWithWeight(g, 175, 125, 205, 155, "i - g"); 
		drawEdgeWithWeight(g, 230, 65, 300, 65, "c - d"); 
		drawEdgeWithWeight(g, 225, 75, 305, 155, "c - f"); 
		drawEdgeWithWeight(g, 230, 165, 300, 165, "g - f"); 
		drawEdgeWithWeight(g, 325, 75, 355, 105, "d - e"); 
		drawEdgeWithWeight(g, 315, 150, 315, 80, "d - f"); 
		drawEdgeWithWeight(g, 325, 155, 355, 125, "f - e"); 
		drawEdgeWithWeight(g, 175, 105, 205, 75, "c - i"); 
	}

	private void drawEdgeWithWeight(Graphics g, int x1, int y1, int x2, int y2, String edge) {
		g.drawLine(x1, y1, x2, y2); 
		int midX = (x1 + x2) / 2;
		int midY = (y1 + y2) / 2;
		g.setColor(Color.BLACK);
		g.drawString(weights.getOrDefault(edge, 0).toString(), midX, midY); 
	}

	private boolean collectWeights() {
		weights.clear();
		try {
			for (String edge : edgeWeightFields.keySet()) {
				String weightText = edgeWeightFields.get(edge).getText();
				int weight = weightText.isEmpty() ? 0 : Integer.parseInt(weightText);
				weights.put(edge, weight);
			}
			return true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Please enter valid integer weights.", "Input Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}

	private void refreshWeights() {
		for (JTextField field : edgeWeightFields.values()) {
			field.setText("");
		}
		weights.clear();
	}

	private String getSelectedAlgorithm(JRadioButton kruskalButton, JRadioButton primButton) {
		if (kruskalButton.isSelected()) {
			return "Kruskal";
		} else if (primButton.isSelected()) {
			return "Prim";
		}
		return null;
	}

	private String runAlgorithm(String algorithm) {
		if ("Prim".equals(algorithm)) {
			return primAlgorithm();
		} else if ("Kruskal".equals(algorithm)) {
			return kruskalAlgorithm();
		}
		return "No algorithm selected";
	}

	private String kruskalAlgorithm() {

		List<Edge> allEdges = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : weights.entrySet()) {
			String[] nodes = entry.getKey().split(" - ");
			String source = nodes[0];
			String target = nodes[1];
			int weight = entry.getValue();
			allEdges.add(new Edge(source, target, weight));
		}

		Collections.sort(allEdges, Comparator.comparingInt(e -> e.weight));

		Map<String, String> parent = new HashMap<>();
		for (Edge edge : allEdges) {
			parent.put(edge.source, edge.source);
			parent.put(edge.target, edge.target);
		}

		List<Edge> mstEdges = new ArrayList<>();
		for (Edge edge : allEdges) {
			String rootSource = find(parent, edge.source);
			String rootTarget = find(parent, edge.target);
			if (!rootSource.equals(rootTarget)) {
				mstEdges.add(edge);
				union(parent, rootSource, rootTarget);
			}
		}

		StringBuilder result = new StringBuilder("Kruskal's Algorithm MST:\n");
		for (Edge edge : mstEdges) {
			result.append(edge.source).append(" - ").append(edge.target)
			.append(" (").append(edge.weight).append(")\n");
		}
		return result.toString();
	}

	private String find(Map<String, String> parent, String node) {
		if (!parent.get(node).equals(node)) {
			parent.put(node, find(parent, parent.get(node))); 
		}
		return parent.get(node);
	}

	private void union(Map<String, String> parent, String rootSource, String rootTarget) {
		parent.put(rootSource, rootTarget); 
	}

	private String primAlgorithm() {

		Map<String, List<Edge>> adjList = createAdjacencyList();

		Set<String> visited = new HashSet<>();
		PriorityQueue<Edge> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

		visited.add("a");
		addEdges("a", adjList, minHeap, visited);

		List<Edge> mstEdges = new ArrayList<>();

		while (!minHeap.isEmpty()) {
			Edge edge = minHeap.poll();
			if (!visited.contains(edge.target)) {
				mstEdges.add(edge);
				visited.add(edge.target);
				addEdges(edge.target, adjList, minHeap, visited);
			}
		}

		StringBuilder result = new StringBuilder("Prim's Algorithm MST:\n");
		for (Edge edge : mstEdges) {
			result.append(edge.source).append(" - ").append(edge.target)
			.append(" (").append(edge.weight).append(")\n");
		}
		return result.toString();
	}

	private void addEdges(String node, Map<String, List<Edge>> adjList,
	                      PriorityQueue<Edge> minHeap, Set<String> visited) {
		for (Edge edge : adjList.getOrDefault(node, new ArrayList<>())) {
			if (!visited.contains(edge.target)) {
				minHeap.offer(edge);
			}
		}
	}

	private Map<String, List<Edge>> createAdjacencyList() {
		Map<String, List<Edge>> adjList = new HashMap<>();

		for (Map.Entry<String, Integer> entry : weights.entrySet()) {
			String[] nodes = entry.getKey().split(" - ");
			String source = nodes[0];
			String target = nodes[1];
			int weight = entry.getValue();

			adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(new Edge(source, target, weight));
			adjList.computeIfAbsent(target, k -> new ArrayList<>()).add(new Edge(target, source, weight)); 
		}

		return adjList;
	}

	private static class Edge {
		String source, target;
		int weight;

		Edge(String source, String target, int weight) {
			this.source = source;
			this.target = target;
			this.weight = weight;
		}
	}

	private void showOutput(String result) {
		outputPanel.removeAll();  

		Set<String> algorithmOutputEdges = new HashSet<>();

		if (result.contains("Kruskal's")) {
			if(result.contains("a - b")   || result.contains("b - a")) {
				algorithmOutputEdges.add("a-b");
			}
			if(result.contains("a - h")  || result.contains("h - a")) {
				algorithmOutputEdges.add("a-h");
			}
			if(result.contains("b - h") || result.contains("h - b")) {
				algorithmOutputEdges.add("b-h");
			}
			if(result.contains("b - c") || result.contains("c - b")) {
				algorithmOutputEdges.add("b-c");
			}
			if(result.contains("h - i") || result.contains("i - h")) {
				algorithmOutputEdges.add("h-i");
			}
			if(result.contains("h - g") || result.contains("g - h")) {
				algorithmOutputEdges.add("h-g");
			}
			if(result.contains("i - g") || result.contains("g - i")) {
				algorithmOutputEdges.add("i-g");
			}
			if(result.contains("c - d") || result.contains("d - c")) {
				algorithmOutputEdges.add("c-d");
			}
			if(result.contains("f - c") || result.contains("c - f")) {
				algorithmOutputEdges.add("c-f");
			}
			if(result.contains("g - f") || result.contains("f - g")) {
				algorithmOutputEdges.add("g-f");
			}
			if(result.contains("d - e") || result.contains("e - d")) {
				algorithmOutputEdges.add("d-e");
			}
			if(result.contains("d - f") || result.contains("f - d")) {
				algorithmOutputEdges.add("d-f");
			}
			if(result.contains("f - e") || result.contains("e - f")) {
				algorithmOutputEdges.add("f-e");
			}
			if(result.contains("c - i") || result.contains("i - c")) {
				algorithmOutputEdges.add("c-i");
			}

		} else if (result.contains("Prim's")) {
			if(result.contains("a - b") || result.contains("b - a")) {
				algorithmOutputEdges.add("a-b");
			}
			if(result.contains("a - h")   || result.contains("h - a")) {
				algorithmOutputEdges.add("a-h");
			}
			if(result.contains("b - h")  || result.contains("h - b")) {
				algorithmOutputEdges.add("b-h");
			}
			if(result.contains("b - c") || result.contains("c - b")) {
				algorithmOutputEdges.add("b-c");
			}
			if(result.contains("h - i") || result.contains("i - h")) {
				algorithmOutputEdges.add("h-i");
			}
			if(result.contains("h - g") || result.contains("g - h")) {
				algorithmOutputEdges.add("h-g");
			}
			if(result.contains("i - g") || result.contains("g - i")) {
				algorithmOutputEdges.add("i-g");
			}
			if(result.contains("c - d") || result.contains("d - c")) {
				algorithmOutputEdges.add("c-d");
			}
			if(result.contains("f - c") || result.contains("c - f")) {
				algorithmOutputEdges.add("c-f");
			}
			if(result.contains("g - f") || result.contains("f - g")) {
				algorithmOutputEdges.add("g-f");
			}
			if(result.contains("d - e") || result.contains("e - d")) {
				algorithmOutputEdges.add("d-e");
			}
			if(result.contains("d - f") || result.contains("f - d")) {
				algorithmOutputEdges.add("d-f");
			}
			if(result.contains("f - e") || result.contains("e - f")) {
				algorithmOutputEdges.add("f-e");
			}
			if(result.contains("c - i") || result.contains("i - c")) {
				algorithmOutputEdges.add("c-i");
			}
		}

		JPanel outputContainer = new JPanel(new BorderLayout());
		JPanel graphPanel = createGraphPanel(algorithmOutputEdges);  
		outputContainer.add(graphPanel, BorderLayout.WEST);
		JPanel resultPanel = createResultPanel(result);
		outputContainer.add(resultPanel, BorderLayout.CENTER);
		outputPanel.add(outputContainer, BorderLayout.CENTER);

		JPanel bottomPanel = new JPanel();
		JButton goBackButton = new JButton("Go Back");
		goBackButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Input"); 
			}
		});
		bottomPanel.add(goBackButton);
		outputPanel.add(bottomPanel, BorderLayout.SOUTH);

		outputPanel.revalidate();
		outputPanel.repaint();

		cardLayout.show(mainPanel, "Output");
	}

	private JPanel createGraphPanel(Set<String> algorithmOutputEdges) {
		JPanel graphPanel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(Color.ORANGE);
				g.fillOval(50, 100, 30, 30); 
				g.fillOval(100, 50, 30, 30); 
				g.fillOval(200, 50, 30, 30); 
				g.fillOval(300, 50, 30, 30); 
				g.fillOval(350, 100, 30, 30); 
				g.fillOval(300, 150, 30, 30); 
				g.fillOval(200, 150, 30, 30); 
				g.fillOval(100, 150, 30, 30); 
				g.fillOval(150, 100, 30, 30); 

				g.setColor(Color.BLACK);
				g.drawString("A", 60, 120);
				g.drawString("B", 110, 70);
				g.drawString("C", 210, 70);
				g.drawString("D", 310, 70);
				g.drawString("E", 360, 120);
				g.drawString("F", 310, 170);
				g.drawString("G", 210, 170);
				g.drawString("H", 110, 170);
				g.drawString("I", 165, 120);

				if (algorithmOutputEdges.contains("a-b")) drawEdgeWithWeight(g, 75, 105, 105, 75, "a - b"); 
				if (algorithmOutputEdges.contains("a-h")) drawEdgeWithWeight(g, 75, 125, 105, 155, "a - h"); 
				if (algorithmOutputEdges.contains("b-h")) drawEdgeWithWeight(g, 115, 80, 115, 150, "b - h"); 
				if (algorithmOutputEdges.contains("b-c")) drawEdgeWithWeight(g, 130, 65, 200, 65, "b - c"); 
				if (algorithmOutputEdges.contains("h-i")) drawEdgeWithWeight(g, 125, 155, 155, 125, "h - i"); 
				if (algorithmOutputEdges.contains("h-g")) drawEdgeWithWeight(g, 130, 165, 200, 165, "h - g"); 
				if (algorithmOutputEdges.contains("i-g")) drawEdgeWithWeight(g, 175, 125, 205, 155, "i - g"); 
				if (algorithmOutputEdges.contains("c-d")) drawEdgeWithWeight(g, 230, 65, 300, 65, "c - d"); 
				if (algorithmOutputEdges.contains("c-f")) drawEdgeWithWeight(g, 225, 75, 305, 155, "c - f"); 
				if (algorithmOutputEdges.contains("g-f")) drawEdgeWithWeight(g, 230, 165, 300, 165, "g - f"); 
				if (algorithmOutputEdges.contains("d-e")) drawEdgeWithWeight(g, 325, 75, 355, 105, "d - e"); 
				if (algorithmOutputEdges.contains("f-d")) drawEdgeWithWeight(g, 315, 150, 315, 80, "f - d"); 
				if (algorithmOutputEdges.contains("f-e")) drawEdgeWithWeight(g, 325, 155, 355, 125, "f - e"); 
				if (algorithmOutputEdges.contains("c-i")) drawEdgeWithWeight(g, 175, 105, 205, 75, "c - i"); 
			}
		};
		graphPanel.setPreferredSize(new Dimension(500, 300));
		graphPanel.setBorder(BorderFactory.createTitledBorder("Graph"));
		return graphPanel;
	}

	private JPanel createResultPanel(String result) {
		JPanel resultPanel = new JPanel(new BorderLayout());
		JTextArea outputArea = new JTextArea(result);
		outputArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(outputArea);
		resultPanel.add(scrollPane, BorderLayout.CENTER);
		return resultPanel;
	}

	public static void main(String[] args) {
		new GraphGUI();
	}
}