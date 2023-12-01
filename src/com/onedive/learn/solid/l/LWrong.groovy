package com.onedive.learn.solid.l

/*
Class ini adalah contoh class yg tidak mengikuti prinsip Liskov Substitution karna setiap sub class
diharapkan dapat melakukan setiap pekerjaan yang ada pada super class tsb,sehingga kelas televisi sudah
tidak relavan lagi menjadikan class product sebagai super class nya.
 */
abstract class Product {
    abstract String getProductName()
    abstract Date getExpiredDate()
}

class Vegetable extends Product{


    @Override
    String getProductName() {
        return "Brocoli"
    }

    @Override
    Date getExpiredDate() {
        return new Date()
    }

}

class Television extends Product{

    @Override
    String getProductName() {
        return "LG 22 INCH"
    }

    @Override
    Date getExpiredDate() {
        Date date = null
        if (date == null){
            throw new IllegalArgumentException("Date is null")
        }
        return date // ??? televisi tidak seharus nya mempunyai exp
    }
}

class LWrong {

    static void main(String[] args) {
        Product product = new Television()
        println("Product " + product.getProductName() + " Expired at " + product.getExpiredDate())
    }

}
