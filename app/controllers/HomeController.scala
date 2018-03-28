package controllers

import play.api.mvc.{Action, Controller}

/**
  * A very small controller that renders a home page.
  */
class HomeController extends Controller {

  def index = Action { implicit request =>
    Ok("You've got play-scala-rest-api-example-2.5.x it working")
  }
}
