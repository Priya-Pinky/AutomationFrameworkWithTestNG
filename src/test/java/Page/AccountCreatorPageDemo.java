package Page;

public class AccountCreatorPageDemo
  {
    @FindBy(xpath="http:www.com") WebElement userName;
     @FindBys(xpath="http:www.com")List<WebElement> password;
     @FindBys(xpath="http:www.com")List<WebElement> data;
}
