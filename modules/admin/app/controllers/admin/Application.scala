package controllers.admin

import play.api._
import play.api.mvc._
import views.html._

object Application extends Controller {

  def index = Action {
    Ok("admin")
  }

}