public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        
        int eggsPerChicken = 4;
        int chickenCount = 8;
        int totalEggs = eggsPerChicken * chickenCount;
        System.out.println("On monday, the farmer got "+totalEggs+" eggs.");
        
        int b;
        b = ++chickenCount;      
        int totalEggs11 = b * eggsPerChicken;
        System.out.println("On tuesday, the farmer got "+totalEggs11+" eggs.");
        
        
        int c= b/2;
        int totalEggs22 = c * eggsPerChicken;
        System.out.println("On wednesday, the farmer got "+ totalEggs22 + " eggs.");
       
        int totalEggsAll=totalEggs + totalEggs11 + totalEggs22;
        System.out.println("In total, the farmer got "+totalEggsAll+" eggs.");
        
        
        
    }   
}
