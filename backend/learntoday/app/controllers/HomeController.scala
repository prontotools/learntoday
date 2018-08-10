package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import scala.collection.mutable.HashMap
import scala.io.Source
import play.api.libs.json._
import play.api.libs.json.Json
import scala.collection.mutable.ArrayBuffer
import java.util.Date
import java.text.SimpleDateFormat


@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def convertTimestampToString( ts:String ) : String = {
      val df: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
      val date:String = df.format(ts.toDouble.toLong * 1000L)

      return date
  }

  def index() = Action { implicit request: Request[AnyContent] =>
    val source: String = Source.fromFile("conf/2018-08-10.json").getLines.mkString
    val json: JsValue = Json.parse(source)

    Ok(Json.toJson(json))
  }
}
