package normal

import java.util.*


class RemovingDuplicates3 {

    // Function to remove duplicates from an ArrayList
    fun <T> removeDuplicates(list: ArrayList<T>): ArrayList<T> {

        // Create a new ArrayList
        val newList = ArrayList<T>()

        // Traverse through the first list
        for (element: T in list) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
                newList.add(element)
            }
        }

        // return the new list
        return newList
    }


    fun main(args: Array<String>) {

        // Get the ArrayList with duplicate values
        val list = ArrayList(
            Arrays
                .asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5)
        )

        // Print the Arraylist
        println(
            "ArrayList with duplicates: "
                    + list
        )

        // Remove duplicates
        val newList = removeDuplicates(list)

        // Print the ArrayList with duplicates removed
        println(
            ("ArrayList with duplicates removed: "
                    + newList)
        )
    }
}