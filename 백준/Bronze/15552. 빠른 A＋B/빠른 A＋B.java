 import java.util.*;
 import java.io.*;

 public class Main{
     public static void main(String[] args) throws Exception{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

         int n = Integer.parseInt(br.readLine());

         for(int i=0; i<n; i++){
             int n1, n2;
             String line = br.readLine();
             String[] split = line.split(" ");

             n1 = Integer.parseInt(split[0].trim());
             n2 = Integer.parseInt(split[1].trim());

             bw.write(n1+n2 + "\n");
         }
         bw.flush();
     }
 }