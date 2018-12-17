import kotlinx.cinterop.memScoped
import libcurl.*

const val URL = "http://api.icndb.com/jokes/random?limitTo=[nerdy]"

/*
 * Copied almost verbatim from: https://curl.haxx.se/libcurl/c/simple.html
 */
fun main(args: Array<String>) = memScoped {
    val curl = curl_easy_init();
    if (curl == null) {
        throw Exception("curl is null")
    }

    defer {
        curl_easy_cleanup(curl)
    }

    curl_easy_setopt(curl, CURLOPT_URL, URL);

    val res = curl_easy_perform(curl);
    if (res != CURLE_OK) {
        val err = curl_easy_strerror(res)
        throw Exception("request failed, err=${err}")
    }
}
