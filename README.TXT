TechSupport - the DodgySoft Technical support system, version #2.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling
 

This project is discussed in chapter 6.


This project implements a second version of the technical support system 
example. It is an intermediate version intended to demonstrate the first
few changes discussed in this book chapter.


To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.

Part II: HashMap and HashSet classes
24. A HashMap is a class from java.util. It implements the Map interface. Its purpose is to store data in key value pairs where each pair is unique.If I understood correctly, it lets you to add, romove and find values using keys efficiently. 

25.
K - the type of keys maintained by this map
V - the type of mapped values
METHOD
V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
boolean containsKey(Object key)
boolean containsValue(Object value)
Set<Map.Entry<K,V>> entrySet()
V get(Object key)
boolean isEmpty()
Set<K> keySet()
V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
static <K,V> HashMap<K,V> newHashMap(int numMappings)
V put(K key, V value)
void putAll(Map<? extends K,? extends V> m)
V remove(Object key)
int size()
Collection<V> values()
I think the same type could be used for the same parameter.


