
// ClassName.........: Plants
// Developed By......: Lucas Hauf
// Week..............: Week 2
// Date Created......: 08/18/2015
// Purpose...........: A class to hold the methods
public class Plants
{

    Plants()
    {
        
    }

        
    
        private String FlowerColor; //a variable for the color
  
        private String PlantType; // a variable to hold the type of plant the user enters
    
        private int Height; //a variable to hold the height the user enters
        
        
    
      
    public Plants ( String Type, int Size, String Bloom)
    {
        PlantType = Type;
       
        Height = Size;
        
        FlowerColor = Bloom;              
    }
       public String getPlantType()
       {
           return PlantType;
           
          
       }
       public int getHeight()
       {
           return Height;
       }
       public String getFlowerColor()
       {
          return FlowerColor; 
       }
       public void setPlantType(String Type)
       {
           PlantType = Type;
          
       }
       public void setHeight(int Size)
       {
           Height = Size;
       }
       public void setFlowerColor(String Bloom)
       {
           FlowerColor = Bloom;
       }
       
      
}
