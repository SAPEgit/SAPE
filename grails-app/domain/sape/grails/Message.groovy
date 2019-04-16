package sape.grails

class Message {

    String message
    Date dateCreated

    static belongsTo = [user: User, administrator: Administrator]

    static constraints = {
        message(nullable: false, blank: false, maxSize: 255)
    }
}
