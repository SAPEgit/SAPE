package sape.grails

class Article {

    String text
    File file

    static belongsTo = [administrator: Administrator]

}
