package models

import javax.inject.Inject
import play.api.libs.ws.{WSClient, WSRequest}
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}
import play.mvc.BodyParser.Json
import utils.methods.{Cluster, Config, Method}
import utils.{Flink, Flinks, Response}
import play.api.libs.json._

class FlinkRestClient() {
//	val paths: Array[String] = Array("http://localhost:8081", "http://127.0.0.1:8081")
//	val fl = new Flinks()
//	for(str <- paths) fl.add(new Flink(url = str, fl.size.toString))
//
//	def showInfo: Array[String] = for (elem <- fl.tmpInfo) yield elem.path.toString

}

object FlinkRestClient {
	def config(ws: WSClient): Response = {
		val tmp = Config.get(ws, "http://localhost:8081")
		tmp.
	}
}