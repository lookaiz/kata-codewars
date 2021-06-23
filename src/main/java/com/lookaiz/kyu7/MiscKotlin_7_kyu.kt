package com.lookaiz.kyu7

/**
 * 7 kyu
 * Small enough? - Beginner
 * You will be given an array and a limit value.
 * You must check that all values in the array are below or equal to the limit value.
 * If they are, return true. Else, return false.
 */
fun smallEnough(a : IntArray, limit : Int) = a.all { it <= limit }

/**
 * 7 kyu
 * Cat and Mouse - Easy Version
 * You will be given a string (x) featuring a cat 'C' and a mouse 'm'. The rest of the string will be made up of '.'.
 * You need to find out if the cat can catch the mouse from it's current position.
 * The cat can jump over three characters. So:
 *
 * C.....m returns 'Escaped!' <-- more than three characters between
 * C...m returns 'Caught!' <-- as there are three characters between the two, the cat can jump.
 */
fun catMouse(s: String) = if (s.indexOf('m') - s.indexOf('C') > 4) "Escaped!" else "Caught!"

/**
 * 7 kyu
 * Simple Fun #176: Reverse Letter
 * Given a string str, reverse it omitting all non-alphabetic characters.
 * For str = "krishan", the output should be "nahsirk".
 * For str = "ultr53o?n", the output should be "nortlu".
 */
fun reverseLetter(s: String) = s.filter { it.isLetter() }.reversed()

fun fireFight(s: String) = s.replace("Fire", "~~")