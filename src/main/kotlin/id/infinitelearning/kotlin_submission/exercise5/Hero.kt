package id.infinitelearning.kotlin_submission.exercise5

class Hero {

  private var name: String? = null
  private var age = 0
  private var height = 0

  private var health = 10

  fun setProfile(name: String?, age: Int, height: Int) {
    this.name = name
    this.age = age
    this.height = height
  }

  fun profile() {
    println("========= Profile =========")
    println("Name   : $name")
    println("Age    : $age")
    println("Height : $height")
    println("Health : $health")
    println("===========================\n")
  }

  private fun checkHealth() {
    if (health <= 0) {
      println("Anda telah mati $name\n")
    }
  }

  fun jalan() {
    checkHealth()
    println("$name sedang berjalan ... *kesandung batu\n")
    health -= 1
  }

  fun lari() {
    checkHealth()
    println("$name lagi lari pagi ... lagi binsik (bina fisik) orangnya ...\n")
    health -= 2
  }

  fun makan() {
    checkHealth()
    println("$name lagi makan ... *nyam nyam\n")
    health += 2
  }

  fun minum() {
    checkHealth()
    println("$name lagi minum ... *gluk gluk gluk\n")
    health += 2
  }

  fun lompat() {
    checkHealth()
    println("$name lagi lompat ... *hap\n")
    health -= 2
  }

  fun duduk() {
    checkHealth()
    println("$name lagi duduk ... *tapi resah karena lagi ambeien ...\n")
    health += 1
  }


  /**
   * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
  - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
  - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
  - ubah nilai variable health sesuai kegiatan yang dilakukan:
   * lari = -2
   * makan = +2
   * minum = +2
   * lompat = -2
   * duduk = +1

  Contoh fungsi bisa mengikuti fungsi jalan() diatas.

   */


}