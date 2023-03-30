
//Garbage Collection

//Serial GC (-XX:+UseSerialGC)
//
//Parallel GC (-XX:+UseParallelGC)
//
//Parallel Old GC (-XX:+UseParallelOldGC)
//
//Concurrent Mark Sweep (CMS) Collector (-XX:+UseConcMarkSweepGC)
//
//G1 (or Garbage First) Garbage Collector (-XX:+UseG1GC)


// Map: Basic operations:
//
// Object put(Object key, Object value);
//
// Object get(Object key);
//
// Object remove(Object key);
//
// boolean containsKey(Object key);
//
// boolean containsValue(Object value);
//
// int size( );
//
// boolean isEmpty( );
//
// void putAll(Map t);
//
// void clear();


//Map: Collection views:
//
//upublic Set keySet( ); 
//
//u set of objects of type keys
//
//upublic Collection values( ); 
//
//uList of values
//
//upublic Set entrySet( ); 
//
//uset of objects of type Map.Entry
//
//uEach Map.Entry Object has two objects : Key and Value
//
//ugetKey() , getValue()
//
//ureturns a set of Map.Entry (key-value) pairs
//
//uYou can create iterators for the key set, the value set, or the entry set (the set of entries, that is, key-value pairs)
//
//uThe above views provide the only way to iterate over a Map