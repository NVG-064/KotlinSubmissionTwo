package id.infinitelearning.kotlin_submission.exercise3

import kotlin.random.Random

const val colorChange = "\u001b[31m"
const val colorReset = "\u001b[0m"

fun debugInfo(functionName: String) {
    println(colorChange + functionName + colorReset)
}

fun main() {
    debugInfo(
        "debugInfo\n" +
                "package    : id.infinitelearning.kotlin_submission.exercise3\n" +
                "filename   : App.kt\n" +
                "executedOn : main()\n"
    )

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini

    /** Reference to learn RNG (Random Number Generator)
     * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.random/-random/
     */
    val randomScore = Random.nextInt(0, 100)

    println("Score saya : $randomScore")
    println("Hasil      : ${
        if (randomScore >= 90) "Selamat! Anda mendapatkan nilai A"
        else if ((randomScore >= 80) && (randomScore < 90)) "Anda mendapatkan nilai B"
        else if ((randomScore >= 70) && (randomScore < 80)) "Anda mendapatkan nilai C"
        else if ((randomScore >= 60) && (randomScore < 70)) "Anda mendapatkan nilai D"
        else "Anda mendapatkan nilai E"
    }")
}