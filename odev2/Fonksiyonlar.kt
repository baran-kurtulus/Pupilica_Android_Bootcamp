package com.example.kotlindersleri.odevler.odev2

class Fonksiyonlar {

    fun Fahrenhiet(derece: Double): Double{
        return derece * 1.8 + 32
    }

    fun Cevre(yukseklik: Double, genislik: Double): Double{
        return 2 * yukseklik + 2 * genislik
    }

    fun Faktoryel(sayi: Int): Int{
        if (sayi == 1 || sayi == 0){
            return 1
        }
        else{
            return sayi * Faktoryel(sayi - 1)
        }
    }

    fun Asayisi(kelime: String): Int{
        var count = 0
        for (harf in kelime){
            if(harf == 'a'){
                count++
            }
        }
        return count
    }

    fun IcAcilarToplami(kenarSayisi: Int): Int{
        if(kenarSayisi <= 2){
            return 0
        }
        else{
            return (kenarSayisi - 2) * 180
        }
    }

    fun MaasHesabi(gun: Int): Int{
        val saat = gun * 8
        if(saat <= 160){
            return saat * 10
        }
        else{
            val mesai = saat - 160
            return (160 * 10) + (mesai * 20)
        }
    }

    fun KotaHesabi(kota: Int): Int{
        if(kota <= 50){
            return 100
        }
        else{
            val asim = kota - 50
            return 100 + (asim * 4)
        }
    }

}