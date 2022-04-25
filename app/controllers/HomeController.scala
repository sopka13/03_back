package controllers

import java.io.File

import akka.actor.{ActorSystem, CoordinatedShutdown}
import akka.stream.Materializer
import javax.inject._
import play.api._
import play.api.http.{FileMimeTypes, HttpErrorHandler, HttpRequestHandler}
import play.api.i18n.{Langs, MessagesApi}
import play.api.libs.ws.ahc.StandaloneAhcWSClient
import play.api.libs.ws.{WSClient, WSRequest}
import play.api.mvc._
import play.api.mvc.request.RequestFactory
import scala.concurrent.{ExecutionContext, Future}
import views.html.FlinkList
import models.FlinkRestClient

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(ws: WSClient, val controllerComponents: ControllerComponents, config: Configuration) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def config(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.Config(FlinkRestClient.config(ws)))
  }
}
