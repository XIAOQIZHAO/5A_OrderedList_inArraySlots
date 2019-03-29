
public class UserOfOrderedList {

    public static void main(String[] args){
	OrderedList_inArraySlots list = new OrderedList_inArraySlots();

	System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

	// List_inArraySlots l = new List_inArraySlots();
	// System.out.println(l.get(0));

	
        int elemIndex;
    	for( elemIndex = 0; elemIndex < 5; elemIndex += 2 ) {
            list.add( elemIndex); // differs from index, but similar
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("initial population of " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

	for( ; elemIndex < 15; elemIndex++ ) {

            if( elemIndex == 10) System.out.println( "expansion expected");

            list.add( -elemIndex);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("result of second population: " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

	list.add (3);
	System.out.println( list + System.lineSeparator());
	list.add (-2);
	System.out.println( list + System.lineSeparator());
	list.add (-20);
	System.out.println( list + System.lineSeparator());


    // 	// test accessor
    //     System.out.println( "sample elements from list:");
    //     for( elemIndex = 1; elemIndex < list.size(); elemIndex *= 2 ) {
    //         System.out.println( "element " + elemIndex + ": "
    //                           + list.get( elemIndex)
    //                           );
    //     }

    // 	// test removing an element
    //     System.out.println("removing value " + list.remove( 6)
    //                       + ", leaving " + list.size() + " elements:");
    //     System.out.println( list);
    //     System.out.println(
    //         "expecting:" + System.lineSeparator()
    //       + "[29,0,23,23,23,19, NO -1 HERE! -2,-3...]");

    // 	//test set
    // 	System.out.println( setTest(  8));
    //     System.out.println( setTest( 16));
    //     System.out.println();
	
    // }

    // /**
    // Test the set() method, reporting and
    // changing the value at index @modifyAt.
    //  */
    // private static void setTest( int modifyAt) {
    //     System.out.println(
    //         "changed element " + modifyAt + " from "
    //       + list.set( modifyAt, modifyAt + 1000) + " to "
    //       + list.get( modifyAt)
    //       );
     }
}
