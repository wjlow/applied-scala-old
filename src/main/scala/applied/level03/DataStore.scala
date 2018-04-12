package applied.level03

import cats.effect.IO
import applied.level03.models._

/**
  * This defines a DataStore where we can retrieve data.
  */
trait DataStore {

  def listMovies(): IO[Either[String, List[Movie]]]

  def getReviews(movieId: MovieId): IO[Either[String, List[Review]]]

  def addMovie(name: String, desc: String): IO[Either[String, MovieId]]

  def addReview(movieId: MovieId, author: String, comment: String): IO[Either[String, ReviewId]]

}
