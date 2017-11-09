*Arrays*

Before forming an array one must import your java util

import java.util.ArrayList

*Initialising array structure*

ArrayList<datatype> codename = new
ArrayList<datatype>();

*Inserting data*

codename.add(index, data);

//index is the position of the data in the array
//starts with 0

*Printing data*

System.out.println(codename.get(index number));

*Printing an entire array*

//this utilises a for loop
//2 ways to do this

//The easy way

for (datatype codename2 : codename) {
	
	System.out.println(codename2);

}

for (int i = 0; i < codename.size()) {
	
	System.out.println(codename.get(i));
}

*HashMaps*

//tl;dr Hashmaps work a lot like dictionaries where you assign a key and later reference said key to pull up data

HashMap<dataype (keyname), datatype> codename = new
	HashMap<>();

//There needs to be 2 data at least because it needs a key to pull info
//It's basically the same shit as Arrays but with a key differences

*Inputting data*

codename.put(keyname, data);