package lippia.web.constants;


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


    public static final String  ADDITIONAL_INFO="xpath://h3[text()='Additional Information']";
    public static final String REQUEST_DETAILS ="xpath://h3[text()='Billing Details']";
    public static final String ORDER="xpath://h3[text()='Your order']";

    public static final String NAME="id:billing_first_name";
    public static final String SURNAME="id:billing_last_name";
    public static final String COMPANY_NAME="id:billing_company";
    public static final String EMAIL="id:billing_email";
    public static final String PHONE="id:billing_phone";


    public static final String COUNTRY="xpath://div[@id='s2id_billing_country']/input[@class='select2-focusser select2-offscreen']";

    public static final String ADRESS="xpath://*[@id='billing_address_1']";
    public static final String DPTO="xpath://*[@id='billing_address_2']";
    public static final String LOCATION="xpath://input[@id='billing_city']";




    public static final String STATE="xpath://div[@id='s2id_billing_state']/input[@class='select2-focusser select2-offscreen']";

    public static final String POSTAL_CODE="xpath://input[@id='billing_postcode']";

    public static final String BANK_TRANSFER="xpath://div/ul/li/input[@id='payment_method_bacs']";
    public static final String CHEQUE_PAYMENT="xpath://div/ul/li/input[@id='payment_method_cheque']";
    public static final String COD_PAYMENT="xpath://div/ul/li/input[@id='payment_method_cod']";
    public static final String PAYPAL_PAYMENT="xpath://div/ul/li/input[@id='payment_method_ppec_paypal']";



//ADS
    public static final String AD_IFRAME1_XPATH = "xpath:/html/ins/*/*[contains(@id, 'aswift_') and not(contains(@id, 'host'))]";
    public static final String AD_IFRAME2_XPATH = "xpath://*[@id='ad_iframe']";
    public static final String AD_CLOSE_BUTTON_XPATH = "xpath://*[@id='dismiss-button']";



}
