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
	if (list.get(0) >= value){
	    list.add(0, value);
	    return true; 
	}
	if (list.get(list.size() - 1) <= value){
	    return list.add(value);
	}
	else
	    return add (value, 0, list.size() - 1);
	
	// code below not working
	// int index = (size() + 1) /2;
	// int counter = 0;
	// while (value != list.get(index) && index > 0 && index < size()) {
	//     counter++;
	//     if (value > list.get(index)){
	// 	if (value < list.get(index + 1)) {
	// 	    list.add(index + 1, value);
	// 	    return index;
	// 	}
	// 	else
	// 	    index += (int)(size() * (1.0/Math.pow(2, counter)));
	//     }
	//     else if (value < list.get(index)){
	// 	if (value > list.get(index - 1)) {
	// 	    list.add(index, value);
	// 	    return index;
	// 	}
	// 	else
	// 	    index -= (int)(size() * (1.0/Math.pow(2, counter)));
	//     }
	// }
	// list.add(index, value);
	// return index;
    }

    private boolean add (int value, int left, int right) {
	if (right - left == 1) {
	    list.add(right, value);
	    return true;
	}
	int mid = (left + right + 1)/ 2;
        if (value < list.get(mid)) {
	    return add(value, left, mid);
	}
	else
	    return add(value, mid, right);
    }

    public int get(int index) {
	return list.get(index);
    }

    public int remove(int index) {
	return list.remove(index);
    }

    public boolean set ( int index, int value) {
	if (index == 0 && list.get(1) >= value){
	    list.set(index, value);
	    return true;
	}
	if (index == list.size() - 1 && list.get(list.size() - 2) <= value){
	    list.set(index, value);
	    return true;
	}
	if (list.get(index - 1) <= value && list.get(index + 1) >= value){
	    list.set(index, value);
	    return true;
	}
	return false;
    }
}
