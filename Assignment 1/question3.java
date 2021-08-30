
import java.util.*;

public class question3 {
	private static void dfs(ArrayList<ArrayList<Integer>>graph, boolean[] visited, List<Integer> tempPath, Integer src, Integer dest) {

		if (src == dest) {
			System.out.println(tempPath);
			return;
		}

		visited[src] = true;
		for (Integer i : graph.get(src)) {
			if (!visited[i]) {
				tempPath.add(i);
				dfs(graph, visited, tempPath, i, dest);
				tempPath.remove(i);
			}
		}

		visited[src] = false;
	}
	private static void bfs(ArrayList<ArrayList<Integer>>graph, int V, int src, int dest) {
		boolean visited[] = new boolean[V];

		LinkedList<Integer>nodes = new LinkedList<Integer>();
		nodes.add(src);

		int parent[] = new int[V];
		for (int i = 0; i < V; i++)
			parent[i] = i;

		visited[src] = true;
		while (nodes.size() != 0) {
			int top = nodes.poll();

			if (top == dest)
				break;

			for (Integer neighbor : graph.get(top)) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					nodes.add(neighbor);
					parent[neighbor] = top;
				}
			}
		}
		System.out.println("The shortest path between " + src + " and " + dest + " is: ");

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(dest);
		while (parent[dest] != dest) {
			stack.push(parent[dest]);
			dest = parent[dest];
		}

		while (stack.size() != 0) {
			Integer y = (Integer) stack.pop();
			System.out.print(y + " ");
		}

	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of vertices V: ");
		int V = Integer.parseInt(sc.nextLine());

		System.out.print("Enter the number of edges E: ");
		int E = Integer.parseInt(sc.nextLine());

		ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
		for (int i = 0; i < V; i++)
			graph.add(i, new ArrayList<Integer>());

		for (int i = 0; i < E; i++) {
			System.out.println("Enter the edges(0 based indexing) in the form: u v ");
			int u = sc.nextInt();
			int v = sc.nextInt();

			graph.get(u).add(v);
			graph.get(v).add(u);
		}

		int src, dest;
		System.out.println("Enter the source and destination in the form: u v ");
		src = sc.nextInt();
		dest = sc.nextInt();

		//the shortest path b/w 2 nodes can be given by breadth first search of the graph.
		bfs(graph, V, src, dest);

		ArrayList<Integer> tempPath = new ArrayList<>();
		tempPath.add(src);
		boolean visited[] = new boolean[V];

		//to print all paths b/w 2 nodes, we can simply backtrack and print the path
		//once destination has been reached.
		System.out.println("All paths between " + src + " and " + dest + " are: ");
		dfs(graph, visited, tempPath, src, dest);


	}
}