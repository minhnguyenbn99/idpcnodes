package idpcduonnodes;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public void main(String arg) {
		ArrayList<Node> nodes = new ArrayList<Node>();
		ArrayList<Domain> domains = new ArrayList<Domain>();

		try{
			int count = 0;
        	String url = "C:\\Users\\Admin\\Desktop\\idpc_ndu_52_6_204.txt";
            FileInputStream fileinputstream =  new FileInputStream(url);
            Scanner scan2 = new Scanner(fileinputstream);	               
            while (scan2.hasNextLine()) {
            	String line = scan2.nextLine();
                String[] line_array = line.split(" ");
                if(count == 0) {
                	int numberNode = Integer.parseInt(line_array[0]);
                	for(int i= 0; i <numberNode; i++ ) {
                	Node node = new Node(i);
                	nodes.add(node);
                }
                	int numberDomain = Integer.parseInt(line_array[1]);
                	for(int j = 0; j < numberDomain; j++ ) {
                	Domain domain = new Domain(j);
                	domains.add(domain);
                	
                	}
//                Node node = new Node(Double.parseDouble(line_array[0]), Double.parseDouble(line_array[1]), line_array[2] );
//                nodes.add(node);
                	
             }     
                if(count == 1 ) {
                	Node sourceNode = new Node(1);
                	sourceNode.isTheSourceNode(nodes.get(Integer.parseInt(line_array[0])-1));
                	
                	Node terminalNode = new Node(Integer.parseInt(line_array[1])-1);
                	terminalNode.isTheTerminalNode(nodes.get(Integer.parseInt(line_array[1])-1));

                }
                if(count >= 2 && count <=7) {
                int numberCity = line_array.length;
                for(int a =0; a< numberCity; a++) {
                domains.get(count-2).constainNode(domains.get(count-2),nodes.get(Integer.parseInt(line_array[a+1])));
                }
                	}
                if(count>7) {
                nodes.get(Integer.parseInt(line_array[0])-1).distanceTo(nodes.get(Integer.parseInt(line_array[1])-1), Integer.parseInt(line_array[2]));
                }
                count++;
        }
		}
		catch (Exception e)
        {
            System.out.println("Error : "+e.getMessage() +" !");
        }
		
        System.out.println(nodes.get(0).nameNode);
	}
}
