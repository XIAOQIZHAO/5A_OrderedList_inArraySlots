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

    public int add( int value) {
	int index = (size() + 1) /2;
	int counter = 0;
	while (value != list.get(index) && index > 0 && index < size()) {
	    counter++;
	    if (value > list.get(index)){
		if (value < list.get(index + 1)) {
		    list.add(index + 1, value);
		    return index;
		}
		else
		    index += (int)(size() * (1.0/Math.pow(2, counter)));
	    }
	    else if (value < list.get(index)){
		if (value > list.get(index - 1)) {
		    list.add(index, value);
		    return index;
		}
		else
		    index -= (int)(size() * (1.0/Math.pow(2, counter)));
	    }
	}
	list.add(index, value);
	return index;
    }

    public int get(int index) {
	return list.get(index);
    }

    public int remove(int index) {
	return list.remove(index);
    }
}
