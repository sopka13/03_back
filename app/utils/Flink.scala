package utils

import java.net.URL

class Flink(url: String, val name: String) {
	val path: URL = new URL(url)
}
