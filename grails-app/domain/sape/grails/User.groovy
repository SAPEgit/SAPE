package sape.grails

class User {

    String username
    String email
    String password

    static hasMany = [messages: Message]

    static constraints = {
        username(nullable: false, blank: false, unique: true)
        email(email: true, nullable: false, blank: false, unique: true)
        password(nullable: false, blank: false)
    }
}
