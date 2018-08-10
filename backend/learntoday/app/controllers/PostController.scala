package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import scala.collection.mutable.HashMap
import play.api.libs.json.Json
import scala.collection.mutable.ArrayBuffer
import java.util.Date
import java.text.SimpleDateFormat


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */


@Singleton
class PostController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def convertTimestampToString( ts:String ) : String = {
      val df: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
      val date:String = df.format(ts.toDouble.toLong * 1000L)

      return date
  }

  def index(client_msg_id: String) = Action { implicit request: Request[AnyContent] =>

    val post: HashMap[String, String] = HashMap(
      ("client_msg_id", client_msg_id),
      ("user","U06CVDTT6"),
      ("text","#woocommerce #php\n<https://www.ibenic.com/manage-order-item-meta-woocommerce/>\nมันเกี่ยวกับพวก item meta data ของ order เช่นถ้าเราอยากเปลี่ยน text ใน order details หรือ email มันมี filter ของ woo ที่เปลี่ยนที่เดียว สามารถเปลี่ยนได้ทั้งในหน้า order กับ email"),
      ("ts", convertTimestampToString("1533892979.000041"))
    )

    Ok(Json.toJson(post))
  }
}
