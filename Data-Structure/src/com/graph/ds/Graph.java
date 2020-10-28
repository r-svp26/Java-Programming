package com.graph.ds;

public class Graph {

	private int V; // Number of Vertices in Graph
	private int E; // Number of Edges in Graph
	private int[][] adjMatrix;

	public Graph(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adjMatrix = new int[nodes][nodes];
	}

	public void addEdge(int u, int v) {
		adjMatrix[u][v] = 1;
		adjMatrix[v][u] = 1; // It is an Undirected Graph
		E++;
	}

	/* String representation of the Graph */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " Vertices, " + E + " Edges" + " \n");
		for (int i = 0; i < V; i++) {
			sb.append(i + ": ");
			for (int j : adjMatrix[i]) {
				sb.append(j + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);

		System.out.println("GRAPH REPRESENTATION");
		System.out.println(g);

	}
}
