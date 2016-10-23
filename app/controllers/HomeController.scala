package controllers

import play.api.mvc._

class HomeController extends Controller {

  def index = Action {
    Ok(views.html.home.index()).withSession(
    "connected" -> "ian.plunkett@gmail.com")
  }

  def session = Action { request =>
    request.session.get("connected").map { user =>
      Ok("Hello " + user)
    }.getOrElse {
      Unauthorized("Oops, you are not connected")
    }
  }
}
