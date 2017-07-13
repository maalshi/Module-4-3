import org.testng.annotations.Test;
import ui.aerlpages.FlightResultsPage;
import ui.aerlpages.Homepage;
import businessobjects.Route;
import ui.aerlpages.PassengerEssentialsPage;
import ui.aerlpages.PaxInfoPage;

public class FlightTest extends BaseTest {

    @Test
       public void search(){
        driver.get("https://www.aerlingus.com/html/en-US/home.html");
        Homepage homepage = new Homepage(driver);
        homepage.setRoute(new Route("dublin","paris"));
        homepage.clickFindFlightButton();
        FlightResultsPage flightresults = new FlightResultsPage(driver);
        flightresults.assertOutboundFlight();
        flightresults.assertInboundFlight();
        flightresults.clickContinue();
    }

    @Test(dependsOnMethods = { "search" }, alwaysRun = true)
    public void passengerInfo() {
        PaxInfoPage pax = new PaxInfoPage(driver);
        pax.clickTitleMr();
        pax.sendKeysFirstName("John");
        pax.sendKeysFamilyName("Blare");
        pax.sendKeysEmail("maalshi@mail.ru");
        pax.sendKeysConfirmEmail("maalshi@mail.ru");
        pax.sendKeysAreaCode("34");
        pax.sendKeysLocalNumber("3434");
        pax.clickContinue();
    }

    @Test (dependsOnMethods = { "search", "passengerInfo" }, alwaysRun = true)
            public void assertEssentials(){
        PassengerEssentialsPage essentials = new PassengerEssentialsPage(driver);
        essentials.assertOutboundFlight("DUBLIN to PARIS/CDG");
        essentials.assertInboundFlight("PARIS/CDG to DUBLIN");
    }
}