# Java-Collections

###### COLLECTIONS CLASS


Collections Class is an utility class which is provided in Java Collection Framework.
    this utility class provides various helpful methods for collections
    
    like :
    
    1. Adding Elements to Collection
    
    2. Sorting Collection
    
    3. Searching Element in Collection
    
    4. Copy elements of one collection to another
    
    5. Check whether Collections contain common Elements

###### LIST INTERFACE

It is an interface which extends Collection Interface. It is provided by Java Collection Framework.

Classes which implements List Interface :
    
     1. ArrayList
     2. LinkedList
     3. Stack
     4. Vector ( Got deprecated in Java 5 )

Common Operations :

      1. Adding element
      2. Searching
      3. Removing
    
Methods in List Interface

        1. add(int index, T element)    
        2. addAll(int index, Collection c)      
        3. size()       
        4. remove(T element)
        5. sort(Comparator com)     
        6. clear()      
        7. containsAll(Collection c)      
        8. contains(T element)
        9. equals(T element)    
        10. hashCode()      
        11. indexOf(T element)      
        12. lastIndexOf(T element)
        13. get(T e)    
        14. set(int index, T e)     
        15. isEmpty()   
        16. remove(int index)

###### LIST VS SET

    1. list is ordered whereas Set is un-ordered
    2. Getting elements using positions is possible in List but in set it is not possible
    3. Duplicates are allowed in List whereas in Set duplicates are not allowed.
    4. Multiple null values can be stored in list whereas in Set only single Null value can be stored.
    5. ArrayList, LinkedList, Stack and Vector are Implementation class of List whereas LinkedHashSet and HashSet are implementation class of Set. 

###### ArrayList Class

It is an class which implements List Interface. 
It is an enhanced version of Arrays as in Arrays,
we need to specify size at time of creation but in ArrayList size is allocated Dynamically whenever there
is add and remove happen in ArrayList.

Common Operations :

        1. Adding element
        2. Changing Element
        3. Removing element
        4. Iterating

Methods in List Interface

        1. add(int index, T element)    
        2. addAll(int index, Collection c)      
        3. size()       
        4. remove(T element)
        5. sort(Comparator com)     
        6. clear()      
        7. containsAll(Collection c)      
        8. contains(T element)
        9. equals(T element)    
        10. trimToSize()    
        11. indexOf(T element)      
        12. lastIndexOf(T element)
        13. get(T e)    
        14. set(int index, T e)     
        15. isEmpty()   
        16. remove(int index)
        17. add(T e)
        18. addAll(Collection c)
        19. clone()
        20. ensureCap(int minCap)
        21. forEach(Consumer)
        22. listIterator()
        23. removeAll(Collection c)
        24. removeIf(Predicate p)
        25. removeRange(int from, int to)
        26. retain(Collection c)
        27. toArray()
        28. subList(int from, int to)
    
