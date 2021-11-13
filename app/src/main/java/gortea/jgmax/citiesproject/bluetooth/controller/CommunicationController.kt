package gortea.jgmax.citiesproject.bluetooth.controller

interface CommunicationController {
    fun isHost(): Boolean
    fun send(message: String)
    fun onReceive(message: String)
    fun disconnect()
    fun connect()
    fun step(step: String)
    fun giveUp()
}