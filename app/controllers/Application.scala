package controllers

import play.api._
import play.api.mvc._
import play.api.Play.current
import com.mintpresso._

object Application extends Controller {
  
  val mintpresso: Affogato = Affogato( 
    Play.configuration.getString("mintpresso.api").getOrElse(""),
    Play.configuration.getLong("mintpresso.id").getOrElse(0L)
  )

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
}