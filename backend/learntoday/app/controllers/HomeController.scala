package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import scala.collection.mutable.HashMap
import play.api.libs.json.Json

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action { implicit request: Request[AnyContent] =>
    val hashMap1: HashMap[String, String] = HashMap(
      ("PD","Plain Donut"),
      ("SD","Strawberry Donut"),
      ("CD","Chocolate Donut")
    )

    Ok(Json.toJson(hashMap1))
  }
}
