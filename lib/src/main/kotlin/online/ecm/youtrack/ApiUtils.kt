package online.ecm.youtrack

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

typealias MultiValueMap = MutableMap<String,List<String>>

fun <T> tryOrNull(action: () -> T): T? {
    return try {
        action()
    } catch (e: Exception) {
        null
    }
}

fun collectionDelimiter(collectionFormat: String) = when(collectionFormat) {
    "csv" -> ","
    "tsv" -> "\t"
    "pipe" -> "|"
    "space" -> " "
    else -> ""
}

val defaultMultiValueConverter: (item: Any?) -> String = { item -> "$item" }

fun <T : Any?> toMultiValue(items: Array<T>, collectionFormat: String, map: (item: T) -> String = defaultMultiValueConverter)
        = toMultiValue(items.asIterable(), collectionFormat, map)

fun <T : Any?> toMultiValue(items: Iterable<T>, collectionFormat: String, map: (item: T) -> String = defaultMultiValueConverter): List<String> {
    return when(collectionFormat) {
        "multi" -> items.map(map)
        else -> listOf(items.joinToString(separator = collectionDelimiter(collectionFormat), transform = map))
    }
}

inline fun <reified T: Any> YoutrackApiInterface.parseDateToQueryString(value : T): String {
    /*
    .replace("\"", "") converts the json object string to an actual string for the query parameter.
    The moshi or gson adapter allows a more generic solution instead of trying to use a native
    formatter. It also easily allows to provide a simple way to define a custom date format pattern
    inside a gson/moshi adapter.
    */

    return ObjectMapper().registerKotlinModule().writeValueAsString(value).replace("\"", "")
}

fun Int.firstDigit(): Int {
    var x = if (this < 0) -this else this
    while (x > 9) {
        x /= 10;
    }
    return x;
}

/**
 * Defines a config object for a given request.
 * NOTE: This object doesn't include 'body' because it
 *       allows for caching of the constructed object
 *       for many request definitions.
 * NOTE: Headers is a Map<String,String> because rfc2616 defines
 *       multi-valued headers as csv-only.
 */
data class RequestConfig<T>(
    val method: RequestMethod,
    val path: String,
    val headers: MutableMap<String, String> = mutableMapOf(),
    val query: MutableMap<String, List<String>> = mutableMapOf(),
    val body: T? = null
)

enum class RequestMethod {
    GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE
}