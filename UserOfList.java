/**
 Test list features.
 */
public class UserOfList {
    
    public static void main( String[] args ) {
	List_inArraySlots list;
        list = new List_inArraySlots();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        // Populate the list with diverse elements.
        list.add( 2, -1, -2.0,  "important", true);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added string: " + list);

        list.add( 0, 17, -2.0,  "junk", false);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added int: " + list);

        list.add( 1, -1, 1.618, "junk", false);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added double: " + list);

	list.add( 3, -1, 1.618, "junk", false);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added boolean: " + list);
	
        // Add enough elements that expansion is expected
        for( int elemIndex = list.size(); elemIndex < 15; elemIndex++ ) {

            if( list.size() == 10) System.out.println( "expansion expected");

            list.add( 0, -elemIndex, -2.0,  "junk", true);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("result of expanded list: "
             + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());


	System.out.println("element 3: " + list.get(3));
	System.out.println("element 8: " + list.get(8));
	System.out.println("element 20: " + list.get(20));
    }
}
