class Solution {
    public class Graph{
        Map<Integer, List<Integer>> adjList;

        Graph(){
            adjList = new HashMap<>();
        }
        public List<Integer> getConnections(int u){
            return adjList.getOrDefault(u, new ArrayList<>());
        }

        public void addConnection(int u ,int v){
            adjList.putIfAbsent(u,new ArrayList<>());
            adjList.putIfAbsent(v,new ArrayList<>());
            adjList.get(u).add(v);
            adjList.get(v).add(u);
            return;
        }
    }

    public void bfsTraversal(int source, Graph g , Set<Integer> visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        visited.add(source);
        while (!queue.isEmpty()){
            int u = queue.poll();
            List<Integer> conn = g.getConnections(u);
            for(int j:conn){
                if(!visited.contains(j)){
                    queue.offer(j);
                    visited.add(j);
                }
            }

        }
    }
    public int countComponents(int n, int[][] edges) {
        Graph g = new Graph();
        for (int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            g.addConnection(u,v);
        }

        // now bfs traversal
        Set<Integer> visited = new HashSet<>();
        int answer = 0;
        for (int i=0 ; i<n ; i++){
            if (!visited.contains(i)){
                answer++;
                bfsTraversal(i,g, visited);
            }
        }

        return answer;
    }
}
