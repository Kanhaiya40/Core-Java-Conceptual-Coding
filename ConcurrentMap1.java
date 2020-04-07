public interface ConcurrentMap1 {
    /*
    Some Specific Methods Defined For ConcurrentMap are:
    -public Object put(Key,Value)-It Check the Corrosponding Key is Present or not if Present then it Replaces Value of that
    Key to new  Value.
    -public Object putIfabsent(Key,Value)-It check Weather the Key associated with Entry is Present or Not
    If Present the it returns that Entry Otherwise it added that entry to the Map
    -public boolean remove(Object Key)-It removes that Entry that is Associated with that Key
    -public boolean remove(Object Key , Object Value)-It removes Entry Associated with both Value And Key
    -public boolean replace(Object Key , Object OldVlaue , Object NewValue)-It replace those Entry which matches to the give Key and OldVlaue

    So this is All About ConcurrentHashMap
    -It is Thread Safe
    -It is having Higher Performance Ratio
     */
}