package ArrayDemonstration;

class Array {
	private int[] items; //Stores the array items 
	private int count;

	//Call Array Constructor 
	public Array(int length) {
		this.items = new int[length];
	}

	public void insert(int item) {
		//If the array is full, resize it 
		if(items.length == count) {
			// To resize the array, there are three steps.

			// Step-1: Create a new array ,(twice the size)
			int[] newItems = new int[count * 2];
			//Step-2: Copy the existing items
			for(int i = 0; i < count ; i++)
				newItems[i] = items[i];
			//Step-3: Set items to this new array
			items = newItems;
		}
		//Add the new item at the end 
		items[count++] =item;
	}

	public void removeAt(int index) {
		//Validate the index
		if (index < 0 || index >= count)
			throw new IllegalArgumentException("Index is not valid...");
		//Shift the items to the left and fill the hole	

		/*Logic Is: 
		 * Example: [10,20,30,40] 
		 * let remove the index 1 i.e no. 20
		 * so value of index 2 shifted to 1
		 * and value of index 3 shifted to 2
		 * 
		 */

		for (int i =index ; i < count; i++)
			items[i] = items [i+1];
		count--;

	}

	public int indexOf(int item) {
		//If we find ,return index
		for (int i = 0; i < count; i++) {
			if(items[i] == item) {
				return i;
			}
		}
		//Otherwise , return -1
		return -1;
	}


	public void print() {
		// System.out.println(items.length);
		for (int i = 0; i < items.length ; i++) {
			System.out.println(items[i]);
		}
	}
    }


  public class ArrayExampleTwo {

	public static void main(String[] args) {
		try {
			Array elements = new Array(3);

			elements.insert(10);
			elements.insert(20);
			elements.insert(30);
			elements.insert(40);
			elements.removeAt(1);
			System.out.println(elements.indexOf(10));
			elements.print();
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}


	}

}
