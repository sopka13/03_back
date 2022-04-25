package models

import javax.inject.Inject
import play.api.libs.ws.{WSClient, WSRequest}
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

class Application @Inject() (ws: WSClient, val controllerComponents: ControllerComponents) extends BaseController {

	def index: Action[AnyContent] = Action {
		val request: WSRequest = ws.url("http://localhost:12345")
		val response = request
			.addHttpHeaders("connection" -> "close")
			.get()
//		ws.close()

		// manage request path
		// get json
		// parse json
		// add database

		Ok("It work!")
	}
}
