package gortea.jgmax.citiesproject.app.data.repository

interface CityRepository {
    fun syncDatabase(): Boolean
    fun isDatabaseEmpty(): Boolean
}