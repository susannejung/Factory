package FilEksempler;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String args[])throws IOException{
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);

        //String planName=br.readLine();
        String planName=sc.next();

        System.out.print("Enter the number of units for bill will be calculated: ");
        //int units=Integer.parseInt(br.readLine());

        int units=sc.nextInt();

        Plan p = planFactory.getPlan(planName);
        //call getRate() method and calculateBill()method of DomesticPaln.

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}//end of GenerateBill class.
