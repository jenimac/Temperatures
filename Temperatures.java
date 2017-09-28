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
        for(int index = 0; index<days.length; index++)  {
            out.print(days[index] + "   ");
        }
        
        out.print("\n");
        
        for(int timeIndex=0; timeIndex<times.length;timeIndex++)  {
            out.print(times[timeIndex] + "  ");
            for(int dayIndex=0; dayIndex<days.length; dayIndex++)  {
                out.print(temps[timeIndex][dayIndex] + "  ");
            }
            out.print("\n");
        }    
      
        System.out.print("\n");
            
        System.out.println("");
        System.out.println("Based on that data, the following are the average temperatures for the week.");
        float daysAverage =0;
        float timeAverage = 0;
        for(int daysIndex = 0; daysIndex < days.length; daysIndex++) {
            float dayTotal = 0;
            for(int timeIndex = 0; timeIndex < times.length; timeIndex++) {
                dayTotal = dayTotal + temps[timeIndex][daysIndex];
            }
            daysAverage = dayTotal / times.length;
            out.println(days[daysIndex] + ":  " + daysAverage);
            }
            
        out.print("\n");
        
        for(int timeIndex = 0; timeIndex < times.length; timeIndex++) {
            float timeTotal = 0;
            for(int daysIndex = 0; daysIndex < days.length; daysIndex++) {
                timeTotal = timeTotal + temps[timeIndex][daysIndex];
            }
            timeAverage = timeTotal / days.length;
            out.println(times[timeIndex] + ":  " + timeAverage);
        }
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
   
}  
   
    
    
    
        
      
        
       