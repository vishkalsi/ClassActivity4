import java.util.ArrayList;
class ListOfSheep
{

public static ArrayList<Sheep> SheepRoster=new ArrayList<>();

public static int AddSheep(Sheep sheepToAdd)
{
int numberOfSheep=0;

(ListOfSheep.SheepRoster).add(sheepToAdd);
		System.out.println("Added a sheep " + sheepToAdd.SheepName);
		return numberOfSheep;
}


public static void ListTheSheep() {
    for (Sheep sheep : SheepRoster) {
        System.out.println(sheep.SheepName);
        System.out.println(sheep.SheepFavColor);
        
               
    }
}
}