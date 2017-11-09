import java.util.*;

public class main {

    public static void main(String[] args) {
        Vector myVector = new Vector(); //name of vector is myVector
        
        //for loop that inputs the value of 'i' into each Vectory array
        //like arrays, 'first index == 0'
        for (int i = 0; i < 10; i++) { 
            
            myVector.add(i);//the value of i is added into the position of i
            
            //below, the thingy prints out the value of 0 because arrays always start with 0
            //the last element shows the current element - 1
            System.out.println("First element: " + myVector.elementAt(0) + " " + "Last Element:" + myVector.elementAt(myVector.size()-1));
            
        }
        
        int index = 3; //the variable 'index' == 3
        myVector.removeElementAt(index); //this removes the vector at index which is 3 
        
        System.out.println("/n");
        
        for (int i = 0; i < myVector.size() - 1; i++) {
            
            System.out.println(myVector.elementAt(i) + " ");//the size of the array is reduced to 9 because myVector[3] is removed
            
        }
    }
    
}