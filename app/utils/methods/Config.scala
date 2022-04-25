package utils.methods

import java.net.URL

import play.api.libs.ws.{WSClient, WSResponse}

import scala.concurrent.Future

object Config {
	val path = "/config"
	def get(ws: WSClient, flinkPath: String): Future[WSResponse] =
		ws.url(flinkPath + path).get()
}
