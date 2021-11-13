package gortea.jgmax.citiesproject.app.data.repository

interface VerificationCityRepository {
    fun hasCity(title: String): Boolean
}