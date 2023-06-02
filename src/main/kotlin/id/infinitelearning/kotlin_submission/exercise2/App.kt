package id.infinitelearning.kotlin_submission.exercise2

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

const val colorChange = "\u001b[31m"
const val colorReset = "\u001b[0m"

fun debugInfo(functionName: String) {
  println(colorChange + functionName + colorReset)
}

fun main() {
  debugInfo(
    "debugInfo\n" +
            "package    : id.infinitelearning.kotlin_submission.exercise2\n" +
            "filename   : App.kt\n" +
            "executedOn : main()\n"
  )

  /** Latihan 1 List
  Buatlah sebuah variabel bertipe list dengan ketentuan:
  - List tersebut menampung bilangan genap dari 1 hingga 100
  Optional:
  - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
   */
  // Buat di bawah sini
  val evenNumber = mutableListOf<Int>()

  for (e in 1..100) {
    if (e % 2 == 0) evenNumber.add(e)
  }

  debugInfo("debugInfo\n" +
          "evenNumber: $evenNumber\n")

  /** Latihan 2 Map
  Buatlah variabel bertipe Map dengan kriteria:
  Daftar nama bulan dalam setahun,
  - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
  - key "Jan", value January
  - key "Feb", value February
  - dst...
  Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
  - Jan -> January
  - Feb -> February
  - Dst...

  Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
  - "It's {$monthNow} now, I was born in {$birthMonth}"
   */
  // Buat di bawah sini
  val monthMap = mapOf<String, String>(
    "jan" to "January",
    "feb" to "February",
    "mar" to "March",
    "apr" to "April",
    "may" to "May",
    "jun" to "June",
    "jul" to "July",
    "aug" to "August",
    "sep" to "September",
    "oct" to "October",
    "nov" to "November",
    "dec" to "December"
  )

  println("List of month:")
  monthMap.forEach {
    (k, v) -> println("$k -> $v")
  }

  println()

  /** Reference for get local date and time
   * https://www.baeldung.com/kotlin/current-date-time
   */
  val systemTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM"))
  val monthNow = monthMap[systemTime.lowercase()]
  val birthMonth = monthMap["apr"]

  println("It's $monthNow now, I was born in $birthMonth")
}