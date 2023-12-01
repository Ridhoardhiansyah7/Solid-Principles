package com.onedive.learn.solid.o

/*
Class ini adalah contoh class yg mengikuti prinsip open closed, sehingga kita tidak merubah fungsionalitas
yg sudah ada pada aplikasi kita ketika kita melakukan update fitur pada aplikasi
 */
class MovieWeb {

    private IQuality quality

    MovieWeb(IQuality quality){
        this.quality = quality;
    }

    IQuality getCurrentVideoQuality(){
        return quality.getCurrentQuality()
    }

}

class LowLevelIQuality implements IQuality {

    @Override
    void getCurrentQuality() {
        println("Current Streaming Quality is : " + this.class.getSimpleName() + " With Quality 480p")
    }
}

class MediumLevelIQuality implements IQuality {

    @Override
    void getCurrentQuality() {
        println("Current Streaming Quality is : " + this.class.getSimpleName() + " With Quality 720p")
    }
}


class HighLevelIQuality implements IQuality {

    @Override
    void getCurrentQuality() {
        println("Current Streaming Quality is : " + this.class.getSimpleName() + " With Quality 1080p")
    }
}

interface IQuality {
    void getCurrentQuality()
}

class ORight {

    static void main(String[] args) {

        MovieWeb movieWeb = new MovieWeb(new LowLevelIQuality())
        movieWeb.getCurrentVideoQuality()

        MovieWeb movieWeb1 = new MovieWeb(new MediumLevelIQuality())
        movieWeb1.getCurrentVideoQuality()

        MovieWeb movieWeb2 = new MovieWeb(new HighLevelIQuality())
        movieWeb2.getCurrentVideoQuality()

    }


}
