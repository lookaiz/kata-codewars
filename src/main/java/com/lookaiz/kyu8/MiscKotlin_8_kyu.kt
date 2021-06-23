package com.lookaiz.kyu8


/**
 * Write a function that remove first and last letter of a word
 */
fun rem(s: String) = s.drop(1).dropLast(1)

/**
 * Timmy & Sarah think they are in love, but around where they live,
 * they will only know once they pick a flower each.
 * If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
 *
 * Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
**/
fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    return (flowerA%2 == 0).xor(flowerB%2 == 0)
}

/**
 * 8 kyu
 * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
 *
 */
fun invert(arr: IntArray) = arr.map { -it }.toIntArray()