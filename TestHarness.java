class TestHarness
{
    public static void GenerateSheep() {
		// public Sheep(String sName, String sFavColor, int sheight, int sweight)
Sheep [] mySheeps = new Sheep [10];
 
for (int i = 0; i < 10; i++)
{
    //get input variables;
     
    mySheeps[i] = new Sheep("Bill", "Orange", 62.1,34.1);
    
    (ListOfSheep.SheepRoster).add(mySheeps[i]);	
    //System.out.println("**** ----  Adding a sheep:");
}
		//Sheep s = new Sheep("Bill", "Orange", 62.1,34.1);
		// System.out.println("**** ----  Adding a sheep:");
		// (ListOfSheep.SheepRoster).add(s);	
	}
}