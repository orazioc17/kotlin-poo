fun main(args: Array<String>) {
    var pele: Athlete = Athlete("Pele", "324598", "Soccer")
    println(pele.alive)
    println(pele.name)
    println(pele.passport)
    println(pele.sport)

    pele.die()
    println(pele.alive)

    val testPerson = Person()
    println(testPerson.name)
    println(testPerson.passport)

    println()
    println()
    println()

    var lunes = Dias.LUNES
    var semana = Dias.values()

    for (dia in semana) println(dia)

    println(Dias.valueOf("MIERCOLES"))
    println(lunes.name)
    println(lunes.ordinal)

    println(lunes.saludo())
    println(lunes.laboral)
    println(lunes.jornada)
}