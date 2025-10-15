package Page;

public class AccountCreatorPageDemo
  {
    @FindBy(xpath="http:www.com") WebElement userName;
    @FindBy(xpath="http:www.com") WebElement uuserName;

     @FindBys(xpath="http:www.com")List<WebElement> password;
     @FindBys(xpath="http:www.com")List<WebElement> data;
         @FindBys(xpath="http:www.com")List<WebElement> data2;


}
