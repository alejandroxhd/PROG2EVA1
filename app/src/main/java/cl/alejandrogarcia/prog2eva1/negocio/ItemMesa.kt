package cl.alejandrogarcia.prog2eva1.negocio

class ItemMesa(val itemMenu : ItemMenu, val cantidad : Int) {
    fun calcularSubtotal() : Int {
        val valorUnit = itemMenu.precio.toInt()
        return valorUnit * cantidad
    }
}