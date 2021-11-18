package online.ecm.youtrack.model

import com.fasterxml.jackson.annotation.JsonProperty

enum class Direction(val value: kotlin.String) {
    @JsonProperty(value = "OUTWARD") OUTWARD("OUTWARD"),
    @JsonProperty(value = "INWARD") INWARD("INWARD"),
    @JsonProperty(value = "BOTH") BOTH("BOTH")
}