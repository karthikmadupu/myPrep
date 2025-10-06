/*
semesters required
Write a method, semestersRequired, that takes in a number of courses (n) and a list of prerequisites as arguments. Courses have ids ranging from 0 through n - 1. A single prerequisite of List.of(A, B) means that course A must be taken before course B. Return the minimum number of semesters required to complete all n courses. There is no limit on how many courses you can take in a single semester, as long as the prerequisites of a course are satisfied before taking it.

Note that given prerequisite List.of(A, B), you cannot take course A and course B concurrently in the same semester. You must take A in some semester before B.

You can assume that it is possible to eventually complete all courses.

int numCourses = 6;
List<List<Integer>> prereqs = List.of(
  List.of(1, 2),
  List.of(2, 4),
  List.of(3, 5),
  List.of(0, 5)
);
Source.semestersRequired(numCourses, prereqs); // -> 3
int numCourses = 7;
List<List<Integer>> prereqs = List.of(
  List.of(4, 3),
  List.of(3, 2),
  List.of(2, 1),
  List.of(1, 0),
  List.of(5, 2),
  List.of(5, 6)
);
Source.semestersRequired(numCourses, prereqs); // -> 5
int numCourses = 5;
List<List<Integer>> prereqs = List.of(
  List.of(1, 0),
  List.of(3, 4),
  List.of(1, 2),
  List.of(3, 2)
);
Source.semestersRequired(numCourses, prereqs); // -> 2
int numCourses = 12;
List<List<Integer>> prereqs = List.of();
Source.semestersRequired(numCourses, prereqs); // -> 1
int numCourses = 3;
List<List<Integer>> prereqs = List.of(
  List.of(0, 2),
  List.of(0, 1),
  List.of(1, 2)
);
Source.semestersRequired(numCourses, prereqs); // -> 3


int numCourses = 6;
List<List<Integer>> prereqs = List.of(
  List.of(3, 4),
  List.of(3, 0),
  List.of(3, 1),
  List.of(3, 2),
  List.of(3, 5)
);
Source.semestersRequired(numCourses, prereqs); // -> 2

*/
