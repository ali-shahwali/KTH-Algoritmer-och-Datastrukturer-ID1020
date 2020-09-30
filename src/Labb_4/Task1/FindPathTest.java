package Labb_4.Task1;
import Labb_4.*;
import java.util.Scanner;
public class FindPathTest
{
    public static void main(String[] args)
    {
        SymbolGraph sg = new SymbolGraph("C:\\Users\\ali_z\\IdeaProjects\\KTH-Algoritmer-Datastrukturer-ID1020\\src\\Labb_4\\TheDatabase.txt", " ");
        Scanner scan = new Scanner(System.in);
        Graph g = sg.graph();
        System.out.println("Enter source state");
        String sourceState = scan.nextLine().toUpperCase();
        System.out.println("What state do you want the path to?");
        String endState = scan.nextLine().toUpperCase();

        int start = sg.indexOf(sourceState);
        int end = sg.indexOf(endState);
        DepthFirstPaths dfs = new DepthFirstPaths(g,start);
        if (dfs.hasPathTo(end))
        {
            System.out.println(sg.nameOf(start) + " to " + sg.nameOf(end));
            for (int x : dfs.pathTo(end))
            {
                if (x == start)
                    System.out.println(sg.nameOf(x));
                else
                    System.out.println("-" + sg.nameOf(x));
            }
            System.out.println();
        }
        else
            System.out.println(sg.nameOf(start) + "  not connected " + sg.nameOf(end));
    }
}
