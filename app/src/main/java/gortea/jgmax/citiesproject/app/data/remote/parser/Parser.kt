package gortea.jgmax.citiesproject.app.data.remote.parser

import gortea.jgmax.citiesproject.app.data.model.City

interface Parser {
    fun parse(data: String): List<City>
}