### Hash table:

a hash table (hash map) is a data structure that implements an associative array abstract data type, a structure that can map keys to values. A hash table uses a hash function to compute an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found.


## Challenge
<!-- Description of the challenge -->
implement hash table in java.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Hashmap put and get operation time complexity is O(1)  in the average case with assumption that key-value pairs are well distributed across the buckets, and O(n) in the worst case. It means hashcode implemented is good.

## API
<!-- Description of each method publicly available in each of your hashtable -->

- **add(key , value):**
  - This method hash the key, and add the key and value pair to the table with handling the collisions.
  - **get(key):**
  - this method return the value associated with that key in the table
- **contain(keu):**
    - this method return true if the key exists in the table, Otherwise return false.
- **hash(key)**:
  - find index in the collection for that key

