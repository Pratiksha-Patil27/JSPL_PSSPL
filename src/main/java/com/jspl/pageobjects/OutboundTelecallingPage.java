package com.jspl.pageobjects;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class OutboundTelecallingPage extends BasePage {

	@FindBy(xpath = "//div[@class=\"page-content\"]/div/header/div/div[2]/div/button[1]")
	private WebElement taskTypePopUp;

	@FindBy(xpath = "//div[@class=\"page-content\"]/div/header/div/div[2]/div/button")
	private List<WebElement> callButtons;

	@FindBy(xpath = "//h6[@class=\"my-0\"]/label")
	private WebElement closeTaskLable;
	
	@FindBy(xpath ="//button[@class=\"btn btn-success\"]")
	private WebElement closeTaskSubmitButton;
	
	@FindBy(xpath ="//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]")
	private WebElement closeTaskSubmitBreakButton;
	
	@FindBy(xpath ="//div[text()=\"Please Enter Remark\"]")
	private WebElement closeTaskRemarkWarningMsg;
	
	@FindBy(xpath ="//button[@class=\"btn btn-danger\"]")
	private WebElement closeTaskCancelButton;
	
	@FindBy(xpath ="//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i")
	private WebElement closeTaskCrossIcon;
	
	@FindBy(xpath = "//h6[@class=\"my-0\"]/label")
	private WebElement rescheduleCallLable;
	
	@FindBy(xpath ="//button[@class=\"btn btn-success\"]")
	private WebElement rescheduleCallSubmitButton;
	
	@FindBy(xpath ="//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]")
	private WebElement rescheduleCallSubmitBreakButton;
	
	@FindBy(xpath ="//div[text()=\"Please Select Schedule Status\"]")
	private WebElement rescheduleCallStatusWarningMsg;
	
	@FindBy(xpath ="//button[@class=\"btn btn-danger\"]")
	private WebElement rescheduleCallCancelButton;
	
	@FindBy(xpath ="//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i")
	private WebElement rescheduleCallCrossIcon;
	
	@FindBy(xpath ="//div[@class=\"btn-group\"]/div/button")
	private List<WebElement> transactionButtons;

	@FindBy(xpath ="//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[5]/div/div/button")
	private WebElement productCatalog;
	
	@FindBy(xpath = "//h6[@class=\"my-0\"]/label")
	private WebElement productCatalogueLable;
	

	@FindBy(xpath = "//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i")
	private WebElement productCatalogueCrossIcon;
	
	@FindBy(xpath ="//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[4]/div/div/button")
	private WebElement pointsBtnDropdown;
	
	@FindBy(xpath = "//h6[@class=\"my-0\"]/label")
	private WebElement pointsMenuLable;
	
	@FindBy(xpath = "//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i")
	private WebElement pointsMenuCross;
	
	@FindBy(xpath ="//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[3]/div/div/button[2]")
	private WebElement escalationListMenu;
	
	@FindBy(xpath = "//h6[@class=\"my-0\"]/label")
	private WebElement escalationListMenuLable;
	
	@FindBy(xpath = "//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i")
	private WebElement escalationListMenuCrossIcon;
	
	@FindBy(xpath = "//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[3]/div/div/button[1]")
	private WebElement addEscalationMenu;
	
	@FindBy(xpath = "//h6[@class=\"my-0\"]/label")
	private WebElement addEscalationMenuLable;
	
	@FindBy(xpath ="//button[@class=\"btn btn-success\"]")
	private WebElement addEscalationMenuSubmitButton;

	@FindBy(xpath ="//div[text()=\"Please select Escalation Tag.\"]")
	private WebElement addEscalationSelectTagWarningMsg;
	
	@FindBy(xpath ="//button[@class=\"btn btn-danger\"]")
	private WebElement addEscalationMenuCancelBtn;
	
	@FindBy(xpath ="//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i")
	private WebElement addEscalationMenuCrossIcon;
	
	@FindBy(xpath ="//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[2]")
	private WebElement redemptionHistoryMenu;
	
	@FindBy(xpath ="//h6[@class=\"my-0\"]/label")
	private WebElement redemptionHistoryMenuLable;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/div/button/i")
	private WebElement redemptionHistoryCrossIcon;
	
	@FindBy(xpath ="//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[2]/div/div/button[1]")
	private WebElement addRedemptionMenu;
	
	@FindBy(xpath ="//h6[@class=\"my-0\"]/label")
	private WebElement addRedemptionMenuLable;
	
	@FindBy(xpath ="//button[@class=\"btn btn-success\"]")
	private WebElement addRedemptionSubmitButton;
	
	@FindBy(xpath ="//div[text()=\"Please select Gift\"]")
	private WebElement addRedemptionGiftFieldWarningMsg;
	
	@FindBy(xpath ="//button[@class=\"btn btn-danger\"]")
	private WebElement addRedemptionCancelButton;
	
	@FindBy(xpath ="//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i")
	private WebElement addRedemptionCrossIcon;
	
	@FindBy(xpath ="//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[1]")
	private WebElement addClaimMenu;
	
	@FindBy(xpath ="//h6[@class=\"my-0\"]/label")
	private WebElement addClaimMenuLable;
	
	@FindBy(xpath ="//button[@class=\"btn btn-success\"]")
	private WebElement addClaimSubmitBtn;
	
	@FindBy(xpath ="//div[text()=\"Please select dealer\"]")
	private WebElement addClaimDealerFieldWarningMsg;
	
	@FindBy(xpath ="//button[@class=\"btn btn-danger\"]")
	private WebElement addClaimCancelButton;
	
	@FindBy(xpath ="//button[@class=\"waves-effect btn btn-link p-0 btn btn-btn-link\"]/i")
	private WebElement addClaimCrossIcon;
	
	@FindBy(xpath ="//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[2]")
	private WebElement claimStatusMenu;
	
	@FindBy(xpath ="//h6[@class=\"my-0\"]/label")
	private WebElement claimStatusMenuLable;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/div/div[1]/div[5]/button/i")
	private WebElement claimStatusCrossIcon;
	
	@FindBy(xpath ="//*[@id=\"layout-wrapper\"]/div[2]/div/div/div[3]/div[1]/div/div/button[3]")
	private WebElement verifyClaimMenu;
	
	@FindBy(xpath ="//*[@id=\"getClaimVerifyDetails\"]/div/div/div/div[1]/div[2]/h6/label")
	private WebElement verifyClaimMenuLable;
	
	@FindBy(xpath ="//*[@id=\"ESCID\"]/div/div[2]/div")
	private WebElement escalationFieldDropdownArrow;
	
	@FindBy(xpath ="//div[@class=\"css-qr46ko\"]/div")
	private List<WebElement> escalationFieldDropdownValues;
	
	@FindBy(id ="ESCALATIONREMARK")
	private WebElement escalationRemarkField;
	
	@FindBy(id ="swal2-title")
	private WebElement addEscalationSuccessPopUp;
	
	@FindBy(xpath="//button[text()=\"OK\"]")
	private WebElement addEscalationSuccessPopUpOkBtn;
	
	@FindBy(id="search")
	private WebElement escalationListSearchFilter;
	
	@FindBy(xpath="//div[text()=\"There are no records to display\"]")
	private WebElement escalationListNoRecordsLable;
	
	@FindBy(xpath="//div[text()=\"Please select dealer\"]")
	private WebElement addClaimDealFieldWarningMsg;
	
	@FindBy(xpath="//div[text()=\"Please enter customer name\"]")
	private WebElement addClaimCustNameFieldWarningMsg;
	
	@FindBy(xpath="//div[text()=\"Please enter customer number\"]")
	private WebElement addClaimCustNumberFieldWarningMsg;
	
	@FindBy(xpath="//div[text()=\"Please enter site address\"]")
	private WebElement addClaimCustAddressFieldWarningMsg;
	
	@FindBy(xpath="//div[text()=\"Please select product\"]")
	private WebElement addClaimProductFieldWarningMsg;
	
	@FindBy(xpath="//div[text()=\"Please enter points\"]")
	private WebElement addClaimPointsFieldWarningMsg;
	
	@FindBy(xpath="//div[text()=\"Please enter qty\"]")
	private WebElement addClaimQtyFieldWarningMsg;
	
	@FindBy(xpath="//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[3]/div/div/button")
	private WebElement addClaimPlusButton;
	
	@FindBy(xpath="//div[text()=\"Fill all required fields before adding a new row.\"]")
	private WebElement addClaimErrorToastForPlusBtn;
	
	@FindBy(xpath="//button[@title=\"click to delete row\"]")
	private WebElement addClaimDeleteIcon;
	
	@FindBy(xpath="//div[text()=\"Your are not able to delete all product. At least one product is required\"]")
	private WebElement addClaimErrorToastForDeleteBtn;
	
	@FindBy(xpath="//div[@class='css-1nmdiq5-menu']/div/div[1]")
	private WebElement addClaimDealerFieldFristDropDownValue;
	
	@FindBy(xpath="//div[@id=\"SLID\"]/div[1]/div[1]")
	private WebElement addClaimDealerField;
	
	@FindBy(xpath="//div[@class=\"css-1nmdiq5-menu\"]/div/div")
	private List<WebElement> addClaimDealerDropValues;
	
	@FindBy(id="INVCNO")
	private WebElement addClaimINVNoField;
	
	@FindBy(xpath="//*[@class= \"input-group\"]/input[2]")
	private WebElement addClaimInvDateField;
	
	@FindBy(xpath="//span[@class=\"flatpickr-day\"]")
	private List<WebElement> addClaimInvDateTable;
	
	
	@FindBy(id="CUSTOMERNAME")
	private WebElement addClaimCustNameField;
	
	@FindBy(id="CUSTOMERMOBILENO")
	private WebElement addClaimCustNoField;
	
	@FindBy(id="CUSTOMERADDRESS")
	private WebElement addClaimCustAddressField;
	
	@FindBy(id="fileUploadInput")
	private WebElement addClaimFileUploadField;
	
	@FindBy(xpath="//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[3]/div/div/table/tbody/tr/td[2]/div/div/div[1]/div[2]")
	private WebElement addClaimProductField;
	
	@FindBy(xpath="//div[@class=\"css-qr46ko\"]/div")
	private List<WebElement> addClaimProductDropValues;

	@FindBy(name="CLAIMITEMS[0].QTY")
	private WebElement addClaimQtyField;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div/form/div[2]/div[3]/div/div/table/tbody/tr")
	private List<WebElement> addClaimPageTableBody;
	
	@FindBy(xpath="//h2[@id=\"swal2-title\"]")
	private WebElement addClaimSuccsessDialogBox;
	
	@FindBy(xpath="//button[text()=\"OK\"]")
	private WebElement addClaimSuccsessDialogOkBtn;
	
	@FindBy(xpath="//div[@id=\"cell-2-undefined\"]/a")
	private List<WebElement> claimIdsOnClaimStatus ;
	
	@FindBy(xpath="//div[@id=\"row-0\"]/div[2]/a")
	private WebElement claimPDFOfclaimStatus ;
	
	@FindBy(xpath="//label[text()=\"Claim Status PDF\"]")
	private WebElement claimStatusPDFLable ;
	
	@FindBy(xpath="/html/body/div[3]/div/div[1]/div/div/div/div[1]/div[5]/button/i")
	private WebElement claimStatusPDFCrossIcon ;
	
	@FindBy(id="search")
	private WebElement claimStatusSearchFilter ;
	
	@FindBy(xpath="//div[text()=\"There are no records to display\"]")
	private WebElement claimStatusNoRecordsLable;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div/div[1]/div[4]/button/i")
	private WebElement claimStatusDateFilterIcon;
	
	@FindBy(xpath="//span[text()=\"Filter\"]")
	private WebElement claimStatusDateFilterLable;
	
	@FindBy(xpath="//button[@class=\"btn-close\"]")
	private WebElement claimStatusDateFilterCrossIcon;
	
	@FindBy(xpath ="//div[text()=\"Please enter quantity\"]")
	private WebElement addRedemptionQtyFieldWarningMsg;
	
	@FindBy(xpath="//div[@class=\"css-hlgwow\"]")
	private WebElement addRedemptionGiftField;
	
	@FindBy(xpath="//div[@class=\"css-qr46ko\"]/div")
	private List<WebElement> addRedemptionGiftFieldDropValues;
	
	@FindBy(id="QUANTITY")
	private WebElement addRedemptionQtyField ;
	
	@FindBy(xpath="//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[1]/div[2]/span")
	private WebElement redemptionRewardPoints ;
	
	@FindBy(xpath="//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[1]/div[3]/input")
	private WebElement redemptionPoints ;
	
	@FindBy(xpath="//span[@class=\"rounded-pill bg-warning badge bg-secondary font-size-12\"]")
	private WebElement redemptionLockedPoints ;
	
	@FindBy(xpath="//span[@class=\"rounded-pill bg-success badge bg-secondary font-size-12\"]")
	private WebElement redemptionReedemablePoints ;
	
	@FindBy(xpath="//span[@class=\"rounded-pill bg-info badge bg-secondary font-size-12\"]")
	private WebElement redemptionTotalPoints ;
	
	@FindBy(xpath="//h2[contains(text(),'Submitted Successfully.')]")
	private WebElement addRedemptionSuccsessDialogBox;
	
	@FindBy(xpath="//button[text()=\"OK\"]")
	private WebElement addRedemptionSuccsessDialogOkBtn;
	
	@FindBy(xpath="//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span")
	private WebElement telePageTaskNo;
	
	@FindBy(id="REMARK")
	private WebElement closeTaskRemarkField;
	
	@FindBy(xpath="//button[text()=\"OK\"]")
	private WebElement closeTaskDialogBoxOkBtn;
	
	@FindBy(xpath="//div[@class=\"css-1wy0on6\"]")
	private WebElement rescheduleStatusField;
	
	@FindBy(xpath="//div[@class=\"css-5736gi-menu\"]/div/div")
	private List<WebElement> rescheduleStatusDropValues;
	
	@FindBy(id="ESCALATIONREMARK")
	private WebElement rescheduleRemarkField;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement rescheduleSuccessDialogOkBtn;
	
	
	@FindBy(xpath ="//div[@class='col-lg-3'][1]/div/div/div/div/div[2]/label")
	private WebElement pointsMenuEarnPoints;
	
	@FindBy(xpath ="//div[@class='col-lg-3'][2]/div/div/div/div/div[2]/label")
	private WebElement pointsMenuClosingPoints;
	
	@FindBy(xpath ="//div[@class='col-lg-3'][3]/div/div/div/div/div[2]/label")
	private WebElement pointsMenuLockPoints;
	
	@FindBy(xpath ="//div[@class='col-lg-3'][4]/div/div/div/div/div[2]/label")
	private WebElement pointsMenuRedeemablePoints;
	
	@FindBy(xpath ="//div[@class='sc-hHEhDq ixLfOj rdt_TableBody']/div")
	private List<WebElement> redemptionHistoryTableBody;
	
	@FindBy(id="search")
	private WebElement redemptionHistorySearchFilter;
	
	@FindBy(xpath="//div[text()=\"There are no records to display\"]")
	private WebElement redemptionHistoryNoRecordsLable;
	
	@FindBy(xpath="//div[@class='sc-hHEhDq ixLfOj rdt_TableBody']/div[1]/div[6]/div/button[1]")
	private WebElement redemptionHistoryViewDetailsIcon;
	
	@FindBy(xpath="//div[@class='sc-hHEhDq ixLfOj rdt_TableBody']/div[1]/div[6]/div/button[2]")
	private WebElement redemptionHistoryViewPDFIcon;
	
	@FindBy(xpath="//label[text()=\"Redemption History Details\"]")
	private WebElement redemptionHistoryDetailsLable;
	
	@FindBy(xpath ="//i[@class='mdi mdi-close text-white h4']")
	private WebElement redHistoryViewDetailsCrossIcon;
	
	@FindBy(xpath="//label[text()=\"Redemption Histoty PDF\"]")
	private WebElement redemptionHistoryPdfLable;
	
	@FindBy(xpath ="/html/body/div[3]/div/div[1]/div/div/div/div[1]/div[5]/button/i")
	private WebElement redHistoryPdfCrossIcon;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div/div[1]/div[4]/button/i")
	private WebElement redemptionHistoryDateFilterIcon;
	
	@FindBy(xpath="//span[text()=\"Filter\"]")
	private WebElement redHistoryDateFilterLable;
	
	@FindBy(xpath="//button[@class=\"btn-close\"]")
	private WebElement redHistoryDateFilterCrossIcon;
	
	@FindBy(xpath="//div[@class='css-19bb58m']")
	private WebElement redHistoryStatusDropdownField;
	
	@FindBy(xpath="//div[@class='css-1s9izoc']/div[2]/div")
	private List<WebElement> redHistoryStatusDropdownOptions;
	
	@FindBy(xpath="//button[@class='waves-effect waves-light btn-md btn btn-info mb-2 btn btn-secondary']/i")
	private WebElement redemptionHistoryFilterBtn;
	
	@FindBy(xpath="//input[@class='form-control flatpickr-input form-control input']")
	private WebElement redemptionHistoryDateInputField;
	
	@FindBy(xpath="//input[@id='DateRange']")
	private WebElement redemptionHistoryDateRangeField;
	
	@FindBy(xpath="//input[@class=\"numInput cur-year\"]")
	private WebElement redemptionHistoryDateFilterCurrYear;
	
	@FindBy(xpath="//span[@class=\"arrowDown\"]")
	private WebElement redemptionHistoryDateFilterDownArrow;
	
	@FindBy(xpath="//select[@class=\"flatpickr-monthDropdown-months\"]")
	private WebElement redemptionHistoryDateFilterMonthDropdown;
	
	@FindBy(xpath="//div[@class='dayContainer']/span")
	private List<WebElement> redemptionHistoryDateFilterDatevalues;
	
	@FindBy(xpath="//td[@class=\"text-warning\"]")
	private List<WebElement> claimStatusOnCloseTask ;
	
	@FindBy(xpath="//h2[text()=\"Task status is not closed\"]")
	private WebElement closeTaskWarningDialogMsg;
	
   @FindBy(xpath="//*[@id=\"getClaimVerifyDetails\"]/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/button")
	private WebElement verifyButtonOfClaimVerification;
	
	@FindBy(xpath="//h6[@class=\"my-0\"]/label")
	private WebElement claimVerificationLabel;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement claimVerificationSubmitBtn;
	
	@FindBy(xpath="//button[normalize-space()='Submit & Break']")
	private WebElement claimVerificationSubmitBreakBtn;
	
	@FindBy(xpath="//div[text()=\"Please select verify status.\"]")
	private WebElement claimVerificationErrorToastMsgForStatus;
	
	@FindBy(xpath="//button[@class=\"btn btn-danger\"]")
	private WebElement claimVerificationCancelBtn;
	
	@FindBy(xpath="//button[@class=\"waves-effect btn btn-link p-0\"]/i")
	private WebElement claimVerificationCrossIcon;
	
	@FindBy(xpath="//div[@class=\"px-2\"]/div/table/tbody/tr")
	private  List<WebElement> rowsCountOfSpecificClaim;
	
	@FindBy(xpath="//div[text()=\"Verify Quantity should not be greater than Claimed Quantity\"]")
	private WebElement claimVerificationErrorToastMsgForMaxClaimedQty;
	
	@FindBy(xpath="//div[@class=\"css-qr46ko\"]/div")
	private  List<WebElement> claimStatusDropValues;
	
	@FindBy(xpath="//div[@class=\"css-qr46ko\"]/div")
	private  List<WebElement> rejectReasonDropValues;
	
	@FindBy(xpath="//div[text()=\"Please select rejection reason\"]")
	private WebElement claimVerificationErrorToastMsgForRejectReasonField;
	
	@FindBy(xpath="//html/body/div[2]/div/div[1]/div/div/form/div[1]/div[3]/h6")
	private WebElement claimVerificationDate;
	
	@FindBy(xpath="//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[1]/div[1]")
	private WebElement claimVerificationInfluencerName;
	
	@FindBy(xpath="//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[1]/div[2]")
	private WebElement claimVerificationInfluencerMobileNo;
	
	@FindBy(xpath="//div[@class='float-end']")
	private WebElement claimVerificationTotalRecors;
	
	@FindBy(xpath="//*[@id=\"TelecallingInfoDiv\"]/div/div/div/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/label")
	private WebElement openedTaskInfluncerName;
	
	@FindBy(xpath="//*[@id=\"TelecallingInfoDiv\"]/div/div/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[2]/label")
	private WebElement openedTaskInfluncerMobileNo;
	
	@FindBy(xpath="//label[text()='Verification Submitted Successfully']")
	private WebElement claimVerificationSuccessPopup;
	
	@FindBy(xpath="//button[text()=\"Ok\"]")
	private WebElement claimVerificationSuccessPopupOkBtn;
	
	@FindBy(xpath="//button[@class=\"btn btn-primary btn-sm dropdown-toggle\"]")
	private WebElement inflVerificationVerificationBtn;
	
	@FindBy(xpath="//button[text()=\"Influencer Verification\"]")
	private WebElement influencerVerificationMenu;
	
	@FindBy(xpath="//label[text()=\"Influencer Verification\"]")
	private WebElement influencerVerificationMenuLabel;
	
	@FindBy(xpath="//button[@class=\"btn btn-success\"]")
	private WebElement influencerVerificationMenuSubmitBtn;
	
	@FindBy(xpath="//button[@class=\"btn btn-primary me-md-2 btn btn-primary\"]")
	private WebElement influencerVerificationMenuSubmitBreakBtn;
	
	@FindBy(xpath="//button[@class=\"btn btn-danger\"]")
	private WebElement influencerVerificationMenuCancelBtn;
	
	@FindBy(xpath="//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i")
	private WebElement influencerVerificationPopUpCrossIcon;
	
	@FindBy(xpath="//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i")
	private WebElement influencerVerificationMenuCrossIcon;

	@FindBy(xpath="//div[text()=\"Please Enter year in Construction business\"]")
	private WebElement influencerVerificationMenuYearsInBussinessFieldWarningMsg;
	
	@FindBy(xpath="//div[text()=\"Please Enter Number of masons working under him\"]")
	private WebElement influencerVerificationMenuNoOfMasonsFieldWarningMsg;
	
	@FindBy(xpath="//div[text()=\"Please Enter Current Number of Sites\"]")
	private WebElement influencerVerificationMenuCurrentSitesNoFieldWarningMsg;
	
	@FindBy(xpath="//div[text()=\"Please Enter  Number of Sites per Year\"]")
	private WebElement influencerVerificationMenuSitesPerYearFieldWarningMsg;
	
	@FindBy(xpath="//div[text()=\"Please select Brand Used\"]")
	private WebElement influencerVerificationMenuBrandUsedFieldWarningMsg;
	
	@FindBy(xpath="//div[text()=\"Please select Most Preferred Brand\"]")
	private WebElement influencerVerificationMenuMostPreferredBrandFieldWarningMsg;
	
	@FindBy(xpath="//div[text()=\"Please select Status\"]")
	private WebElement influencerVerificationMenuStatusFieldWarningMsg;
	
	@FindBy(xpath="//h2[text()=\"Verification Saved\"]")
	private WebElement influencerVerificationSuccessPopUp;
	
	@FindBy(xpath="//button[text()=\"OK\"]")
	private WebElement influencerVerificationSuccessPopUpOkBtn;
	
	@FindBy(id="YEARSINBIZ")
	private WebElement influencerVerificationMenuYearsInBussField;
	
	@FindBy(id="NOOFMASONS")
	private WebElement influencerVerificationMenuNoOfMasonsField;
	
	@FindBy(id="CURRENTSITESNO")
	private WebElement influencerVerificationMenuCurrentNoSitesField;
	
	@FindBy(id="SITESPERYEAR")
	private WebElement influencerVerificationMenuNoOfSiteYearField;
	
	@FindBy(xpath="//div[@class='py-1 row']/div[1]/div/div/div[1]")
	private WebElement influencerVerificationMenuBrandUsedField;
	
	@FindBy(xpath="//div[@class=\"css-1nmdiq5-menu\"]/div/div")
	private  List<WebElement> inflVerificationBrandUsedDropDownValues;
	
	
	@FindBy(xpath="//div[@class='py-1 row']/div[2]/div/div/div[1]")
	private WebElement influencerVerificationMenuMostPreferredBrandField;
	
	@FindBy(xpath="//div[@class='css-1nmdiq5-menu']/div/div")
	private  List<WebElement> inflVerificationMostPreferredBrandDropDownValues;
	
	
	@FindBy(xpath="//div[@class='py-1 row']/div[3]/div/div/div[1]")
	private WebElement influencerVerificationMenuStatusField;
	
	@FindBy(xpath="//div[@class='css-1nmdiq5-menu']/div/div")
	private  List<WebElement> inflVerificationStatusDropDownValues;

	
	public OutboundTelecallingPage(WebDriver driver) {
		super(driver);

	}

	public String getTaskTypeFromApplication() {
		waitVisibilityOf(taskTypePopUp);
		String taskType = taskTypePopUp.getText();
		return taskType;

	}

	public void clickOnCallActionButton(String actionButtonValue) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
		}
		List<WebElement> callElements = callButtons;
		for (WebElement callElement : callElements) {
			String actionButton = callElement.getText();
			if (actionButton.equals(actionButtonValue)) {
				click(callElement);
				break;
			}

		}	
      }
	
	public boolean verifyCloseTaskLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(closeTaskLable);
			displayStatus = closeTaskLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	
	public void clickOnCloseTasksubmitButton()
	{
		waitVisibilityOf(closeTaskSubmitButton);
		click(closeTaskSubmitButton);
	}
	
	public boolean verifyCloseTaskRemarkWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			WaitVisibliltyOfLocated(By.xpath("//div[text()=\"Please Enter Remark\"]"));
			displayStatus = closeTaskRemarkWarningMsg.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnCloseTasksubmitBreakButton()
	{
		click(closeTaskSubmitBreakButton);
	}
	
	public void clickOnCloseTaskCancelButton()
	{
		click(closeTaskCancelButton);
	}
	
	public void clickOnCloseTaskCrossIcon()
	{
		click(closeTaskCrossIcon);
	}
	
	public boolean verifyRescheduleLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(rescheduleCallLable);
			displayStatus = rescheduleCallLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnRescheduleCallSubmitButton()
	{
		click(rescheduleCallSubmitButton);
	}
	
	public boolean verifyRescheduleCallStatusWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			WaitVisibliltyOfLocated(By.xpath("//div[text()=\"Please Select Schedule Status\"]"));
			displayStatus = rescheduleCallStatusWarningMsg.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnRescheduleCallSubmitBreakButton()
	{
		click(rescheduleCallSubmitBreakButton);
	}
	
	public void clickOnRescheduleCallCancelButton()
	{
		click(rescheduleCallCancelButton);
	}
	
	public void clickOnRescheduleCallCrossIcon()
	{
		click(rescheduleCallCrossIcon);
	}
	
	public void clickOnTransactionButton(String transactionButtonValue)
	{
		List<WebElement> transactionElements = transactionButtons;
		for (WebElement transactionElement : transactionElements) {
			waitVisibilityOfList(transactionButtons);
			String transactionButton = transactionElement.getText();
			if (transactionButton.equals(transactionButtonValue)) {
				waitVisibilityOf(transactionElement);
				//System.out.println(transactionButton);
			    click(transactionElement);
				break;
			}
		}
	}
	
	public boolean verifyCatalogOptionsDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(productCatalog);
			displayStatus = productCatalog.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	
	public void clickOnProductCatalog()
	{
		click(productCatalog);
	}
	
	public boolean verifyProductCatalogLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(productCatalogueLable);
			displayStatus = productCatalogueLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnProductCatalogCrossIcon()
	{
		click(productCatalogueCrossIcon);
	}
	public boolean verifyPointsOptionsDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(pointsBtnDropdown);
			displayStatus = pointsBtnDropdown.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnPointsOption()
	{
		click(pointsBtnDropdown);
	}
	
	public boolean verifyPointsLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(pointsMenuLable);
			displayStatus = pointsMenuLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnPointsMenuCrossIcon() {
		try {
			click(pointsMenuCross);
		} catch (Exception e) {
			
		}
	}
	
	public boolean verifyEscalationListMenuDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(escalationListMenu);
			displayStatus = escalationListMenu.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnEscalationListMenu()
	{
		click(escalationListMenu);
	}
	
	public boolean verifyEscalationListMenuLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(escalationListMenuLable);
			displayStatus = escalationListMenuLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnEscalationListCrossIcon() {
		try {
			click(escalationListMenuCrossIcon);
		} catch (Exception e) {
			
		}
	}
	public void clickOnAddEscalationMenu()
	{
		try {
		click(addEscalationMenu);
		} catch (Exception e) {

		}
	}
	
	public boolean verifyAddEscalationMenuLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addEscalationMenuLable);
			displayStatus = addEscalationMenuLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnAddEscalationMenuSubmitBtn() {
		try {
			click(addEscalationMenuSubmitButton);
		} catch (Exception e) {
			
		}
	}
	
	public boolean verifyAddEscalationSelectTagWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addEscalationSelectTagWarningMsg);
			displayStatus = addEscalationSelectTagWarningMsg.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnAddEscalationMenuCancelBtn()
	{ try {
		click(addEscalationMenuCancelBtn);
	} catch (Exception e) {
	}
	}
	
	public void clickOnAddEscalationMenuCrossIcon() {
		try {
			click(addEscalationMenuCrossIcon);
		} catch (Exception e) {
		}
	}
	
	public boolean verifyRedemptionHistoryMenuDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(redemptionHistoryMenu);
			displayStatus = redemptionHistoryMenu.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnRedemptionHistoryMenu()
	{ 
		click(redemptionHistoryMenu);
	}
	public boolean verifyRedemptionHistoryMenuLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(redemptionHistoryMenuLable);
			displayStatus = redemptionHistoryMenuLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnRedemptionHistoryCrossIcon()
	{ try {
		click(redemptionHistoryCrossIcon);
	} catch (Exception e) {
		
	}
	}
	
	public void clickOnAddRedemptionMenu()
	{
		click(addRedemptionMenu);
	}
	
	public boolean verifyAddRedemptionMenuLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addRedemptionMenuLable);
			displayStatus = addRedemptionMenuLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnAddRedemptionSubmitBtn()
	{
		click(addRedemptionSubmitButton);
	}
	
	
	public boolean verifyAddRedemptionGiftFieldWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addRedemptionGiftFieldWarningMsg);
			displayStatus = addRedemptionGiftFieldWarningMsg.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnAddRedemptionCancelBtn()
	{
		click(addRedemptionCancelButton);
	}
	
	public void clickOnAddRedemptionCrossIcon() {
		try {
			click(addRedemptionCrossIcon);
		} catch (Exception e) {
			
		}
	}

	public boolean verifyAddClaimMenuDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addClaimMenu);
			displayStatus = addClaimMenu.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnAddClaimMenu()
	{
		click(addClaimMenu);
	}
	
	public boolean verifyAddClaimMenuLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addClaimMenuLable);
			displayStatus = addClaimMenuLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnAddClaimSubmitBtn()
	{
		waitVisibilityOf(addClaimSubmitBtn);
		click(addClaimSubmitBtn);
	}
	
	public boolean verifyAddClaimDealerFieldWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addClaimDealerFieldWarningMsg);
			displayStatus = addClaimDealerFieldWarningMsg.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnAddClaimCancelBtn()
	{
		click(addClaimCancelButton);
	}
	
	public void clickOnAddClaimCrossIcon() {
		try {
			click(addClaimCrossIcon);
		} catch (Exception e) {
			
		}
	}
	
	public void clickOnClaimStatusMenu()
	{
		click(claimStatusMenu);
	}
	
	public boolean verifyClaimStatusMenuLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(claimStatusMenuLable);
			displayStatus = claimStatusMenuLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void clickOnClaimStatusCrossIcon() {
		try {
			click(claimStatusCrossIcon);
		} catch (Exception e) {
			
		}
	}
	
	public void clickOnVerifyClaimMenu()
	{
		click(verifyClaimMenu);
	}
	
	public boolean verifyVerifyClaimMenuLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(verifyClaimMenuLable);
			displayStatus = verifyClaimMenuLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}
	
	public void selectEscalationDropdownOption(String escalationDropdownValue)
	{
		click(escalationFieldDropdownArrow);
		WaitVisibliltyOfLocated(By.xpath("//div[@class=\"css-qr46ko\"]/div"));
		listContains(escalationFieldDropdownValues,escalationDropdownValue);
	}
	
	public void enterEscalationRemark(String remark)
	{
		waitVisibilityOf(escalationRemarkField);
		escalationRemarkField.sendKeys(remark);
	}
	
	public boolean verifyAddEscalationSuccessPopUpDisplay()
	{
		boolean displayStatus = false;
		
		try {
			WaitVisibliltyOfLocated(By.id("swal2-title"));
			displayStatus = addEscalationSuccessPopUp.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnAddEscalationSuccessPopUpOkBtn()
	{
		click(addEscalationSuccessPopUpOkBtn);
	}
	
	public void enterTextInEscalationSerachFilter(String text)
	{
		waitVisibilityOf(escalationListSearchFilter);
		escalationListSearchFilter.sendKeys(text);
	}

	public boolean verifyEscalationListNoRecordsLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(escalationListNoRecordsLable);
			displayStatus = escalationListNoRecordsLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public boolean verifyAddClaimDealFieldWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addClaimDealFieldWarningMsg);
			displayStatus = addClaimDealFieldWarningMsg.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public boolean verifyAddClaimCustNameFieldWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addClaimCustNameFieldWarningMsg);
			displayStatus = addClaimCustNameFieldWarningMsg.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public boolean verifyAddClaimCustNumberFieldWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addClaimCustNumberFieldWarningMsg);
			displayStatus = addClaimCustNumberFieldWarningMsg.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public boolean verifyAddClaimCustAddressFieldWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addClaimCustAddressFieldWarningMsg);
			displayStatus = addClaimCustAddressFieldWarningMsg.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public boolean verifyAddClaimProductFieldWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addClaimProductFieldWarningMsg);
			displayStatus = addClaimProductFieldWarningMsg.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public boolean verifyAddClaimPointsFieldWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addClaimPointsFieldWarningMsg);
			displayStatus = addClaimPointsFieldWarningMsg.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public boolean verifyAddClaimQtyFieldWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addClaimQtyFieldWarningMsg);
			displayStatus = addClaimQtyFieldWarningMsg.isDisplayed();
		} catch (Exception e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnAddClaimPlusBtn()
	{
		click(addClaimPlusButton);
	}
	
	public boolean verifyAddClaimErrorToastForPlusBtnDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addClaimErrorToastForPlusBtn);
			displayStatus = addClaimErrorToastForPlusBtn.isDisplayed();
		} catch (Exception e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void waitInvisibilityOfAddClaimErrorToastForPlusBtn()
	{
		//WaitInVisibliltyOfLocated(By.xpath("//div[text()=\"The first row is empty. Fill the first row before adding a new row.\"]"));
		waitInVisibilityOf(addClaimErrorToastForPlusBtn);
	}
	
	public void clickOnAddClaimDeleteBtn()
	{
		click(addClaimDeleteIcon);
	}
	
	public boolean verifyAddClaimErrorToastForDeleteBtnDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addClaimErrorToastForDeleteBtn);
			displayStatus = addClaimErrorToastForDeleteBtn.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void waitInvisibilityOfAddClaimErrorToastForDeleteBtn()
	{
		waitInVisibilityOf(addClaimErrorToastForDeleteBtn);
	}
	
	public void enterAddClaimCustomerDetails(String dealerCode, String invNo, String invoiceDate, String customerName,
			String customerContact, String customerAddress, String filePath) throws InterruptedException
	{
		waitVisibilityOf(addClaimDealerField);
		      click(addClaimDealerField);
		      
//		      By dealerDropDownLocators=By.xpath("//div[@class=\"css-1nmdiq5-menu\"]/div/div");
//				WaitVisibliltyOfLocated(dealerDropDownLocators);
//				List<WebElement> dealerElements =addClaimDealerDropValues ;
//				for (WebElement dealerElement : dealerElements) {
//					Thread.sleep(3000);
//					String dealCode = dealerElement.getText();
//					
//					if (dealCode.contains(dealerCode)) {
//						Thread.sleep(3000);
//						click(dealerElement);
//						break;
//					} else {
//						
//						System.out.println("Dealer code not found ");
//					}
//				}
		      
		      //Select Dealer Value
				waitVisibilityOf(addClaimDealerFieldFristDropDownValue);
				Thread.sleep(3000);
				click(addClaimDealerFieldFristDropDownValue);

				waitVisibilityOf(addClaimINVNoField);
				addClaimINVNoField.sendKeys(invNo);
				Thread.sleep(3000);
				click(addClaimInvDateField);
				List<WebElement> invoiceDateElements = addClaimInvDateTable;
				for (WebElement invoiceDateElement : invoiceDateElements) {
					String invDate = invoiceDateElement.getText();
					if (invDate.equals(invoiceDate)) 
					{
						click(invoiceDateElement);
						break;
				}
				
				}
				waitVisibilityOf(addClaimCustNameField);
				addClaimCustNameField.sendKeys(customerName);
				
				waitVisibilityOf(addClaimCustNoField);
				addClaimCustNoField.sendKeys(customerContact);
				
				waitVisibilityOf(addClaimCustAddressField);
				addClaimCustAddressField.sendKeys(customerAddress);
				

				waitVisibilityOf(addClaimFileUploadField);
				addClaimFileUploadField.sendKeys(filePath);
			
				}
	
	
