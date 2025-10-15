package Page;

public class CustomerIdCreationPageDemo
{
	@FindBy(xpath="http:www.com") WebElement userName;
    @FindBys(xpath="http:www.com")List<WebElement> password;

}
