package com.onedive.learn.solid.o

/*
Class ini menyalahi aturan prinsip open closed karna jika kita ingin mengganti server kita harus mengubah /
menghapus server pada konstruktor yang sebelumnya telah ada
 */

class ReaderWeb {

    private SlowServer slowServer

    private FasterServer fasterServer

    ReaderWeb(SlowServer server){
        this.slowServer = server;
        println(server.toString())
        //this.fasterServer = server;
    }

}

class SlowServer {

    @Override
    String toString() {
        return "Current server is : " + this.class.name
    }

}

class FasterServer{

    @Override
    String toString() {
        return "Current server is : " + this.class.name
    }

}


class OWrong {

    static void main(String[] args) {

        SlowServer slowServer1 = new SlowServer()
        FasterServer fasterServer1 = new FasterServer()

        ReaderWeb readerWeb = new ReaderWeb(slowServer1)
        //error
        //ReaderWeb readerWeb2 = new ReaderWeb(fasterServer1)

    }

}

