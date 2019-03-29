/**
  Implement an ordered list of integer elements, including
  both data and operations.
 */

public class OrderedList_inArraySlots {

    private List_inArraySlots list;

    public OrderedList_inArraySlots() {
	list = new List_inArraySlots();
    }

    public int size() {
	return list.size();
    }

    public String toString() {
	return list.toString();
    }

    public boolean add( int value) {
	int index = (list.size() + 1) /2;
	int counter = 1;
	while (value != list.get(index) && index > 0 && index < size()) {
	    counter++;
	    if (value > list.get(index))
		index += (int)(list.size() * (1.0/Math.pow(2, counter)));
	    else if (value < list.get(index))
		index -= (int)(list.size() * (1.0/Math.pow(2, counter)));
	}
	list.add(index, value);
	return true;
    }
}
