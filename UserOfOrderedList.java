
public class UserOfOrderedList {
    private static OrderedList_inArraySlots list;
    public static void main(String[] args){
	list = new OrderedList_inArraySlots();

	System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

	
        int elemIndex;
    	for( elemIndex = 0; elemIndex < 5; elemIndex++ ) {
            list.add( elemIndex); // differs from index, but similar
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("initial population of " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());
	list.add (3);
	System.out.println( list + System.lineSeparator());
	
	for( ; elemIndex < 15; elemIndex++ ) {

            if( elemIndex == 10) System.out.println( "expansion expected");

            list.add( -elemIndex);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("result of second population: " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());


	list.add (-20);
	list.add (8);
	list.add (1);
	System.out.println("result of third population: " + list.size() + " elements:");
	System.out.println( list + System.lineSeparator());

	
    	// test accessor
        System.out.println( "sample elements from list:");
        for( elemIndex = 1; elemIndex < list.size(); elemIndex *= 2 ) {
            System.out.println( "element " + elemIndex + ": "
                              + list.get( elemIndex)
                              );
        }

    	// test removing an element
        System.out.println("removing value " + list.remove( 6)
                          + ", leaving " + list.size() + " elements:");
        System.out.println( list);
        System.out.println(
            "expecting:" + System.lineSeparator()
          + "[-20,-14,-13,-12,-11,-10,-8,-7,-6,-5,0,1,1,2,3,3,4,8,]");

    	//test set
	setTest(  8);
	setTest( 16);
	setTest( 17);
        System.out.println();
	System.out.println( list);

    }

    /**
    Test the set() method, reporting and
    changing the value at index @modifyAt.
     */
    private static void setTest( int modifyAt) {
	System.out.println("change element " + modifyAt + " from "
			   +  list.get( modifyAt) + " to " + (modifyAt + 1000) + ":");
	int old = list.get(modifyAt);
	if (list.set( modifyAt, modifyAt + 1000))
        System.out.println(
            "changed element " + modifyAt + " from "
          + old + " to "
          + list.get( modifyAt)
          );
	else
	    System.out.println("not allowed");
     }
}
