package com.example.kotlindersleri.odevler.odev2

fun main() {
    var fonksiyonlar = Fonksiyonlar()

    println("Fahrenhiet: ${fonksiyonlar.Fahrenhiet(18.0)}")
    println("Çevre Hesabı: ${fonksiyonlar.Cevre(15.0, 12.2)}")
    println("Faktöryel: ${fonksiyonlar.Faktoryel(5)}")
    println("A adedi: ${fonksiyonlar.Asayisi("Merhaba")}")
    println("İç Açılar Toplamı: ${fonksiyonlar.IcAcilarToplami(5)}")
    println("Maaş Hesabı: ${fonksiyonlar.MaasHesabi(172)}")
    println("Kota Hesabı: ${fonksiyonlar.KotaHesabi(62)}")

}