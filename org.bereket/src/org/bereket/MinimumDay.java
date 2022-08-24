package org.bereket;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Problem:  have an an array integers greater than zero e.g [1,5,3] decrease the array with equal amount in each element until all elements are zero. The output should yield the minimum out to complete the rotation. 
 * e.g   
 * [1,5,3] 0
 * [0,4,2] 1
 * [0,2,0] 2
 * [0,0,0] 3
 * The out put should be 3 
 * @author bereket
 *
 */

public class MinimumDay {

	public static void main(String[] args) {

		List<Integer> parcels = new ArrayList<Integer>();
		parcels.add(3);
		parcels.add(5);
		parcels.add(2);
		parcels.add(2);
		parcels.add(2);
		parcels.add(0);

		Collections.sort(parcels);
		int numberofDays = 0;

		while (parcels.size() != 0) {
			numberofDays = numberofDays + 1;

			int firstItem = parcels.get(0);
			for (int n : parcels) {
				System.out.print(n + " ");
			}
			System.out.println();
			int index = 0;
			List<Integer> tempList = new ArrayList<Integer>();
			for (int i = 0; i < parcels.size(); i++) {
				if (parcels.get(i) - firstItem != 0) {
					tempList.add(parcels.get(i));
				}
			}

			for (int n : tempList) {
				System.out.print(n + " ");
			}

			parcels = tempList;
		}
		System.out.println();

		System.out.println(numberofDays);

	}

}
