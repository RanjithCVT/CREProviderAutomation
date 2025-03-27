package POM_Pages;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InspectionPIN_POM {
    public AndroidDriver driver;

    public InspectionPIN_POM(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*  @FindBy(id="")
    public WebElement k;   */     //283733

    @FindBy(id = "com.psb.ivr:id/ic_menu_action_serach")
    public WebElement SearchBar;

    @FindBy(id = "com.psb.ivr:id/search_src_text")
    public WebElement SearchBar_TextBox;

    @FindBy(id = "com.psb.ivr:id/txtCheckIn")
    public WebElement Check_In_Button_Searched_Store;

    @FindBy(xpath = "//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.psb.ivr:id/compose_view_inspection_queue\"]/android.view.View/android.view.View/android.view.View[1]")
    public WebElement FirstInspection_Listing;

    @FindBy(id = "com.psb.ivr:id/btnProceed")
    public WebElement CheckOutButton;

    public String YesButton = "(//android.widget.ImageView[@resource-id=\"com.psb.ivr:id/imgYes\"])";
    public String NoButton = "(//android.widget.ImageView[@resource-id=\"com.psb.ivr:id/imgNo\"])";
    public String ImageCapture = "(//android.widget.ImageView[@resource-id=\'com.psb.ivr:id/imgCamera\'])";
    public String NotesIcon = "(//android.widget.ImageView[@resource-id=\"com.psb.ivr:id/imgNotes\"])";

    @FindBy(id = "com.psb.ivr:id/parentLayout")
    public WebElement NotesPopup;

    @FindBy(id = "com.psb.ivr:id/edtNotes")
    public WebElement NotesTextbox;

    @FindBy(id = "com.psb.ivr:id/btnSubmit")
    public WebElement NOtesSubmitButton;

    @FindBy(id = "com.psb.ivr:id/take_picture")
    public WebElement ImageCapturingIcon;

    @FindBy(id = "com.psb.ivr:id/txtDone")
    public WebElement ImageDoneButton;

    @FindBy(id = "android:id/button1")
    public WebElement MoreImageOkButton;

    @FindBy(id = "com.psb.ivr:id/txtToolbarTitle")
    public WebElement SignoffPageTitle;

    @FindBy(id = "com.psb.ivr:id/edtFullName")
    public WebElement Firstname;

    @FindBy(id = "com.psb.ivr:id/edtLastname")
    public WebElement Lastname;

    @FindBy(id = "android:id/text1")
    public WebElement TitleDropdown;

    @FindBy(xpath = "//android.widget.ListView")
    public WebElement TitleListingMenu;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Store Manager\"]")
    public WebElement StoremanagerTitle;

    @FindBy(id = "com.psb.ivr:id/edtComments")
    public WebElement CommentsBox;

    @FindBy(id = "com.psb.ivr:id/linearSignature")
    public WebElement SignatureBox;

    @FindBy(id = "com.psb.ivr:id/edtSignOff")
    public WebElement SignatureDrawingBox;

    @FindBy(id = "com.psb.ivr:id/btnApprove")
    public WebElement ApproveButton;

    @FindBy(id = "com.psb.ivr:id/btnClear")
    public WebElement Clearbutton;

    @FindBy(id = "com.psb.ivr:id/btnProceed")
    public WebElement CompleteButton;


// (//android.widget.ImageView[@resource-id="com.psb.ivr:id/imgCamera"])[2]
// (//android.widget.ImageView[@resource-id="com.psb.ivr:id/imgNotes"])[2]


    //Questions

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Have the entrance doors been sprayed and wiped down?*\"]")
    public WebElement Question1;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Were the waste receptacles empty and spot cleaned?\"]")
    public WebElement Question2;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Is the surface of the entrance mat clean and vacuumed? Is the surface generally free of dirt, and debris, and gum?\"]")
    public WebElement Question3;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Is the entrance, front end, and main racetrack fully swept and fully mopped? Are floors generally free of dust bunnies, dirt, debris, gum, stickers, and spills (including under fixtures and gondolas)?\"]")
    public WebElement Question4;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Are secondary areas (perimeter and non-racetrack aisles) fully swept and spot mopped where needed? Are floors generally free of dust bunnies, dirt, debris, gum, stickers, and spills (including under fixtures and gondolas)?\"]")
    public WebElement Question5;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Are fitting room floors (including standard and self-service) fully swept and fully mopped? Are floors generally free of dust bunnies, dirt, debris, gum, stickers, and spills?\"]")
    public WebElement Question6;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Are all fitting room fixtures (including standard and self-service) spot-cleaned? Are fixtures and partitions generally free of dust, dirt, debris, gum, stickers, or spills?\"]")
    public WebElement Question7;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Are all restroom urinals, toilets, sinks, and floors fully clean? Are they generally free of dust, dirt, debris, gum, stickers, spills?\"]")
    public WebElement Question8;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Are restroom walls, doors, and partitions spot cleaned? Are they generally free of dust, dirt, debris, gum, stickers, and spills?\"]")
    public WebElement Question9;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Have soap and toilet paper dispensers been replenished?\"]")
    public WebElement Question10;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Is the back office and associate lounge fully swept and spot mopped where needed? Are floors generally free of dust bunnies, dirt, debris, gum, stickers, and spills?\"]")
    public WebElement Question11;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Are corners and edges clean and well maintained? Areas around the front doors, EAS security towers, cash wrap bases, perimeter walls, fitting rooms, restrooms and hallways.\"]")
    public WebElement Question12;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Are the tops of perimeter base decks/grid wall, fitting room, valances, fixtures, hanging signs, register lane markers and amazon lockers (select stores) free of dust? Have the security domes/monitors and vents been cleaned?\"]")
    public WebElement Question13;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"Has the the restroom been deep cleaned and sanitized (walls wiped and disinfected, machine scrub floors and enzyme treatment in drains)?\"]")
    public WebElement Question14;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"In the Janitor’s closet, is the sheet posted and up-to-date? Is the correct SOW and other required documentation posted on the inside of the door? Is the equipment in good condition, walls, floors and mop sink clean and orderly?\"]")
    public WebElement Question15;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.psb.ivr:id/txtTitle\" and @text=\"In the Janitor’s closet, is the sheet posted and up-to-date? Is the correct SOW and other required documentation posted on the inside of the door? Is the equipment in good condition, walls, floors and mop sink clean and orderly?\"]")
    public WebElement Question16;

}
