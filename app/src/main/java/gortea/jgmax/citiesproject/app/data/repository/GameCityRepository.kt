package gortea.jgmax.citiesproject.app.data.repository

import gortea.jgmax.citiesproject.app.data.model.City

interface GameCityRepository {
    fun getCityList(): List<City>
    fun hasAlreadyUsed(title: String): Boolean
    fun clear()
}