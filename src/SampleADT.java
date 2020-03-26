public interface SampleADT<E> {
    void add(E item);

    E delete();

    int search();

    // this is what we are going to discuss from today onwards
    // how can we search for desired data in a data structure
    /*
     * There are basically two main searching techniques used in DS
     * 1. Linear Search (Sequential Search)
     * 2. Binary Search
     * */
    void sort();

    void print();
}
