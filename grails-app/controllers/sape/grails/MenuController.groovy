package sape.grails

class MenuController {

    def index() {
        render view: "/index"
    }

    def home() {
        render view: "/menu/home"
    }

    def forum() {
        render view: "/menu/forum"
    }

    def form() {
        render view: "/menu/form"
    }
}
