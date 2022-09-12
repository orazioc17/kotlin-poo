enum class Dias(val laboral: Boolean, val jornada: Int) {
    LUNES(true, 8), MARTES(true, 8), MIERCOLES(true, 5),
    JUEVES(true, 8), VIERNES(true, 4), SABADO(false, 0),
    DOMINGO(false, 0);

    fun saludo(): String {
        return when (this) {
            LUNES -> "Empezando la semana"
            MARTES -> "Ya queda menos"
            MIERCOLES -> "Sabias que los miercoles son los dias mas productivos?"
            JUEVES -> "Hoy es juernes!"
            VIERNES -> "Hoy es viernes y el cuerpo lo sabe"
            else -> "A disfrutar el finde"
        }
    }
}