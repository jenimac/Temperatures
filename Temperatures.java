import static java.lang.System.out;


public class Temperatures
{
    
    public static void main(String[] args)
    {

        
        int [][]temps = {{68, 70, 76, 70, 68, 71, 75},
                        {76, 76, 87, 84, 82, 75, 83},
                        {73, 72, 81, 78, 76, 73, 77},
                        {64, 65, 69, 68, 70, 74, 72}};
        String []days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};                
        System.out.println("Temperature Calculator");
        System.out.println("");
        System.out.println("The data provided are:");
        String []times ={"7:00 AM","3:00 PM","7:00 PM","3:00 AM"};
        for(int j = 0; j < 4; j++)
            {
                System.out.print("\n");            
                System.out.print(times[j] + " ");
                tempChart(temps);
            }  
        
        System.out.print("\n");
            
        System.out.println("");
        System.out.println("Based on that data, the following are the average temperatures for the week.");
        
        int rowTotal = 0;
        
        int rowAverage7am = 0;
        int rowAverage3pm = 0;
        int rowAverage7pm = 0;
        int rowAverage3am = 0;
        for(int i = 0; i < temps.length; i++) {
            rowTotal += temps[0][i];
            rowAverage7am = rowTotal/7;
            rowTotal += temps[1][i];
            rowAverage3pm = rowTotal/7;
            rowTotal += temps[2][i];
            rowAverage7pm = rowTotal/7;
            rowTotal += temps[3][i];
            rowAverage3am = rowTotal/7;
        }
        out.println("7 AM:  " + rowAverage7am);
        out.println("3 PM:  " + rowAverage3pm);
        out.println("7 PM:  " + rowAverage7pm);
        out.println("3 AM:  " + rowAverage3am);
    
        
            
        }    
                    
        
    public static void tempChart(int x[][])
    {
     
        System.out.print("\n");
        for(int row=0;row<x.length;row++)
        {
            System.out.print("");
            for(int column=0;column<x[row].length;column++)
            {

                System.out.print("\t" + x[row][column]);
            }
            System.out.println("\n");      
        }
    }    
    //public static int Average(int [][]values)
    {
        
    }
}  
   
    
    
    
        
      
        
       