# Week 8 procedure — recursive donor search

1. Store sample donor IDs and their declared groups in parallel arrays.
2. Begin a recursive search at the first donor.
3. Stop and return the index when the requested same-group value is found.
4. Return `-1` only when the array has been fully checked.
5. Print the matched sample donor.

Compile and run with `javac BloodWeek08.java` followed by `java BloodWeek08`.

> This is an academic same-group inventory simulation, not clinical matching guidance.
