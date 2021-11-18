package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param archived 
 * @param releaseDate 
 * @param released 
 */

class VersionBundleElementAllOf (

    @JsonProperty("archived")
    val archived: Boolean? = null,

    @JsonProperty("releaseDate")
    val releaseDate: Long? = null,

    @JsonProperty("released")
    val released: Boolean? = null

)

