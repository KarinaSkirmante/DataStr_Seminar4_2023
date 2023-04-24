package service;

import datastr.MyGraph;

public class MainService {

	public static void main(String[] args) {
		MyGraph<String> map = new MyGraph<>();

		try {
			map.addVertice("Austin");
			map.addVertice("Dallas");
			map.addVertice("Denver");
			map.addVertice("Chicago");
			map.addVertice("Houston");
			map.addVertice("Atlanta");
			map.addVertice("Washington");
			
			
			map.addEdge("Austin", "Dallas", 200);
			map.addEdge("Dallas", "Austin", 200);
			map.addEdge("Dallas", "Denver", 780);
			map.addEdge("Dallas", "Chicago", 900);
			map.addEdge("Chicago", "Denver", 1000);
			map.addEdge("Denver", "Chicago", 1000);
			map.addEdge("Austin", "Houston", 160);
			map.addEdge("Houston", "Atlanta", 800);
			map.addEdge("Atlanta", "Houston", 800);
			map.addEdge("Denver", "Atlanta", 1400);
			map.addEdge("Atlanta", "Washington", 600);
			map.addEdge("Washington", "Atlanta", 600);
			map.addEdge("Washington", "Dallas", 1300);
			
			map.print();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
