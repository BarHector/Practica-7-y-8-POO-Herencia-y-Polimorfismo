import java.util.ArrayList;

public class Strings{
    public static void words(String orden, ArrayList <String> listS){       
        String[] stringList = new String[listS.size()];

        for (int i = 0; i < listS.size(); i++)
            stringList[i] = listS.get(i);	

        if(orden.equals("A"))
			Sorting.selectionSort(stringList);
		else
			Sorting.insertionSort(stringList);
    }
}
