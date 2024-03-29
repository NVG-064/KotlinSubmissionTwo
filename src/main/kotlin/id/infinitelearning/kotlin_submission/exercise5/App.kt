package id.infinitelearning.kotlin_submission.exercise5

fun main() {

  /**
   * Latihan 1
   * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
   *
   */
  val hero = Hero()


  /**
   * Latihan 2
   * Set data profile dengan memanggil fungsi setProfile() dibawah ini
   * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
   *
   */
  hero.setProfile("Ari Candra Kusuma", 21, 165)


  /**
   * Latihan 3
   * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
   *
   */
  hero.profile()


  /**
  Challenge:
  Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
  Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
  Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
  Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
  Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
  Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
   **/

  /**
   * Latihan 4
   * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
   *
   */
  hero.jalan()
  hero.jalan()

  hero.lari()
  hero.lari()

  hero.makan()

  hero.minum()
  hero.minum()
  hero.minum()

  hero.lompat()

  hero.duduk()
  hero.duduk()



  /**
   * Latihan 5
   * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
   *
   */
  hero.profile()

}