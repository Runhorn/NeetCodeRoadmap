package roadmap.question2

/**
 * https://leetcode.com/problems/valid-anagram/submissions/
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */
object Solution extends App {
  def isAnagram(s: String, t: String): Boolean = {
    s.sorted == t.sorted
  }

  val s = "anagram"
  val t = "nagaram"
  println(isAnagram(s,t))
}