//	public void selectAddClaimProducts(String productCodeValue, String productQty) throws InterruptedException 
//	{
//				boolean productSelected = false;
//				Thread.sleep(3000);
//				click(addClaimProductField);
//				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addClaimProductField);
//
//				// Use Actions class to click and send keys
//				Actions actions = new Actions(driver);
//				actions.moveToElement(addClaimProductField).click().sendKeys(productCodeValue).perform();
//				
//				List<WebElement> productElements =addClaimProductDropValues;
//				for (WebElement productElement : productElements)
//				{
//					String productcode = productElement.getText();
//					if (productcode.contains(productCodeValue))
//					{Thread.sleep(2000);
//					((JavascriptExecutor) driver).executeScript("arguments[0].click();", productElement);
//						productSelected = true;
//						break;
//					
//					}
//				}
//	
//				if (productSelected) {
//					System.out.println(productCodeValue + " Product is selected");
//				} else {
//					System.out.println("Product Code : " + productCodeValue + "  not found");
//				}
//				Thread.sleep(3000);
//				addClaimQtyField.sendKeys(productQty);			
//	}
	
	public void selectAddClaimProducts(String productCodeValue, String productQty) throws InterruptedException 
	{
	    boolean productSelected = false;
	    Thread.sleep(3000);
	    click(addClaimProductField);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addClaimProductField);

	    Actions actions = new Actions(driver);
	    actions.moveToElement(addClaimProductField).click().sendKeys(productCodeValue).perform();
	    
	    List<WebElement> productElements;
	    for (int attempt = 0; attempt < 3; attempt++) {
	        try {
	        	System.out.println("Add product");
	            productElements = addClaimProductDropValues;  // Re-fetch the list of elements each time
	            for (WebElement productElement : productElements) {
	                String productcode = productElement.getText();
	                if (productcode.contains(productCodeValue)) {
	                    Thread.sleep(2000);
	                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", productElement);
	                    productSelected = true;
	                    break;
	                }
	            }
	            if (productSelected) {
	                System.out.println(productCodeValue + " Product is selected");
	                break;
	            }
	        } catch (StaleElementReferenceException e) {
	            System.out.println("Stale Element found, retrying...");
	            Thread.sleep(1000);
	        }
	    }

	    if (!productSelected) {
	        System.out.println("Product Code : " + productCodeValue + " not found");
	    }

	    
	   click(addClaimQtyField);
	    addClaimQtyField.sendKeys(productQty);
	}

	
	
	public  int getCountOfTotalRowsOnAddClaimPage()
	{
		return addClaimPageTableBody.size();
	}
	
	public int getPointsValueOnAddClaim(int rowIndex)
	{
		By pointsLocator=By.xpath("//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[3]/div/div/table/tbody/tr["+rowIndex+"]/td[3]/input");
		WaitVisibliltyOfLocated(pointsLocator);
		String pointsValue=driver.findElement(pointsLocator).getAttribute("value");
		return Integer.parseInt(pointsValue.replace(",", ""));
	}
	
	public int getQtyValueOnAddClaim(int rowIndex)
	{
		By qtyLocator=By.xpath("//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[3]/div/div/table/tbody/tr["+rowIndex+"]/td[4]/input");
		String qtyValue=driver.findElement(qtyLocator).getAttribute("value");
		return Integer.parseInt(qtyValue.replace(",", ""));
		
	}
	
	public int getTotalPointsValueOnAddClaim(int rowIndex)
	{
		By totalPointsLocator=By.xpath("//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[3]/div/div/table/tbody/tr["+rowIndex+"]/td[5]/input");
		String totalPointsValue=driver.findElement(totalPointsLocator).getAttribute("value");
		return Integer.parseInt(totalPointsValue.replace(",", ""));
		
	}
	
	public String getClaimIDOfAddedClaim()
	{
		waitVisibilityOf(addClaimSuccsessDialogBox);
		String successMsg=addClaimSuccsessDialogBox.getText();
		String[] parts = successMsg.split(" ");
		return parts[2]; // This will be "C25202.."
	}
	
	public boolean verifyAddedClaimSuccessDialogBoxDisplay()
	{
		
		boolean displayStatus = false;
		try {
			waitVisibilityOf(addClaimSuccsessDialogBox);
			String successMsg=addClaimSuccsessDialogBox.getText();
			displayStatus =successMsg.contains("Submitted Successfully");
		
		} catch (Exception e) {
			displayStatus = false;
		}
		return displayStatus;
	
	}
	
	public void clickOnAddClaimSuccessDialogOkBtn()
	{
		try
		{
		click(addClaimSuccsessDialogOkBtn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public boolean verifyAddClaimIdDisplayOnClaimStatusPage(String generatedClaimID)
	{
		
		boolean displayStatus = false;
		try
		{
		WaitVisibliltyOfLocated(By.xpath("//div[@id=\"cell-2-undefined\"]/a"));
		// get claim Code from claim status
		List<WebElement> claimIdElements =claimIdsOnClaimStatus;
		for (WebElement claimIdElement : claimIdElements) {
            String claimId = claimIdElement.getText();
            if (claimId.contains(generatedClaimID)) {
                displayStatus = true; 
                break; 
            }
		}
		} catch (Exception e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnClaimStatusViewPDF()
	{
		click(claimPDFOfclaimStatus);
	}
	
	public boolean verifyClaimStatusPDFLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(claimStatusPDFLable);
			displayStatus = claimStatusPDFLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnClaimStatusPDFCrossIcon() {
		try {
			click(claimStatusPDFCrossIcon);
		} catch (Exception e) {
		}
	}
	
	public void enterTextInClaimStatusSearchFilter(String text)
	{
		waitVisibilityOf(claimStatusSearchFilter);
		claimStatusSearchFilter.sendKeys(text);
	}
	
	public boolean verifyClaimStatusNoRecordsLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(claimStatusNoRecordsLable);
			displayStatus = claimStatusNoRecordsLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnClaimStatusDateFilterIcon()
	{
		click(claimStatusDateFilterIcon);
	}
	
	public boolean verifyClaimStatusDateFilterLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(claimStatusDateFilterLable);
			displayStatus = claimStatusDateFilterLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnClaimStatusDateFilterCrossIcon() {
		try {
			click(claimStatusDateFilterCrossIcon);
		} catch (Exception e) {
			
		}
	}
	
	public boolean verifyAddRedemptionQtyFieldWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(addRedemptionQtyFieldWarningMsg);
			displayStatus = addRedemptionQtyFieldWarningMsg.isDisplayed();
		} catch (Exception e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void selectRedemptionGiftDropdownOption(String rewardCode)
	{
		click(addRedemptionGiftField);
		WaitVisibliltyOfLocated(By.xpath("//div[@class=\"css-qr46ko\"]/div"));
		listContains(addRedemptionGiftFieldDropValues,rewardCode);
	}
	
	public void enterRewardQtyOfAddRedemption(String rewardQty)
	{
		waitVisibilityOf(addRedemptionQtyField);
		addRedemptionQtyField.sendKeys(rewardQty);
	}
	
	public String getRedemptionRewardPoints()
	{
		waitVisibilityOf(redemptionRewardPoints);
		return redemptionRewardPoints.getText();
	}
	
	public String getRedemptionPoints()
	{
		waitVisibilityOf(redemptionPoints);
		return redemptionPoints.getAttribute("value");
	}
	
	public int getRedemptionLockedPoints()
	{
		waitVisibilityOf(redemptionLockedPoints);
		 String stringLockedPoints=redemptionLockedPoints.getText();;
		 String[] lockedStringParts = stringLockedPoints.split(":");
	     String lockedDigitPart = lockedStringParts[1].trim();
		return Integer.parseInt(lockedDigitPart.replace(",", ""));
	}
	
	public int getRedemptionReedemablePoints() {
		waitVisibilityOf(redemptionReedemablePoints);
		String stringReedemablePoints = redemptionReedemablePoints.getText();
		String[] reedemableStringParts = stringReedemablePoints.split(":");
		String reedemableDigitPart = reedemableStringParts[1].trim();
		return Integer.parseInt(reedemableDigitPart.replace(",", ""));
	}
	
	public int getRedemptionTotalPoints() {
		waitVisibilityOf(redemptionTotalPoints);
		String stringTotalPoints = redemptionTotalPoints.getText();
		String[] totalStringParts = stringTotalPoints.split(":");
		String totalDigitPart = totalStringParts[1].trim();
		return Integer.parseInt(totalDigitPart.replace(",", ""));
	}
	
	public boolean verifyAddRedemptionSuccessPopUpDisplay()
	{
		boolean displayStatus = false;
		
		try {
			WaitVisibliltyOfLocated(By.xpath("//h2[contains(text(), 'Submitted Successfully.')]"));
			displayStatus = addRedemptionSuccsessDialogBox.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnAddRedemptionSuccessPopUpOkBtn()
	{
		click(addRedemptionSuccsessDialogOkBtn);
	}
	
	
	public String getTelePageTaskNo()
	{
		By getTaskElement=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
		WaitVisibliltyOfLocated(getTaskElement);
		String taskText=telePageTaskNo.getText(); //call getText Method from BaseClass
		//System.out.println(taskText);
		// Find the starting index of the task number
	    int startIndex = taskText.indexOf("(")+2; // +2 to skip the space and the opening parenthesis
	    // Find the ending index of the task number
	    int endIndex = taskText.indexOf(")");
	    // Extract and return the task number
	   String taskNo =taskText.substring(startIndex, endIndex).trim();
	   return taskNo;
	}
	
	public WebElement taskNameAndNoPopUp()
	{
		waitVisibilityOf(telePageTaskNo);
		return telePageTaskNo;
	}
	
	public String getLoaderMsg()
	{
		By loaderElement=By.xpath("// div[@id=\"loader-container\"]/p");
		WaitVisibliltyOfLocated(loaderElement);
		return driver.findElement(loaderElement).getText();
		
		
	}
	
	public void waitInVisibilityOfLoader()
	{
		By loaderElement=By.xpath("//div[@id=\"loader-container\"]/p");
		WaitInVisibliltyOfLocated(loaderElement);
	}
	
	public void enterCloseTaskRemark(String remark)
	{
		waitVisibilityOf(closeTaskRemarkField);
		closeTaskRemarkField.sendKeys(remark);
		
	}
	
	public void clickOnCloseTaskDialogBoxOkBtn()
	{
		waitVisibilityOf(closeTaskDialogBoxOkBtn);
		click(closeTaskDialogBoxOkBtn);
		
	}
	
	public void selectRescheduleStatus(String statusValue) throws InterruptedException {

		waitVisibilityOf(rescheduleStatusField);
		click(rescheduleStatusField);
		Thread.sleep(2000);
		List<WebElement> statusDropdownElements = rescheduleStatusDropValues;
		for (WebElement statusDropdownElement : statusDropdownElements) {
			String statusDropdown = statusDropdownElement.getText();
			// System.out.println(statusDropdown);
			if (statusDropdown.equals(statusValue)) {
				System.out.println(statusDropdown);
				Thread.sleep(2000);
				statusDropdownElement.click();
				break;
			}
		}

	}
	
	public void enterRescheduleRemark(String remark)
	{
		waitVisibilityOf(rescheduleRemarkField);
		rescheduleRemarkField.sendKeys(remark);

	}
	
	
	public void clickOnCallBackLaterTime(int buttonIndex)
	{
		click(driver.findElement(By.xpath("//div[@class=\"d-grid gap-2 d-md-flex justify-content col\"]/button["+buttonIndex+"]")));	
	}
		
	public void clickOnRescheduleSuccessDialogOkBtn()
	{
		click(rescheduleSuccessDialogOkBtn);
	}
	
	
	public String getPointsMenuEarnPoints()
	{
		waitVisibilityOf(pointsMenuEarnPoints);
		return pointsMenuEarnPoints.getText();
		
	}
	
	public int getPointsMenuClosingPoints()
	{
		waitVisibilityOf(pointsMenuClosingPoints);
		 pointsMenuClosingPoints.getText();
		String stringClosingPoints=pointsMenuClosingPoints.getText();
		return Integer.parseInt(stringClosingPoints.replace(",", ""));
		
	}
	
	public int getPointsMenuLockPoints()
	{
		waitVisibilityOf(pointsMenuLockPoints);
		String stringClosingPoints=pointsMenuLockPoints.getText();
		return  Integer.parseInt(stringClosingPoints.replace(",", ""));
		
	}
	
	public int getPointsMenuRedeemablePoints()
	{
		waitVisibilityOf(pointsMenuRedeemablePoints);
		String stringRedeemablePoints=pointsMenuRedeemablePoints.getText();
		return Integer.parseInt(stringRedeemablePoints.replace(",", ""));
		
	}
	
	public String getAddedRedemptionCode()
	{
		String ilpNumber= null;
		waitVisibilityOf(addRedemptionSuccsessDialogBox);
		        String text =addRedemptionSuccsessDialogBox.getText(); 
		        int startIndex = text.indexOf("ILP");
		      
		        if (startIndex != -1) {
		            String substring = text.substring(startIndex);
		            int endIndex = substring.indexOf(" ");
		            if (endIndex == -1) {
		                endIndex = substring.length();
		            }
		             ilpNumber = substring.substring(0, endIndex);
		            System.out.println(ilpNumber);  // Outputs: ILP2503000006
		        } else {
		            System.out.println("No ILP number found");
		     
		        }
		        return ilpNumber;
		    }
	

	public boolean verifyAddedRedemptionNoDisplayOnRedemptionHistory(String redemptionNumber)
	{
		boolean displayStatus=false;
		for(int r=1;r<=redemptionHistoryTableBody.size();r++)
		{	
		WaitVisibliltyOfLocated(By.xpath("//div[@class='sc-hHEhDq ixLfOj rdt_TableBody']/div["+r+"]/div[2]"));
		String RedeNumber=driver.findElement(By.xpath("//div[@class='sc-hHEhDq ixLfOj rdt_TableBody']/div["+r+"]/div[2]")).getText();
		System.out.println("Added Redemption number in History : "+ RedeNumber);
		if(RedeNumber.equals(redemptionNumber))
		{
			displayStatus=true;
			break;
		}
		
		}
		return displayStatus;
	}
	
	public void enterTextInRedHistorySerachFilter(String text)
	{
		waitVisibilityOf(redemptionHistorySearchFilter);
		redemptionHistorySearchFilter.sendKeys(text);
	}

	public boolean verifyRedHistoryNoRecordsLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(redemptionHistoryNoRecordsLable);
			displayStatus = redemptionHistoryNoRecordsLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnRedHistoryViewDetailsIcon()
	{
        click(redemptionHistoryViewDetailsIcon);
	}
	
	public boolean verifyRedHistoryDetailsLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(redemptionHistoryDetailsLable);
			displayStatus = redemptionHistoryDetailsLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnRedHistoryViewDetailsCrossIcon()
	{
		click(redHistoryViewDetailsCrossIcon);
	}
	
	public void clickOnRedHistoryViewPdfIcon()
	{
        click(redemptionHistoryViewPDFIcon);
	}
	
	public boolean verifyRedHistoryPdfLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(redemptionHistoryPdfLable);
			displayStatus = redemptionHistoryPdfLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnRedHistoryPdfCrossIcon()
	{
		click(redHistoryPdfCrossIcon);
	}
	
	public void clickOnRedHistoryDateFilterIcon()
	{
		waitVisibilityOf(redemptionHistoryDateFilterIcon);
		click(redemptionHistoryDateFilterIcon);
	}
	
	public boolean verifyRedHistoryDateFilterLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(redHistoryDateFilterLable);
			displayStatus = redHistoryDateFilterLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnRedHistoryDateFilterCrossIcon()
	{
		click(redHistoryDateFilterCrossIcon);
	}
	
	public void clickOnRedHistoryStatusDropdownField()
	{
		click(redHistoryStatusDropdownField);
	}
	
	public void selectRedHistoryStatusDropdownOption(String redStatusValue) {
		for (WebElement redHistoryStatusDropdownOption : redHistoryStatusDropdownOptions) {
			String statusValue = redHistoryStatusDropdownOption.getText();
			if (statusValue.equals(redStatusValue)) {
				System.out.println("Selected Status Dropdown option : " + statusValue);
				click(redHistoryStatusDropdownOption);
				break;
			}

		}

	}
	
	public void clickOnRedHistoryApplyFilterBtn()
	{
		
		click(redemptionHistoryFilterBtn);
	}
	
	public String verifyStatusColumnOnRedHistory()
	{
		
		String RedemptionStatus=null;
		WaitVisibliltyOfLocated(By.xpath("//div[@class='sc-hHEhDq ixLfOj rdt_TableBody']/div[1]/div[5]"));
		for(int r=1;r<=redemptionHistoryTableBody.size();r++)
		{	
	    RedemptionStatus=driver.findElement(By.xpath("//div[@class='sc-hHEhDq ixLfOj rdt_TableBody']/div["+r+"]/div[5]")).getText();
		System.out.println("Redemption Status In Redemption History : "+ RedemptionStatus);
		}
		
		return RedemptionStatus;
	}
	
	public void clickOnRedHistoryDateInputField()
	{
		
		click(redemptionHistoryDateInputField);
	}
	
	public int getRedHistoryDateFilterCurrentYear()
	{
		waitVisibilityOf(redemptionHistoryDateFilterCurrYear);
		String currYearValue=redemptionHistoryDateFilterCurrYear.getAttribute("max");
		return Integer.parseInt(currYearValue);
	}
	
	
	public void clickOnDateFilterDownArrowOfRedHistory()
	{
		// Create Actions object
	    Actions actions = new Actions(driver);
	    actions.moveToElement(redemptionHistoryDateFilterDownArrow).perform();
	    WebElement elementToClick = redemptionHistoryDateFilterDownArrow;
	    click(elementToClick);	
	}
	
	public void selectRedHistoryDatefilterMonth(String month)
	{
		waitVisibilityOf(redemptionHistoryDateFilterMonthDropdown);
		WebElement monthDropDown=redemptionHistoryDateFilterMonthDropdown;
		Select select =new Select(monthDropDown);
		select.selectByVisibleText(month);
	}
	
	public void selectRedHistoryDatefilterDate(String date) {
		List<WebElement> dateSelectElements = redemptionHistoryDateFilterDatevalues;
		for (WebElement dateSelectElement : dateSelectElements) {
			String dateSelectValue = dateSelectElement.getText();
			System.out.println(dateSelectValue);
			if (dateSelectValue.equals(date)) {
				System.out.println("dateSelectValue : " + dateSelectValue);
	            Actions actions = new Actions(driver);
	            actions.doubleClick(dateSelectElement).perform();
				break;
			}
		}

	}
	
	public  String getCurrentDateInRedHistory()
	{
		waitVisibilityOf(redemptionHistoryDateInputField);
		 return redemptionHistoryDateInputField.getAttribute("value");
	}
	
	public  String getAppliedDateInRedHistory()
	{
		waitVisibilityOf(redemptionHistoryDateRangeField);
		 return redemptionHistoryDateRangeField.getAttribute("value");
	}
	
	
	
	
	public String getDateColumnValueOnRedHistory()
	{
		
		String RedemptionDate=null;
		WaitVisibliltyOfLocated(By.xpath("//div[@class='sc-hHEhDq ixLfOj rdt_TableBody']/div[1]/div[1]"));
		for(int r=1;r<=redemptionHistoryTableBody.size();r++)
		{	
		RedemptionDate=driver.findElement(By.xpath("//div[@class='sc-hHEhDq ixLfOj rdt_TableBody']/div["+r+"]/div[1]")).getText();
		System.out.println("Redemption Status In Redemption History : "+ RedemptionDate);
		}
		
		return RedemptionDate;
	}

	public String getClaimStatusOnCloseTask() {
		WaitVisibliltyOfLocated(By.xpath("//td[@class=\"text-warning\"]"));
		String claimStatus = null;

		for (WebElement statusOnCloseTask : claimStatusOnCloseTask) {
			claimStatus = statusOnCloseTask.getText();
			if (claimStatus.equals("Pending")) {

				break;
			}
		}
		return claimStatus;
	}

	public boolean verifyClosetaskWarningDialogBoxDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(closeTaskWarningDialogMsg);
			displayStatus = closeTaskWarningDialogMsg.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	
	
	public void clickOnVerifyBtnOfClaimVerification()
	{
		click(verifyButtonOfClaimVerification);
	}
	
	public boolean verifyClaimVerificationLabelDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(claimVerificationLabel);
			displayStatus = claimVerificationLabel.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnClaimVerificationSubmitBtn()
	{
		click(claimVerificationSubmitBtn);
	}
	
	public boolean verifyClaimVerificationErrorToastForClaimStatusFieldDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(claimVerificationErrorToastMsgForStatus);
			displayStatus = claimVerificationErrorToastMsgForStatus.isDisplayed();
		} catch (Exception e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void waitInvisibilityOfErrorToastMsgForClaimVefClaimStatusField()
	{
		waitInVisibilityOf(claimVerificationErrorToastMsgForStatus);
	}
	
	public void clickOnClaimVerificationCancelBtn()
	{
		try
		{
		click(claimVerificationCancelBtn);
		}catch(Exception e)
        {
        	
        }
	}
	
	public void clickOnClaimVerificationCrossIcon()
	{
		try
		{
		click(claimVerificationCrossIcon);
		}catch(Exception e)
        {
        	
        }
	}
	
	public int getRowsCountOfSpecificClaim()
	{
		 WaitVisibliltyOfLocated(By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr"));
		return rowsCountOfSpecificClaim.size();
	}
	
	public int getPointsValueOfClaimVerification(int rowIndex)
	{
		//Points 
		 By pointsLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[3]");
		 WaitVisibliltyOfLocated(pointsLocator);
        String pointsValue=driver.findElement(pointsLocator).getText();
        return Integer.parseInt(pointsValue.replace(",", ""));
			 
	}
	
	public int getClaimedQtyOfClaimVerification(int rowIndex)
	{
		By claimedQtyLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[4]");
		WaitVisibliltyOfLocated(claimedQtyLocator);
		String qtyValue=driver.findElement(claimedQtyLocator).getText();
		return Integer.parseInt(qtyValue.replace(",", ""));
			 
	}
	
	public int getClaimedPointsOfClaimVerification(int rowIndex)
	{
	By claimedPointsLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[5]");
	WaitVisibliltyOfLocated(claimedPointsLocator);
	String claimedPointsValue=driver.findElement(claimedPointsLocator).getText();
	System.out.println(claimedPointsValue);
	claimedPointsValue = claimedPointsValue.replace(",", "");  
	double claimedPoints = Double.parseDouble(claimedPointsValue);
	//int claimedPointsInt = (int) claimedPoints;  // Truncate decimal part
	int roundedPoints = (int) Math.round(claimedPoints);  // Round to nearest integer
	return roundedPoints;
	}
	
	public void enterQtyInVerifyQtyFieldOfClaimVerification(int rowIndex, String claimQty)
	{
		By enterQtyLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[6]/input");
		WaitVisibliltyOfLocated(enterQtyLocator);
		WebElement enterQtyElement=driver.findElement(enterQtyLocator); 
		enterQtyElement.click();
		enterQtyElement.clear();
		enterQtyElement.sendKeys(claimQty);
			
	}
	
	public int getEnteredClaimQtyOfClaimVerification(int rowIndex)
	{
		By verifyQtyLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[6]/input");
		WaitVisibliltyOfLocated(verifyQtyLocator);
		 String enteredQtyValue=driver.findElement(verifyQtyLocator).getAttribute("value");
		 return Integer.parseInt(enteredQtyValue.replace(",", ""));
	}
	
	
	public boolean verifyClaimVerificationErrorToastForClaimMaxQtyDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(claimVerificationErrorToastMsgForMaxClaimedQty);
			displayStatus = claimVerificationErrorToastMsgForMaxClaimedQty.isDisplayed();
		} catch (Exception e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void waitInvisibilityOfErrorToastMsgForClaimVefClaimMaxQty()
	{
		waitInVisibilityOf(claimVerificationErrorToastMsgForMaxClaimedQty);
	}
	
//	public void selectClaimVerificationStatus(int rowIndex, String claimStatusValue) throws InterruptedException
//	{
//	   //click on status dropdown
//		By statusFieldLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[8]/div/div/div[2]");
//		WaitVisibliltyOfLocated(statusFieldLocator);
//		click(driver.findElement(statusFieldLocator));
//	
//		waitVisibilityOfList(claimStatusDropValues);
//		
//		for(WebElement claimStatusElement :claimStatusDropValues)
//		{
//			Thread.sleep(3000);
//			String statusValue=claimStatusElement.getText();
//			if(statusValue.equals(claimStatusValue))
//			{
//				System.out.println("Selected Claim Status Value : "+statusValue);
//				Thread.sleep(2000);
//				claimStatusElement.click();
//				break;
//			}
//		}
//			
//	
//	}
//	
	public void selectClaimVerificationStatus(int rowIndex, String claimStatusValue) throws InterruptedException
	{
		
    By statusFieldLocator = By.xpath("//div[@class='px-2']/div/table/tbody/tr[" + rowIndex + "]/td[8]/div/div/div[2]");
    WaitVisibliltyOfLocated(statusFieldLocator);
    Thread.sleep(2000);
    click(driver.findElement(statusFieldLocator));
    // Retry logic for handling stale element exceptions
    int attempts = 0;
    boolean statusSelected = false;

    while (attempts < 3 && !statusSelected) {
        try {
        
            List<WebElement> claimStatusElements =claimStatusDropValues;
            for (WebElement claimStatusElement : claimStatusElements) {
            	Thread.sleep(2000);
                String statusValue = claimStatusElement.getText();
                if (statusValue.equals(claimStatusValue)) {
                	Thread.sleep(2000);
                    claimStatusElement.click();
                    statusSelected = true; // Status is successfully selected
                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            // If a stale element reference exception occurs, try again
            System.out.println("StaleElementReferenceException: Retrying to locate the element...");
            attempts++;
            Thread.sleep(1000); // Sleep before retrying
        } catch (Exception e) {
            System.err.println("An error occurred while selecting the claim status: " + e.getMessage());
            break;
        }
    }

    if (!statusSelected) {
    	clickOnClaimVerificationCrossIcon();
        //throw new RuntimeException("Failed to select the claim status after 3 attempts.");
        
        
    }
}
	
	
	public boolean verifyClaimVerificationSelectReasonFieldDisplay(int rowIndex) {
		boolean displayStatus = false;

		try {
			By reasonLocator = By
					.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr[" + rowIndex + "]/td[9]/div/div/div/div[1]");
			Thread.sleep(2000);
			displayStatus = driver.findElement(reasonLocator).isDisplayed();
		} catch (Exception e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
//	public void selectRejectReasonofClaimVerification(int rowIndex, String rejectReason) throws InterruptedException
//	{
//		
//	    By reasonLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[9]/div/div/div/div[1]");
//	    WaitVisibliltyOfLocated(reasonLocator);
//		click(driver.findElement(reasonLocator));
//		//DropDown Locator
//		waitVisibilityOfList(rejectReasonDropValues);
//		List<WebElement> rejectReasonElements=rejectReasonDropValues;
//		
//			for(WebElement rejectReasonElement :rejectReasonElements)
//			{
//				rejectReasonElements=rejectReasonDropValues;
//				Thread.sleep(3000);
//				String reasonValue=rejectReasonElement.getText();
//				Thread.sleep(2000);
//				if(reasonValue.contains(rejectReason))
//				{
//					System.out.println("Selected Reason Value : "+reasonValue);
//					Thread.sleep(3000);
//				     click(rejectReasonElement);
//				     break;
//				}
//			}
//		}
//	
	
	public void selectRejectReasonofClaimVerification(int rowIndex, String rejectReason) throws InterruptedException {
	    By reasonLocator = By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr[" + rowIndex + "]/td[9]/div/div/div/div[1]");
	    
	    // Wait for the reason dropdown to be visible and clickable
	    WaitVisibliltyOfLocated(reasonLocator);
	    Thread.sleep(2000);
	    click(driver.findElement(reasonLocator));
	    
	    // Wait for the dropdown list to become visible
	    waitVisibilityOfList(rejectReasonDropValues);

	    // Retry logic to handle StaleElementReferenceException
	    int attempts = 0;
	    boolean reasonSelected = false;

	    while (attempts < 3 && !reasonSelected) {
	        try {
	            // Re-locate the reject reason elements each time
	            List<WebElement> rejectReasonElements = rejectReasonDropValues;
	            
	            // Iterate through the options in the dropdown
	            for (WebElement rejectReasonElement : rejectReasonElements) {
	            	 Thread.sleep(2000); 
	                String reasonValue = rejectReasonElement.getText();
	               

	                if (reasonValue.contains(rejectReason)) {
	                    System.out.println("Selected Reason Value : " + reasonValue);
	                    Thread.sleep(2000); 
	                    click(rejectReasonElement); // Click on the matching reason
	                    reasonSelected = true; // Set flag to true once the reason is selected
	                    break;
	                }
	            }
	        } catch (StaleElementReferenceException e) {
	            // If we catch StaleElementReferenceException, retry
	            System.out.println("StaleElementReferenceException: Retrying to locate the reject reason dropdown options...");
	            attempts++;
	            Thread.sleep(1000); // Wait before retrying
	        } catch (Exception e) {
	            // Handle any other exceptions (if needed)
	            System.err.println("Error while selecting reject reason: " + e.getMessage());
	            break; // Exit loop if other exceptions occur
	        }
	    }

	    // If not selected after 3 attempts, throw an error
	    if (!reasonSelected) {
	    	clickOnClaimVerificationCrossIcon();
	        //throw new RuntimeException("Failed to select reject reason after 3 attempts.");
	    }
	}

	
	public void enterClaimVerificationRemark(int rowIndex, String claimRemark)
	{
		By remarkLocator=By.name("CLAIMS["+(rowIndex-1)+"].REMARK");
			WaitVisibliltyOfLocated(remarkLocator);
			driver.findElement(remarkLocator).sendKeys(claimRemark);
	}
	
	
	public String getVerifyQtyOfClaimVerification(int rowIndex)
	{
	//Verify Qty locator
	 By verifyQtyLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[6]/input");
	return driver.findElement(verifyQtyLocator).getAttribute("value");
	}
	
	public String getTotalVerifyPointsOfClaimVerification(int rowIndex)
	{
	//Verify Points locator
	 By verifyPointsLocator=By.xpath("//div[@class=\"px-2\"]/div/table/tbody/tr["+rowIndex+"]/td[7]");
	return driver.findElement(verifyPointsLocator).getText();
	
	}
	
	public boolean verifyClaimVerificationErrorToastForReasonFieldDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(claimVerificationErrorToastMsgForRejectReasonField);
			displayStatus = claimVerificationErrorToastMsgForRejectReasonField.isDisplayed();
		} catch (Exception e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void waitInvisibilityOfErrorToastMsgForClaimVefReasonField()
	{
		waitInVisibilityOf(claimVerificationErrorToastMsgForRejectReasonField);
	}
	
	
	public String getClaimVefDetailsClaimId(int rowIndex)
	{
		By claimId=By.xpath("//*[@id='getClaimVerifyDetails']/div/div/div/div[2]/div/table/tbody/tr["+rowIndex+"]/td[1]");
		WaitVisibliltyOfLocated(claimId);
		return driver.findElement(claimId).getText().replaceAll("\\s", "");
	}
	
	public String getClaimVefDetailsClaimDate(int rowIndex)
	{
		By claimDate=By.xpath("//*[@id='getClaimVerifyDetails']/div/div/div/div[2]/div/table/tbody/tr["+rowIndex+"]/td[2]");
		WaitVisibliltyOfLocated(claimDate);
		return driver.findElement(claimDate).getText();
	}
	
	public String getClaimVefDetailsCustomerName(int rowIndex)
	{
		By customerName=By.xpath("//*[@id='getClaimVerifyDetails']/div/div/div/div[2]/div/table/tbody/tr["+rowIndex+"]/td[3]");
		WaitVisibliltyOfLocated(customerName);
		return driver.findElement(customerName).getText();
	}
	
	public String getClaimVefDetailsCustomerMobileNo(int rowIndex)
	{
		By customerMobileNo=By.xpath("//*[@id='getClaimVerifyDetails']/div/div/div/div[2]/div/table/tbody/tr["+rowIndex+"]/td[4]");
		WaitVisibliltyOfLocated(customerMobileNo);
		return driver.findElement(customerMobileNo).getText();
	}
	
	public String getClaimVefDetailsClaimStatus()
	{
		By claimStatus=By.xpath("//*[@id='getClaimVerifyDetails']/div/div/div/div[2]/div/table/tbody/tr[1]/td[5]/label");
		WaitVisibliltyOfLocated(claimStatus);
		return driver.findElement(claimStatus).getText();
	}
	
	public String getClaimVerificationClaimId()
	{
	    waitVisibilityOf(claimVerificationLabel);
	    String inputString = claimVerificationLabel.getText();
	    String outputString = null;
	    
	    // Regular expression to capture the claim ID starting with "C" and followed by digits
	    String regex = "(C\\d+)";  // Capture "C" followed by digits
	    
	    // Create a Pattern object
	    Pattern pattern = Pattern.compile(regex);
	    
	    // Create a matcher object
	    Matcher matcher = pattern.matcher(inputString);
	    
	    // If a match is found, extract and return it
	    if (matcher.find()) {
	        outputString = matcher.group(0);  // Extract the matched claim ID (C252194)
	        System.out.println("ClaimVerificationClaimId : " + outputString);
	    }
	    
	    return outputString;
	}

	
	public String getClaimVerificationClaimDate()
	{
		waitVisibilityOf(claimVerificationDate);
		return claimVerificationDate.getText();
	}
	
	public String getClaimVerificationCustomerName()
	{
		waitVisibilityOf(claimVerificationLabel);
		String inputString =claimVerificationLabel.getText();
	    String outputString=null;
        String regex = "\\( (.*?) \\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()) {
        	outputString = matcher.group(1);
        }
        return outputString;
		
	}
	
	
	public String getClaimVerificationInfluencerName()
	{
		waitVisibilityOf(claimVerificationInfluencerName);
		String name=claimVerificationInfluencerName.getText();
		String[] parts = name.split(":");
	     String inflName = parts[1].trim();
		return inflName;
		
	}
	
	public String getClaimVerificationInfluencerMobileNo()
	{
		waitVisibilityOf(claimVerificationInfluencerMobileNo);
		String mobileNo=claimVerificationInfluencerMobileNo.getText();
		 String[] parts = mobileNo.split("-");
	     String inflMobileNo = parts[1].trim().replaceAll("\\s", "");
		return inflMobileNo;
		
	}
	
	public String getClaimVerificationTotalRecordsCount()
	{
		
		waitVisibilityOf(claimVerificationTotalRecors);
		
		String totalRecords=claimVerificationTotalRecors.getText();
		 String[] parts = totalRecords.split("-");
	     String count = parts[1].trim();
		return count;
		
		
	}
	
	public String getOpenedTaskInfluencerName()
	{
       waitVisibilityOf(openedTaskInfluncerName);
		
		String inflNameAndFirm=openedTaskInfluncerName.getText();
		 String[] parts = inflNameAndFirm.split("\\|");
	     String inflName = parts[0].trim();
		return inflName;
		
	}
	
	public String getOpenedTaskInfluencerMobileNo()
	{
         waitVisibilityOf(openedTaskInfluncerMobileNo);
		
		String mobileNo=openedTaskInfluncerMobileNo.getText();
		 String[] parts = mobileNo.split("-");
	     String inflMobileNo = parts[1].trim().replaceAll("\\s", "");
		return inflMobileNo;
		
	}
	
	public void clickOnVerifyButtonOfClaimVerification(int rowIndex)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		click(driver.findElement(By.xpath("//*[@id=\"getClaimVerifyDetails\"]/div/div/div/div[2]/div/table/tbody/tr["+rowIndex+"]/td[6]/button")));
		
	}
	

	public boolean verifyTotalVerifyPointsOfClaimVerification(int rowIndex)
	{
              boolean status=false;
	           
	           int points = getPointsValueOfClaimVerification(rowIndex);
				 System.out.println("Claim Verification Points :" +points);
				 
				 int enteredClaimedQty= getEnteredClaimQtyOfClaimVerification(rowIndex);
				 System.out.println("Claim Verification Claimed Qty  :" +enteredClaimedQty);
				 
				double pointsAndQty= (points*enteredClaimedQty);
				System.out.println("points * Qty :"+pointsAndQty);
				double decimalClaimedPoints= pointsAndQty/1000;
				
				System.out.println("decimalClaimedPoints :"+decimalClaimedPoints);
				int expectedClaimedPoints =(int) Math.round(decimalClaimedPoints);
				System.out.println("Expected Claimed Points : "+expectedClaimedPoints);
				 

				String actualPointsValue=getTotalVerifyPointsOfClaimVerification(rowIndex);
				actualPointsValue= actualPointsValue.replace(",", "");
				double claimPoints = Double.parseDouble(actualPointsValue);
				//int claimedPointsInt = (int) claimPoints;  // Truncate decimal part
				int actualClaimPoints = (int) Math.round(claimPoints);  // Round to nearest integer
				System.out.println("Verify actual Claim Points : "+actualClaimPoints);
			
				if(actualClaimPoints==expectedClaimedPoints)
				{
					status=true;
				}
			
			return status;
				
		 }
	
	public boolean verifyClaimVerificationSuccessPopupDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(claimVerificationSuccessPopup);
			displayStatus = claimVerificationSuccessPopup.isDisplayed();
		} catch (Exception e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnClaimVerificationSuccessPopupOkBtn()
	{
		click(claimVerificationSuccessPopupOkBtn);
	}
	
	public void clickOnClaimVerificationSubmitBreakBtn()
	{
		click(claimVerificationSubmitBreakBtn);
	}

	public void clickOnInflVerificationVerificationBtn()
	{
		waitVisibilityOf(inflVerificationVerificationBtn);
		click(inflVerificationVerificationBtn);
	}
	
	public boolean verifyInfluencerVerificationMenuDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(influencerVerificationMenu);
			displayStatus = influencerVerificationMenu.isDisplayed();
		} catch (Exception e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnInfluencerVerificationMenu()
	{
		waitVisibilityOf(influencerVerificationMenu);
		click(influencerVerificationMenu);
	}
	
	public boolean verifyInfluencerVerificationMenuLabelDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(influencerVerificationMenuLabel);
			displayStatus = influencerVerificationMenuLabel.isDisplayed();
		} catch (Exception e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnInfluencerVerificationMenuSubmitBtn()
	{
		waitVisibilityOf(influencerVerificationMenuSubmitBtn);
		click(influencerVerificationMenuSubmitBtn);
	}
	
	public void clickOnInfluencerVerificationMenuSubmitBreakBtn()
	{
		waitVisibilityOf(influencerVerificationMenuSubmitBreakBtn);
		click(influencerVerificationMenuSubmitBreakBtn);
	}
	
	public void clickOnInfluencerVerificationMenuCancelBtn() {
		try {
			waitVisibilityOf(influencerVerificationMenuCancelBtn);
			click(influencerVerificationMenuCancelBtn);
		} catch (Exception e) {

		}
	}
	
	public void clickOnInfluencerVerificationMenuCrossIcon()
	{
		try
		{
		click(influencerVerificationMenuCrossIcon);
		}catch(Exception e)
		{
			
		}
	}
	
	public void clickOnInfluencerVerificationPopUpCrossIcon()
	{
		try
		{
		click(influencerVerificationPopUpCrossIcon);
		}catch(Exception e)
		{
			
		}
	}

	public boolean verifyIinfluencerVerificationMenuConstructionBussFieldWarningMsgDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(influencerVerificationMenuYearsInBussinessFieldWarningMsg);
			displayStatus = influencerVerificationMenuYearsInBussinessFieldWarningMsg.isDisplayed();
		} catch (Exception e) {
			displayStatus = false;
		}
		return displayStatus;
	}
    
	public WebElement influencerVerificationMenuYearsInBussinessFieldWarningMsg()
	{
		waitVisibilityOf(influencerVerificationMenuYearsInBussinessFieldWarningMsg);
		return influencerVerificationMenuYearsInBussinessFieldWarningMsg;
	}
	
	public WebElement influencerVerificationMenuNoOfMasonsFieldWarningMsg()
	{
		waitVisibilityOf(influencerVerificationMenuNoOfMasonsFieldWarningMsg);
		return influencerVerificationMenuNoOfMasonsFieldWarningMsg;
	}
	
	public WebElement influencerVerificationMenuCurrentSitesNoFieldWarningMsg()
	{
		waitVisibilityOf(influencerVerificationMenuCurrentSitesNoFieldWarningMsg);
		return influencerVerificationMenuCurrentSitesNoFieldWarningMsg;
	}
	
	public WebElement influencerVerificationMenuSitesPerYearFieldWarningMsg()
	{
		waitVisibilityOf(influencerVerificationMenuSitesPerYearFieldWarningMsg);
		return influencerVerificationMenuSitesPerYearFieldWarningMsg;
	}
	
	public WebElement influencerVerificationMenuBrandUsedFieldWarningMsg()
	{
		try
		{
		waitVisibilityOf(influencerVerificationMenuBrandUsedFieldWarningMsg);
		
		}catch(Exception e)
		{
			
		}
		return influencerVerificationMenuBrandUsedFieldWarningMsg;
	}
	
	public WebElement influencerVerificationMenuMostPreferredBrandFieldWarningMsg()
	{
		waitVisibilityOf(influencerVerificationMenuMostPreferredBrandFieldWarningMsg);
		return influencerVerificationMenuMostPreferredBrandFieldWarningMsg;
	}
	
	public WebElement influencerVerificationMenuStatusFieldWarningMsg()
	{
		waitVisibilityOf(influencerVerificationMenuStatusFieldWarningMsg);
		return influencerVerificationMenuStatusFieldWarningMsg;
	}
	
	
	public void enterTextInInfluencerVerificationYearsInBussField(String yearsInBuss)
	{
		waitVisibilityOf(influencerVerificationMenuYearsInBussField);
		 influencerVerificationMenuYearsInBussField.sendKeys(yearsInBuss);
	}
	
	public void enterTextInInfluencerVerificationNoOfMasonsField(String noOfMasons)
	{
		 waitVisibilityOf(influencerVerificationMenuNoOfMasonsField);
		 influencerVerificationMenuNoOfMasonsField.sendKeys(noOfMasons);
	}
	
	public void enterTextInInfluencerVerificationCurrentSitesNoField(String currentSitesNo)
	{
		waitVisibilityOf(influencerVerificationMenuCurrentNoSitesField);
		 influencerVerificationMenuCurrentNoSitesField.sendKeys(currentSitesNo);
	}
	
	public void enterTextInInfluencerVerificationSitesPerYearField(String sitesPerYear)
	{
		waitVisibilityOf(influencerVerificationMenuNoOfSiteYearField);
		 influencerVerificationMenuNoOfSiteYearField.sendKeys(sitesPerYear);
	}
	
	
	public void selectInfluencerVerificationBrandUsedDropdownValue(String brandUsed) throws InterruptedException
	{
		waitVisibilityOf(influencerVerificationMenuBrandUsedField);
		click(influencerVerificationMenuBrandUsedField);
		
		// Retry logic for handling stale element exceptions
	    int attempts = 0;
	    boolean statusSelected = false;

	    while (attempts < 3 && !statusSelected) {
	        try {
	        
	            List<WebElement> brandUsedDropDownElements =inflVerificationBrandUsedDropDownValues;
	            for (WebElement brandUsedDropDownElement : brandUsedDropDownElements) {
	            	Thread.sleep(2000);
	                String brandUsedDropdownValue = brandUsedDropDownElement.getText();
	                if (brandUsedDropdownValue.equals(brandUsed)) {
	                	Thread.sleep(2000);
	                	brandUsedDropDownElement.click();
	                	statusSelected = true; // Status is successfully selected
	                	 break;
	                	 
	                }
	            }
	        } catch (StaleElementReferenceException e) {
	            // If a stale element reference exception occurs, try again
	            System.out.println("StaleElementReferenceException: Retrying to locate the element...");
	            attempts++;
	            Thread.sleep(1000); // Sleep before retrying
	        } catch (Exception e) {
	            System.err.println("An error occurred while selecting the BrandUsedDropdownValue: " + e.getMessage());
	            break;
	        }
	    }
	   
	    
	}   
	    
	

	public void selectInfluencerVerificationMostPreBrandDropdownValue(String mostPreferredBrand) throws InterruptedException
	{
		waitVisibilityOf(influencerVerificationMenuMostPreferredBrandField);
		click(influencerVerificationMenuMostPreferredBrandField);
		
		// Retry logic for handling stale element exceptions
	    int attempts = 0;
	    boolean statusSelected = false;

	    while (attempts < 3 && !statusSelected) {
	        try {
	        
	            List<WebElement> mostPreferredBrandDropDownElements =inflVerificationMostPreferredBrandDropDownValues;
	            for (WebElement mostPreferredBrandDropDownElement : mostPreferredBrandDropDownElements) {
	            	Thread.sleep(2000);
	                String  mostPreferredBrandDropdownValue = mostPreferredBrandDropDownElement.getText();
	                if ( mostPreferredBrandDropdownValue.equals( mostPreferredBrand)) {
	                	Thread.sleep(2000);
	                	mostPreferredBrandDropDownElement.click();
	                	statusSelected = true;
	                	 break;
	                }
	            }
	        } catch (StaleElementReferenceException e) {
	            // If a stale element reference exception occurs, try again
	            System.out.println("StaleElementReferenceException: Retrying to locate the element...");
	            attempts++;
	            Thread.sleep(1000); // Sleep before retrying
	        } catch (Exception e) {
	            System.err.println("An error occurred while selecting the MostPreBrandDropdownValue: " + e.getMessage());
	            break;
	        }
	    }
	    
	}   
	
	public void selectInfluencerVerificationStatusDropdownValue(String status) throws InterruptedException
	{
		waitVisibilityOf(influencerVerificationMenuStatusField);
		click(influencerVerificationMenuStatusField);
		
		// Retry logic for handling stale element exceptions
	    int attempts = 0;
	    boolean statusSelected = false;

	    while (attempts < 3 && !statusSelected) {
	        try {
	        
	            List<WebElement> statusDropDownElements =inflVerificationStatusDropDownValues;
	            for (WebElement statusDropDownElement : statusDropDownElements) {
	            	Thread.sleep(2000);
	                String  statusDropdownValue = statusDropDownElement.getText();
	                if ( statusDropdownValue.equals( status)) {
	                	Thread.sleep(2000);
	                	statusDropDownElement.click();
	                	statusSelected = true;
	                	 break;
	                }
	            }
	        } catch (StaleElementReferenceException e) {
	            // If a stale element reference exception occurs, try again
	            System.out.println("StaleElementReferenceException: Retrying to locate the element...");
	            attempts++;
	            Thread.sleep(1000); // Sleep before retrying
	        } catch (Exception e) {
	            System.err.println("An error occurred while selecting the StatusDropdownValue: " + e.getMessage());
	            break;
	        }
	    }
	    
	}   
	
	
	 public boolean verifyInfluencerVerificationSuccessPopUpDisplay()
		{
			boolean displayStatus = false;
			
			try {
				waitVisibilityOf(influencerVerificationSuccessPopUp);
				displayStatus = influencerVerificationSuccessPopUp.isDisplayed();
			} catch (Exception e) {
				displayStatus = false;
			}
			return displayStatus;
		}
	 
	 
	 public void clickOnInfluencerVerificationSuccessPopUpOkBtn()
		{
			click(influencerVerificationSuccessPopUpOkBtn);
		}
	 
	 public boolean verifyInfluencerVerificationTaskNoPopUpDisplay()
		{
			boolean displayStatus = false;
			
			try {
				waitVisibilityOf(telePageTaskNo);
				displayStatus = telePageTaskNo.isDisplayed();
			} catch (Exception e) {
				displayStatus = false;
			}
			return displayStatus;
		}
	 
	
}
	
