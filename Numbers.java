import java.util.ArrayList;

public class Numbers{
	public static void numberMet(String orden, ArrayList <Integer> listN){
		Integer[] intList = new Integer[listN.size()];

		for (int i = 0; i < listN.size(); i++)
			intList[i] = listN.get(i);
	
		if(orden.equals("A"))
			Sorting.selectionSort(intList);
		else
			Sorting.insertionSort(intList);
	}
}