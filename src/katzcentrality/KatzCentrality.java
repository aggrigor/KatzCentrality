
package katzcentrality;


import java.util.Arrays;


/**Katz Centrality Project - uth
 * 
 * @author Aggeliki Grigoropoulou
 * AEM : 699
 *
 * Spring Semester 2014
 */
public class KatzCentrality 
{
    
    static int[][] Adjacency;
    static double a;   //attenuation factor
    static int k;     // total number of k degree connections between nodes i and j
    static int i;
    static int j;
    static double x1[][];
    static double sum;
    static int weight;
    static double init_vertex_cent; //initial vertex centrality
    static double kc[];     
    static int NoNodes;
    
    public static void main(String[] args)
    {
        x1 = new double[4][4];
        kc = new double[4];
        NoNodes = 3;
        a= 0.5; 
        k=3;   
        i=0;
        j=0;
        weight=1;
        init_vertex_cent = 0.37;
        
        Adjacency = new int[NoNodes][NoNodes];
        Adjacency[0][0]=0;
        Adjacency[0][1]=0;
        Adjacency[0][2]=1;
        Adjacency[1][0]=1;
        Adjacency[1][1]=1;
        Adjacency[1][2]=1;
        Adjacency[2][0]=1;
        Adjacency[2][1]=1;
        Adjacency[2][2]=0;
        
         //katz centrality calculation 
         for (i=0; i< k; i++)
         {
             for(j=0; j<k; j++)
             {
                    x1[i][j]=(a*Adjacency[i][j]*init_vertex_cent)+weight;
                    kc[i] = kc[i]+x1[i][j]*x1[i][j];          
                   //System.out.print(x1[i][j]+" ");
             }     
                    System.out.print("katz centrality of node "+i+" is : "+kc[i]+" ");
                    System.out.print("\n");
         }
         System.out.print("------------------------------------\n");
         printAr(Adjacency);
         System.out.print("------------------------------------\n");
         /*  for (double[] ar : x1)
         {
                System.out.println(Arrays.toString(ar)); 
         }*/
    }
    public static void printAr(int[][] Array)
    {
         System.out.print("Adjacency matrix : \n");
         for (i=0; i<k; i++)
         {
             for(j=0; j<k; j++)
             {
                 System.out.print(Adjacency[i][j]+" ");
             }
             System.out.print("\n");
         }
    }
 }
    

