
import java.util.Scanner;
import java.util.ArrayList;
// ClassName.........: PlantsTest
// Developed By......: Lucas Hauf
// Week..............: Week 2
// Date Created......: 08/18/2015
// Purpose...........: A class to test the program

public class PlantsTest 
{
    public static void main (String [] args)
    {
        ArrayList<Plants>  OutDoorPlants = new ArrayList<Plants>();
        
        OutDoorPlants.add(new Plants("Tree",10,"None"));
       
        OutDoorPlants.add(new Plants("Shrub",6,"Blue"));
        
        OutDoorPlants.add(new Plants("Flower",4,"Pink"));
        
        for (int cnt = 0; cnt < OutDoorPlants.size(); cnt++)
        {
        System.out.println("Item:"+(cnt+1)+" Type of plant: " + OutDoorPlants.get(cnt).getPlantType() + ", Plant height: " + OutDoorPlants.get(cnt).getHeight() + ", Bloom color: " + OutDoorPlants.get(cnt).getFlowerColor());
        }
        System.out.println("Pick a plant to add (Tree, Bush, or Flower)");
        
       Scanner userInput = new Scanner(System.in);
       
       String pT;
       int pH;
       String pC;
       
       pT = userInput.next();
               System.out.println("What is the plant height?");
            pH = userInput.nextInt();
            System.out.println("What is the bloom color? If none type NONE");
       pC = userInput.next();
       
       Plants pPlant = new Plants();
       
       pPlant.setPlantType(pT);
       pPlant.setHeight(pH);
       pPlant.setFlowerColor(pC);
       
       OutDoorPlants.add(pPlant);
      
        for (int cnt = 0; cnt < OutDoorPlants.size(); cnt++)
        {
        System.out.println("Item:"+(cnt+1)+" Type of plant: " + OutDoorPlants.get(cnt).getPlantType() + ", Plant height: " + OutDoorPlants.get(cnt).getHeight() + ", Bloom color: " + OutDoorPlants.get(cnt).getFlowerColor());
        }
        System.out.println("Pick an Item number to delete");
        int delete;
        delete = userInput.nextInt();
        if (delete == 1)
            OutDoorPlants.remove(0);
        if (delete == 2)
         OutDoorPlants.remove(1);
            if (delete == 3)
                 OutDoorPlants.remove(2);
        if (delete == 4)
             OutDoorPlants.remove(3);
        
               for (int cnt = 0; cnt < OutDoorPlants.size(); cnt++)
        {
        System.out.println("Item:"+(cnt+1)+" Type of plant: " + OutDoorPlants.get(cnt).getPlantType() + ", Plant height: " + OutDoorPlants.get(cnt).getHeight() + ", Bloom color: " + OutDoorPlants.get(cnt).getFlowerColor());
        }  
             System.out.println("Pick an Item number to change");  
             int add;
             String aP;
             int aH;
             String aC;
             add = userInput.nextInt();
             if(add == 1)
             { System.out.println("Pick a  plant to add (Tree, Bush, or Flower)");
            aP = userInput.next();
              System.out.println("What is the plant height?");
              aH = userInput.nextInt();
              System.out.println("What is the bloom color? If none type NONE");
              aC = userInput.next();
              pPlant.setPlantType(aP);
       pPlant.setHeight(aH);
       pPlant.setFlowerColor(aC);
       OutDoorPlants.set(0, pPlant);
         for (int cnt = 0; cnt < OutDoorPlants.size(); cnt++)
        {
        System.out.println("Item:"+(cnt+1)+" Type of plant: " + OutDoorPlants.get(cnt).getPlantType() + ", Plant height: " + OutDoorPlants.get(cnt).getHeight() + ", Bloom color: " + OutDoorPlants.get(cnt).getFlowerColor());
        }  
          add = userInput.nextInt();}
          if(add == 2)
          { System.out.println("Pick a  plant to add (Tree, Bush, or Flower)");
            aP = userInput.next();
              System.out.println("What is the plant height?");
              aH = userInput.nextInt();
              System.out.println("What is the bloom color? If none type NONE");
              aC = userInput.next();
              pPlant.setPlantType(aP);
       pPlant.setHeight(aH);
       pPlant.setFlowerColor(aC);
       OutDoorPlants.set(1, pPlant);
         for (int cnt = 0; cnt < OutDoorPlants.size(); cnt++)
        {
        System.out.println("Item:"+(cnt+1)+" Type of plant: " + OutDoorPlants.get(cnt).getPlantType() + ", Plant height: " + OutDoorPlants.get(cnt).getHeight() + ", Bloom color: " + OutDoorPlants.get(cnt).getFlowerColor());
        }  
          add = userInput.nextInt();}
              if(add == 3)
              { System.out.println("Pick a  plant to add (Tree, Bush, or Flower)");
            aP = userInput.next();
              System.out.println("What is the plant height?");
              aH = userInput.nextInt();
              System.out.println("What is the bloom color? If none type NONE");
              aC = userInput.next();
              pPlant.setPlantType(aP);
       pPlant.setHeight(aH);
       pPlant.setFlowerColor(aC);
       OutDoorPlants.set(2, pPlant);
         for (int cnt = 0; cnt < OutDoorPlants.size(); cnt++)
        {
        System.out.println("Item:"+(cnt+1)+" Type of plant: " + OutDoorPlants.get(cnt).getPlantType() + ", Plant height: " + OutDoorPlants.get(cnt).getHeight() + ", Bloom color: " + OutDoorPlants.get(cnt).getFlowerColor());
        }  
              }
    }
}
