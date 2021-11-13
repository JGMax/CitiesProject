package gortea.jgmax.citiesproject.app.data.local.dao

import gortea.jgmax.citiesproject.app.data.model.City

interface CityDAO {
    fun getCity(title: String): List<City>
    fun insertAll(data: List<City>)
    fun getAll(): List<City>
}