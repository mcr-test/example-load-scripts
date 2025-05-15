import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class BasicSimulation extends Simulation {

  val httpProtocol = http.baseUrl("https://test.k6.io")

  val scn = scenario("Basic Load Test")
    .exec(http("Home Page")
      .get("/")
      .check(status.is(200)) 
    )

  setUp(
    scn.inject(atOnceUsers(10))
  ).protocols(httpProtocol)
}