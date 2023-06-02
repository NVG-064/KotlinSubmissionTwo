package id.infinitelearning.kotlin_submission.exercise4

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

  while (true) {
    println("Input any Integer you like (for example: 9)\n" +
            "Select 0 to exit program\n")

    print("Input: ")
    var inputNumber = readln()

    try {
      when (inputNumber.toInt()) {
        0 -> exitProcess(0)
        else -> println("\nUser picked  : $inputNumber\n")
      }
    } catch (e: NumberFormatException) {
      println("\nIt's not an Integer. Float, Double, String, and other than Integer is illegal.\n" +
              "System will pick a number for you")
      inputNumber = Random.nextInt().toString()
      println("System picked: $inputNumber\n")
    }
  }
}