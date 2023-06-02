package id.infinitelearning.kotlin_submission.exercise1

const val colorChange = "\u001b[31m"
const val colorReset = "\u001b[0m"

fun debugInfo(functionName: String) {
  println(colorChange + functionName + colorReset)
}

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
//  println("debugInfo: myProfile() method invoked\n")
//  debugInfo("debugInfo: myProfile() method invoked\n")

  val firstName: String = "Ari"
  val middleName: String = "Candra"
  val lastName: String = "Kusuma"
  val age: Number = 21
  val isSingle: Boolean = true

  println("First Name : $firstName")
  println("Middle Name: $middleName")
  println("Last Name  : $lastName")
  println("Age        : $age")
  println("Status     : ${if (isSingle) "Single" else "Married"}")
  println()
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 *
 *  >>> Confused, it's already completed
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {


  return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String {
  val myGroupMember = listOf("Anisa Nabila Putri", "Anjayani Syaputra", "Ari Candra Kusuma", "Desy Chu", "Eunike Meulina", "Eva Ariani", "Johan Jeques Junior", "Lizzam Sekar Nollo Henning", "Muhammad Aulia Rizki", "Tasya Helen Aprilliani")

  return myGroupMember[2]
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
  val mentor = arrayOf("Hasan Harahap", "Jesica Aulia")
  val countOfGroup = 10

  return mentor.size + countOfGroup
}

fun main() {
  debugInfo("debugInfo\n" +
          "package    : id.infinitelearning.kotlin_submission.exercise1\n" +
          "filename   : App.kt\n" +
          "executedOn : main()\n")

  myProfile()

  val myGroup = myGroup()
  println("My Group is: $myGroup")

  println()

  val totalMember = totalMember()
  println("Total Member group + Mentor: $totalMember")

  /**
   *  Latihan 5
   *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
   *
   */
  groupDetail(2, listOf("Anisa Nabila Putri", "Anjayani Syaputra", "Ari Candra Kusuma", "Desy Chu", "Eunike Meulina", "Eva Ariani", "Johan Jeques Junior", "Lizzam Sekar Nollo Henning", "Muhammad Aulia Rizki", "Tasya Helen Aprilliani"), "Afternoon")

}