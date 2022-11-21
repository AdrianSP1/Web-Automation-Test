package lippia.web.constants;

import org.openqa.selenium.WebElement;

public class HomeConstants {
    public static final String SHOP_MENU = "xpath://a[text()='Shop']";
    public static final String HOME = "xpath://a[text()='Home']";
    public static final String HTML_BOOK = "xpath://img[@title='Thinking in HTML']";
    public static final String RUBY_BOOK ="xpath://img[@title='Selenium Ruby']";
    public static final String JAVASCRIPT_BOOK = "xpath://img[@title='Mastering JavaScript']";
    public static final String NEXT_ARRIVAL = "xpath://div[@id='n2-ss-6-arrow-next']";
    public static final String VERIFY_JS = "xpath://h1[text()='Mastering JavaScript']";

    public static final String ADD_CART_JS ="xpath://button";
    public static final String MENU_ITEMS ="xpath://span[@class='cartcontents']";
    public static final String PRICE_SUBTOTAL ="xpath://td[@class='product-subtotal']/span[@class='woocommerce-Price-amount amount']";
    public static final String PRICE_TOTAL ="xpath://strong/span[@class='woocommerce-Price-amount amount']";
    public static final String CONTINUE_PAYMENTS ="xpath://a[@class='checkout-button button alt wc-forward']";



//ADS
    public static final String AD_IFRAME1_XPATH = "xpath:/html/ins/*/*[contains(@id, 'aswift_') and not(contains(@id, 'host'))]";
    public static final String AD_IFRAME2_XPATH = "xpath://*[@id='ad_iframe']";
    public static final String AD_CLOSE_BUTTON_XPATH = "xpath://*[@id='dismiss-button']";



}
