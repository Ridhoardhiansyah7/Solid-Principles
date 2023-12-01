package com.onedive.learn.solid

class Solid {

    static void main(String[] args) {
        //S - Single responsibility principle = Sebuah class hanya boleh menangani 1 fitur spesifik / menangani 1 tanggung jawab saja
        //O - OpenClosed principle = Sebuah class harus tertutup untuk di modifikasi tetapi terbuka untuk di upgrade
        //L - Liskov Substitution principle = Sebuah sub class harus bisa melakukan fungsionalitas yg ada pada super class
        //I = Interface segregation Principle = sebuah class tidak boleh di paksa untuk mengimplementasikan fungsi yg tidak diperlukan
        //D = Dependency inversion = Sebuah class high level,dan low level  harus bergantung kpd abstaksi bukan detail tetapi detail harus bergantung pada abstraksi

        println(this.packageName)
    }

}
