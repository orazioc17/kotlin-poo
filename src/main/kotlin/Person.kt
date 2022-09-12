// Para que otra clase pueda heredar de una clase inicial, la clase inicial tiene que ser open, y por defecto son final
open class Person(var name: String = "Anonimo", var passport: String? = null) {
    var alive = true

    fun Person() {
        name = "Juan"
        passport = "6234857"
    }

    fun die() { this.alive = false }
}

// Herencia
class Athlete(name: String, passport: String?, var sport: String): Person(name, passport) {

}