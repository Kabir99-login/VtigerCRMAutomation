package object_repo;

public class HomePage {

  public HomePage(WebDriver driver){
    PageFactory.initElements(driver,this);

}
  @FindBy(id="username")
  private WebElement username
